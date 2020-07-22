package TestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import Junit.CalculatorDemo;
@TestInstance(Lifecycle.PER_CLASS)

class CalculatorDemoTest {
	static CalculatorDemo c;
	@BeforeAll
	public void init()
	{
		c=new CalculatorDemo();
		System.out.println("program started");
		
	}
	@BeforeEach
	public void BeforeEachTest()
	{
		System.out.println("test started");
	}
	@AfterEach
	public void AfterEachTest()
	{
		System.out.println("test completed");
	}
	@AfterAll
	public void Complete()
	{
		System.out.println("program completed");
	}

	@Test
	void testAdd() {
		assertEquals(43,c.add(21, 22));
	}

	@Test
	@EnabledOnOs(OS.WINDOWS)
	void testSub() {
		assertEquals(2,c.sub(23, 21));
	}

	@Test
	@Disabled
	void testMul() {
		assertEquals(30,c.mul(5, 5));
	}

	@Test
	void testDiv() {
		assertThrows(ArithmeticException.class,()->c.div(10, 0));
	}

}
