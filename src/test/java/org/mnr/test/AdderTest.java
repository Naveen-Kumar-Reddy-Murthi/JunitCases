/**
 * 
 */
package org.mnr.test;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.mnr.utils.Adder;
/**
 * 
 * @author Naveen Reddy
 *
 */

//@FixMethodOrder(MethodSorters.DEFAULT)
//@FixMethodOrder(MethodSorters.JVM)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AdderTest {

	@Test
	public void multiplicationOfZeroIntegersShouldReturnZero() {
		
		Adder tester = new Adder();
		assertEquals("2+2 should be 4", 4, tester.add(2,2));		
		
	}

}
