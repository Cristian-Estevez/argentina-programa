import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PruebaModelo {
	
	// los dos siguientes se ejecutan una sola vez
	@BeforeClass 
	public static void setUpFirst() {
		System.out.println("SetUpFirst");
	}
	
	@AfterClass
	public static void tearDownLast() {
		System.out.println("TearDownLast");
	}
	
	//before y after se ejecutan antes y despues de cada una de los metodos de test
	@Before 
	public void setUp() {
		System.out.println("SetUp");
	}

	@After
	public void tearDown() {
		System.out.println("TearDown");
	}
	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}

	@Test 
	public void test2() {
		System.out.println("Test 2");
	}
}
