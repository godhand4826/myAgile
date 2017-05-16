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
import source.IGradeSystem;
import source.IGradeSystemAdaptor;
import source.NoSuchCommandException;
import source.NoSuchIDException;
import source.Ui;

public class UiTest {
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

	//test Ui constructor
	@Test(timeout = 1000)
	public final void testUi() throws NoSuchIDException, NoSuchCommandException {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		String input = "Q\r\n";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		new Ui();
	}

	
	//test CheckId true
	@Test
	public final void testCheckId() throws NoSuchIDException {
		IGradeSystem iGradeSystemAdaptor = new IGradeSystemAdaptor() {
			@Override
			public boolean containsId(String id) {
				return true;
			}
		};
		Ui ui = new Ui(iGradeSystemAdaptor);
		assertTrue(ui.checkId("kaldsfj"));
	}

	//test CheckId false
	@Test(expected = NoSuchIDException.class)
	public final void testCheckId2() throws NoSuchIDException {
		IGradeSystem iGradeSystemAdaptor = new IGradeSystemAdaptor() {
			@Override
			public boolean containsId(String id) {
				return false;
			}
		};
		Ui ui = new Ui(iGradeSystemAdaptor);
		ui.checkId("kals;jfkldjf;");
	}

	//test PromptCommand input G
	@Test
	public final void testPromptCommand() throws NoSuchCommandException {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		String input = "G\r\n";
		System.setIn(new ByteArrayInputStream(input.getBytes()));

		IGradeSystem iGradeSystemAdaptor = new IGradeSystemAdaptor() {
			@Override
			public void showGrade(String id) {
				System.out
						.println("UiTest.testPromptCommand().new IGradeSystemAdaptor() {...}.showGrade()");
			}
		};

		Ui ui = new Ui(iGradeSystemAdaptor);
		ui.promptCommand();
		String expected = "輸入指令\t1) G 顯示成績 (Grade)\r\n"
				+ "\t2) R 顯示排名 (Rank)\r\n" + "\t3) W 更新配分 (Weight)\r\n"
				+ "\t4) E 離開選單 (Exit)\r\n";
		String expected2 = "UiTest.testPromptCommand().new IGradeSystemAdaptor() {...}.showGrade()\r\n";
		String expectedOutput = expected + expected2;
		assertEquals(expectedOutput, output.toString());
	}

	//test PromptCommand input R
	@Test
	public final void testPromptCommand2() throws NoSuchCommandException {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		String input = "R\r\n";
		System.setIn(new ByteArrayInputStream(input.getBytes()));

		IGradeSystem iGradeSystemAdaptor = new IGradeSystemAdaptor() {
			@Override
			public void showRank(String id) {
				System.out
						.println("UiTest.testPromptCommand2().new IGradeSystemAdaptor() {...}.showRank()");
			}
		};

		Ui ui = new Ui(iGradeSystemAdaptor);
		ui.promptCommand();
		String expected = "輸入指令\t1) G 顯示成績 (Grade)\r\n"
				+ "\t2) R 顯示排名 (Rank)\r\n" + "\t3) W 更新配分 (Weight)\r\n"
				+ "\t4) E 離開選單 (Exit)\r\n";
		String expected2 = "UiTest.testPromptCommand2().new IGradeSystemAdaptor() {...}.showRank()\r\n";
		String expectedOutput = expected + expected2;
		assertEquals(expectedOutput, output.toString());
	}

	//test PromptCommand input W
	@Test
	public final void testPromptCommand3() throws NoSuchCommandException {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		String input = "W\r\n";
		System.setIn(new ByteArrayInputStream(input.getBytes()));

		IGradeSystem iGradeSystemAdaptor = new IGradeSystemAdaptor() {
			@Override
			public void updateWeight() {
				System.out
						.println("UiTest.testPromptCommand3().new IGradeSystemAdaptor() {...}.updateWeight()");
			}
		};

		Ui ui = new Ui(iGradeSystemAdaptor);
		ui.promptCommand();
		String expected = "輸入指令\t1) G 顯示成績 (Grade)\r\n"
				+ "\t2) R 顯示排名 (Rank)\r\n" + "\t3) W 更新配分 (Weight)\r\n"
				+ "\t4) E 離開選單 (Exit)\r\n";
		String expected2 = "UiTest.testPromptCommand3().new IGradeSystemAdaptor() {...}.updateWeight()\r\n";
		String expectedOutput = expected + expected2;
		assertEquals(expectedOutput, output.toString());
	}

	//test PromptCommand input E
	@Test
	public final void testPromptCommand4() throws NoSuchCommandException {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		String input = "E\r\n";
		System.setIn(new ByteArrayInputStream(input.getBytes()));

		IGradeSystem iGradeSystemAdaptor = new IGradeSystemAdaptor();

		Ui ui = new Ui(iGradeSystemAdaptor);
		ui.promptCommand();
		String expected = "輸入指令\t1) G 顯示成績 (Grade)\r\n"
				+ "\t2) R 顯示排名 (Rank)\r\n" + "\t3) W 更新配分 (Weight)\r\n"
				+ "\t4) E 離開選單 (Exit)\r\n";
		String expectedOutput = expected;
		assertEquals(expectedOutput, output.toString());
	}

	@Test(expected = NoSuchCommandException.class)
	public final void testPromptCommand5() throws NoSuchCommandException {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		String input = "A\r\n";
		System.setIn(new ByteArrayInputStream(input.getBytes()));

		Ui ui = new Ui(null);
		ui.promptCommand();
	}

	//test PromptId
	@Test
	public final void testPromptId() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));

		Ui ui = new Ui(null);
		ui.promptId();
		assertEquals("輸入ID或Q(結束使用)?\r\n", output.toString());
	}

	//test ShowFinishMsg
	@Test
	public final void testShowFinishMsg() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));

		Ui ui = new Ui(null);
		ui.showFinishMsg();
		assertEquals("結束了\r\n", output.toString());
	}

	//test ShowWellcomeMsg
	@Test
	public final void testShowWellcomeMsg() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));

		Ui ui = new Ui(new IGradeSystemAdaptor() {
			@Override
			public Grade getGrade(String id) {
				return new Grade(id, "士兵87", 10, 30, 60, 50, 90);
			}
		});
		ui.showWelcomeMsg("123");
		assertEquals("Welcome 士兵87\r\n", output.toString());
	}

}