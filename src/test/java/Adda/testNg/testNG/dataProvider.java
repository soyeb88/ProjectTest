package Adda.testNg.testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	
	@DataProvider(name="addMethodDataProvider")	
	
	public Object[][] dataProviderExample(){
		
		return new Object[][] { {1,2,3},
								{2,3,5},
								{4,5,2}
							  }; 
		
	}

	@Test(dataProvider="addMethodDataProvider")
	public void testAddMethod(int a, int b, int result) {
		int actResult = a + b;
		
		Assert.assertEquals(actResult, result);
	}
	
}
