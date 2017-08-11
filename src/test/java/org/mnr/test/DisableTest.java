/**
 * 
 */
package org.mnr.test;

import static org.junit.Assert.*;

import org.junit.Assume;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;

/**
 * @author nmurthi
 *
 */
public class DisableTest {

	@Test
	@Disabled("disabled")
	public void disableTest(){
		assertEquals("test", "test");
		
	}
	
	@Test
//	@Disabled("disabled")
	public void disableTest1(){
		Assume.assumeFalse(System.getProperty("os.name").contains("Linux"));// this means test is disabled
		
	}

}
