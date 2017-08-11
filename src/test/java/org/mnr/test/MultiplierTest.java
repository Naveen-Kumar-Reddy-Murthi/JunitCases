/**
 * 
 */
package org.mnr.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runners.MethodSorters;
import org.mnr.utils.Multiplier;

/**
 * @author nmurthi
 *
 */

//@FixMethodOrder(MethodSorters.DEFAULT)
//@FixMethodOrder(MethodSorters.JVM)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MultiplierTest {
	
	@Before
	public void before(){
		System.out.println("before executed");
	}
	@After
	public void after(){
		System.out.println("after executed");
	}
	
	@BeforeClass
	public static void beforeClass(){
		
		System.out.println("beforeClass executed");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("after class executed");
	}
	
	@BeforeAll
	
	public void beforeAll(){
		System.out.println("beforeAll executed");
	}
	
	
	@BeforeEach
	public void beforeEach(){
		System.out.println("beforeEach executed");
	}
	
	@AfterAll
	public void afterAll(){
		System.out.println("afterAll executed");
	}
	
	@AfterEach
	public void afterEach(){
		System.out.println("afterEach executed");
	}
	
	@Test
//	@Ignore // igonres the test
	public void multiplicationOfZeroIntegersShouldReturnZero() {
		
		Multiplier tester = new Multiplier();
		assertEquals("0*10 should be zero", 0, tester.multiply(0, 10));
		assertEquals("10*1 should be zero", 0, tester.multiply(10, 0));
		assertEquals("0*0 should be zero", 0, tester.multiply(0, 0));
	}
	
	@Test(expected=Exception.class)
	public void exceptionTest() throws Exception{
		
		throw new Exception("wrong error");
	}
	
	@Test(timeout=30)
	public void timeOutTest() throws InterruptedException{
		
		Thread.sleep(30);
	}

}
