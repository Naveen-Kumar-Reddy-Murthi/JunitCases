/**
 * 
 */
package org.mnr.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;

/**
 * @author Naveen Reddy
 *
 */
@RunWith(Parameterized.class)
public class ParameterizedTest {
	@Parameter(0)
	public int m1;
	@Parameter(1)
	public int m2;
	@Parameter(2)
	public int result;
	
//	public ParameterizedTest(int m1, int m2){
//		
//		this.m1=m1;
//		this.m2=m2;
//	}
	
	@Parameters
	public static Collection<Object[]> data(){
		Object[][] data= new Object[][] {{1,2,2},{5,2,10},{121,4,484}};
		
		return Arrays.asList(data);
		
	}

	@Test
	public void testMultiplyException() {
		MyClass tester = new MyClass();
		assertEquals("Result:", result, tester.multiply(m1, m2));
	}
	
	class MyClass {
        public int multiply(int i, int j) {
            return i *j;
        }
    }

}
