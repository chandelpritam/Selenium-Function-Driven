package basicweb;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitIntroduction {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Execute Before Class ");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Execute After Class ");

	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Execute Before  ");

	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Execute After  ");

	}

	@Test
	public void test() {
		System.out.println("Executed Test1");
	}

}
