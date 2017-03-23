package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import source.Main;

public class MainTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testMain() {
		try {
			Main.class.getMethod("main", String[].class);
		} catch (NoSuchMethodException e) {
			fail("main not exist!");
		} catch (SecurityException e) {
		}
	}

}
