package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import source.NoSuchIDException;

public class NoSuchIDExceptionTest {

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

	//test NoSuchIDException constructor
	@Test
	public final void testNoSuchIDException() {
		NoSuchIDException noSuchIDException = new NoSuchIDException();
		assertNotNull(noSuchIDException);
		assertTrue(noSuchIDException instanceof Exception);
		assertEquals("ID¿ù¤F!", noSuchIDException.getMessage());
	}

}
