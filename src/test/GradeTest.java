package test;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import source.Grade;

public class GradeTest {

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

	//test Grade constructor
	@Test
	public final void testGrade() {
		Grade grade = new Grade();
		assertNotNull(grade);
	}

	//test Grade constructor
	@Test
	public final void testGradeStringStringIntIntIntIntInt() {
		Grade grade = new Grade("13556974", "���j��", 0, 10, 20, 30, 40);
		assertNotNull(grade);
	}

	//test GetId
	@Test
	public final void testGetId() {
		Grade grade = new Grade("13556974", "���j��", 0, 10, 20, 30, 40);
		assertEquals("13556974", grade.getId());
	}

	//test SetId
	@Test
	public final void testSetId() {
		Grade grade = new Grade("13556974", "���j��", 0, 10, 20, 30, 40);
		grade.setId("46316166");
		assertEquals("46316166", grade.getId());
	}

	//test GetName
	@Test
	public final void testGetName() {
		Grade grade = new Grade("13556974", "���j��", 0, 10, 20, 30, 40);
		assertEquals("���j��", grade.getName());
	}

	//test SetName
	@Test
	public final void testSetName() {
		Grade grade = new Grade("13556974", "���j��", 0, 10, 20, 30, 40);
		grade.setName("�p�m��");
		assertEquals("�p�m��", grade.getName());
	}

	//test GetLab1
	@Test
	public final void testGetLab1() {
		Grade grade = new Grade("13556974", "���j��", 0, 10, 20, 30, 40);
		assertEquals(0, grade.getLab1());
	}

	//test SetLab1
	@Test
	public final void testSetLab1() {
		Grade grade = new Grade("13556974", "���j��", 0, 10, 20, 30, 40);
		grade.setLab1(55);
		assertEquals(55, grade.getLab1());
	}

	//test GetLab2
	@Test
	public final void testGetLab2() {
		Grade grade = new Grade("13556974", "���j��", 0, 10, 20, 30, 40);
		assertEquals(10, grade.getLab2());
	}

	//test SetLab2
	@Test
	public final void testSetLab2() {
		Grade grade = new Grade("13556974", "���j��", 0, 10, 20, 30, 40);
		grade.setLab2(55);
		assertEquals(55, grade.getLab2());
	}

	//test GetLab3
	@Test
	public final void testGetLab3() {
		Grade grade = new Grade("13556974", "���j��", 0, 10, 20, 30, 40);
		assertEquals(20, grade.getLab3());
	}

	//test SetLab3
	@Test
	public final void testSetLab3() {
		Grade grade = new Grade("13556974", "���j��", 0, 10, 20, 30, 40);
		grade.setLab3(55);
		assertEquals(55, grade.getLab3());
	}

	//test GetMidTerm
	@Test
	public final void testGetMidTerm() {
		Grade grade = new Grade("13556974", "���j��", 0, 10, 20, 30, 40);
		assertEquals(30, grade.getMidTerm());
	}

	//test SetMidTern
	@Test
	public final void testSetMidTern() {
		Grade grade = new Grade("13556974", "���j��", 0, 10, 20, 30, 40);
		grade.setMidTern(55);
		assertEquals(55, grade.getMidTerm());
	}

	///test GetFinalExam
	@Test
	public final void testGetFinalExam() {
		Grade grade = new Grade("13556974", "���j��", 0, 10, 20, 30, 40);
		assertEquals(40, grade.getFinalExam());
	}

	//test SetFinalExam
	@Test
	public final void testSetFinalExam() {
		Grade grade = new Grade("13556974", "���j��", 0, 10, 20, 30, 40);
		grade.setFinalExam(55);
		assertEquals(55, grade.getFinalExam());
	}

	//test GetTotalGrade
	@Test
	public final void testGetTotalGrade() {
		float[] weights = new float[] { 0.1f, 0.1f, 0.1f, 0.3f, 0.4f };
		float[] weights2= new float[] { 0.2f, 0.2f, 0.2f, 0.2f, 0.2f };
		float[] weights3= new float[] { 0.1f, 0.1f, 0.0f, 0.4f, 0.4f };
		Grade grade = new Grade("13556974", "���j��", 81, 98, 84, 90, 93);
		assertEquals(91, grade.getTotalGrade(weights));
		assertEquals(89, grade.getTotalGrade(weights2));
		assertEquals(91, grade.getTotalGrade(weights3));
	}

}
