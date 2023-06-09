package com.TestNg;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Task01_d9 {
	public class CalculatorData{
		CalculatorLogic cl=new CalculatorLogic();
	
  @Test(dataProvider = "addData")
  public void addMethod(int a,int b,int expected) {
	  int result=cl.add(a,b);
	  Assert.assertEquals(expected, result);
  }
  @Test(dataProvider = "subData")
	  public void subMethod(int a1,int b1,int expected1) {
		  int result1=cl.sub(a1,b1);
		  Assert.assertEquals(expected1, result1);
  }
  @Test(dataProvider = "mulData")
  public void mulMethod(int a2,int b2,int expected2) {
	  int result2=cl.mul(a2,b2);
	  Assert.assertEquals(expected2, result2);
  }
  @Test(dataProvider = "divData")
  public void divMethod(int a3,int b3,int expected3)
  {
	  int result3=cl.div(a3,b3);
	  Assert.assertEquals(expected3, result3);
  }
  @DataProvider
  public Object[][] addData(){
	  return new Object[][] {
		  {1,2,3},{2,2,4}
	  };
	 
	  
  }
  @DataProvider
  public Object[][] subData(){
	  return new Object[][] {
		  {5,2,3},{4,2,2}
	  };
  }
	  @DataProvider
	  public Object[][] mulData(){
		  return new Object[][] {
			  {5,2,10},{4,2,8}
		  };
	 
	  
  }
	  @DataProvider
	  public Object[][] divData(){
		  return new Object[][] {
		  {1,1,1},{4,2,4}
	  };
	  }
  
}
}