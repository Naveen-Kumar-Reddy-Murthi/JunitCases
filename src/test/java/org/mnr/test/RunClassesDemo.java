package org.mnr.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunClassesDemo {
	
	public static void main(String...args){
		
		Result result = JUnitCore.runClasses(MultiplierTest.class,AdderTest.class);
		
		for(Failure failure : result.getFailures())
			System.out.println(failure.toString());
		
	}

}
