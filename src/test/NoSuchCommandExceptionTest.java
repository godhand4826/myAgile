package test;

import static org.junit.Assert.*;

import java.lang.Exception;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import source.NoSuchCommandException;

public class NoSuchCommandExceptionTest {

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

	//test NoSuchCommandException constructor
	@Test
	public final void testNoSuchCommandException() {
		NoSuchCommandException noSuchCommandException= new NoSuchCommandException();
		assertNotNull(noSuchCommandException);
		assertTrue(noSuchCommandException instanceof Exception);
		assertEquals("«ü¥O¿ù¤F!", noSuchCommandException.getMessage());
	}
}
