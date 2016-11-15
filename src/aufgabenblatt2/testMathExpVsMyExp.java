package aufgabenblatt2;


import org.junit.*;
import java.lang.Math;
public class testMathExpVsMyExp {

		@Test
		public void testmyexp(){
			int x= 3;
			int n=18;
			Assert.assertEquals(Math.exp(x), exp.myexp(x,n),0.0000001);
	}

}
