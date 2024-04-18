package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class fail {
	
	@Test
	public void returnFail() {
		Assert.assertTrue(false);
	}

}
