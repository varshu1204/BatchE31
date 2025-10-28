package Practice1;

import org.testng.annotations.Test;

public class SampleTest {

	@Test(groups = "smoke")
	public void appleTest()
	{
		System.out.println("apple tested");
		System.out.println("Grapes tested");
	}
}
