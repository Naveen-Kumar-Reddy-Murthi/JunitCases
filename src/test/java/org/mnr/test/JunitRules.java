package org.mnr.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;

public class JunitRules {
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

	@Test
	public void throwIllegalArgumentExceptionIfConIsNull() {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Negative Value not allowed");
		TestClass tester = new TestClass();
		tester.test(-1);
		
	}
	
	@Test
	public void testUsingTemporaryFolder() throws IOException{
		
		File createdFolder = folder.newFolder("New Folder");
		File createFile    = folder.newFile("myfile.txt");
		assertTrue(createFile.exists());
		
		
	}
	
	class TestClass{
		
		public void test(int i) throws IllegalArgumentException{
			 if(i<0)
				 throw new IllegalArgumentException("Negative Value not allowed");
		}
	}

}
