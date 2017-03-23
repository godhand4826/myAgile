package test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import source.Grade;
import source.GradeSystem;

public class GradeSystemTest {

	static InputStream stdin;
	static PrintStream stdout;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		stdin = System.in;
		stdout = System.out;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
		// reset System.io
		System.setIn(stdin);
		System.setOut(stdout);
	}

	@Test
	public final void testGradeSystemConstructor() {
		GradeSystem g=new GradeSystem("/file/test.txt");
		Grade actualGrade1=g.getGrade("962001044");
		Grade actualGrade2=g.getGrade("962001051");
		
		assertEquals("Foo", actualGrade1.getName());
		assertEquals(87, actualGrade1.getLab1());
		assertEquals(86, actualGrade1.getLab2());
		assertEquals(98, actualGrade1.getLab3());
		assertEquals(88, actualGrade1.getMidTerm());
		assertEquals(87, actualGrade1.getFinalExam());
		
		assertEquals("Bar", actualGrade2.getName());
		assertEquals(81, actualGrade2.getLab1());
		assertEquals(98, actualGrade2.getLab2());
		assertEquals(84, actualGrade2.getLab3());
		assertEquals(90, actualGrade2.getMidTerm());
		assertEquals(93, actualGrade2.getFinalExam());
	}

	@Test
	public final void testContainsId() {
		GradeSystem g=new GradeSystem("/file/test.txt");
		assertTrue(g.containsId("962001044"));
		assertTrue(g.containsId("962001051"));
	}

	@Test
	public final void testShowGrade() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		
		GradeSystem g=new GradeSystem("/file/test.txt");
		String exceptOut1="BarGrade:lab1:\t\t81"+"\r\n"
				+ "\tlab2:\t\t98"+"\r\n"
				+ "\tlab3:\t\t84"+"\r\n"
				+ "\tmid-term:\t90"+"\r\n"
				+ "\tfinal exam:\t93"+"\r\n"
				+ "\ttotal grade:\t91"+"\r\n";
		
		g.showGrade("962001051");
		assertEquals(exceptOut1, output.toString());
	}

	@Test
	public final void testShowRank() {
		GradeSystem gradeSystem=new GradeSystem("/file/test.txt");
		
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		
		gradeSystem.showRank("962001051");
		assertEquals("BarRank:1\r\n", output.toString());
		output.reset();
		gradeSystem.showRank("962001044");
		assertEquals("FooRank:2\r\n", output.toString());
		
	}

	@Test
	public final void testUpdateWeight() {

		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));

		String input = "20\r\n20\r\n20\r\n20\r\n20\r\nY\r\n";
		System.setIn(new ByteArrayInputStream(input.getBytes()));

		String expected = "Old weight\r\n" + "\tlab1\t\t10%\r\n" + "\tlab2\t\t10%\r\n"
				+ "\tlab3\t\t10%\r\n" + "\tmid-term\t30%\r\n"
				+ "\tfinal exam\t40%\r\n" + "Enter new weight\r\n" + "\tlab1\t\t";
		String expected2 = "\tlab2\t\t\tlab3\t\t\tmid-term\t\tfinal exam\t";
		String expected3 = "confirm weight\r\n" + "\tlab1\t\t20%\r\n"
				+ "\tlab2\t\t20%\r\n" + "\tlab3\t\t20%\r\n"
				+ "\tmid-term\t20%\r\n" + "\tfinal exam\t20%\r\n"
				+ "Correct? Y/N\r\n";

		String expectedOutputs = expected + expected2 + expected3;

		GradeSystem gradeSystem = new GradeSystem();
		gradeSystem.updateWeight();
		assertEquals(expectedOutputs, output.toString());

	}
	
	@Test
	public final void testGetGrade() {
		GradeSystem gradeSystem=new GradeSystem("/file/test.txt");
		Grade actualGrade1=gradeSystem.getGrade("962001044");
		Grade actualGrade2=gradeSystem.getGrade("962001051");
		
		assertEquals("Foo", actualGrade1.getName());
		assertEquals(87, actualGrade1.getLab1());
		assertEquals(86, actualGrade1.getLab2());
		assertEquals(98, actualGrade1.getLab3());
		assertEquals(88, actualGrade1.getMidTerm());
		assertEquals(87, actualGrade1.getFinalExam());
		
		assertEquals("Bar", actualGrade2.getName());
		assertEquals(81, actualGrade2.getLab1());
		assertEquals(98, actualGrade2.getLab2());
		assertEquals(84, actualGrade2.getLab3());
		assertEquals(90, actualGrade2.getMidTerm());
		assertEquals(93, actualGrade2.getFinalExam());
	}

}
