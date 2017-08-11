/**
 * 
 */
package org.mnr.utils;

/**
 * @author Naveen Reddy
 *
 */
public class Adder {
	
	public int add(int ... a){
		int sum=0;
		for(int x: a)
			sum=sum+x;
		return sum;
	}

}
