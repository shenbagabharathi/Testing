package com.TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Task05_d9 {
  @Test
  public void FirstMethod() {
	  Assert.assertEquals(true, false);
  }
  
  @Test
  public void SecondMethod() {
	  Assert.assertEquals(true, true);
  }
  
}