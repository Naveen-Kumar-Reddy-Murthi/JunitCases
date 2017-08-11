/**
 * 
 */
package org.mnr.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;

/**
 * @author Naveen Reddy
 *
 */
public class Junit5Features {
	@Test
	@RepeatedTest(5)
	public void test() {
		assertTrue(true);
	}

}
