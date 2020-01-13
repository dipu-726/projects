package com.dipu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class TestClass {
	@Test
	public void testCheckUserName()
	{
		try 
		{
			verifyDetails obj1 = new verifyDetails("dipu","123");
			verifyDetails obj2 = new verifyDetails("Deepak","789");
			verifyDetails obj3 = new verifyDetails("Roahan","098");
			verifyDetails obj4 = new verifyDetails("Dipu@Saha","901");
			verifyDetails obj5 = new verifyDetails("dipu","001");
			
			assertEquals(true, obj1.verifyName() && obj1.verifyCvv()); //true
			assertEquals(true, obj2.verifyName() && obj2.verifyCvv()); //true
			assertEquals(true, obj3.verifyName() && obj3.verifyCvv()); //true
			assertEquals(true, obj4.verifyName() && obj4.verifyCvv()); //false
			assertEquals(true, obj5.verifyName() && obj5.verifyCvv()); //false
			
		}
		catch (Exception e) {
			//if any exception occurs, fails .
			fail();
		}
	}

}
