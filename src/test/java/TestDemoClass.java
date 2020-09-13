
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class TestDemoClass {

	@Test
	public void testCube() {
		assertEquals(27,DemoClass.cube(3));
	}

	@Test
	public void testAdd() {
		assertEquals(15,DemoClass.add(10,5));
	}

	@Test
	public void testFindMax() {
		assertEquals(100,DemoClass.findMax(new int[] {20,10,5,4,2}));
	}

	@Test
	public void testReverseWord() {
		assertEquals("mahbuhS",DemoClass.reverseWord("Shubham"));
	}

	@Test
	public void testFindMin() {
		assertEquals(1,DemoClass.findMin(new int[] {10,23,5,1,23}));
	}
}