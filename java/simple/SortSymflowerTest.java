import org.junit.*;
import static org.junit.Assert.*;

public class SortSymflowerTest {
	@Test // (expected = java.lang.NullPointerException.class)
	public void IsSorted6() {
		int[] a = null;
		boolean actual = Sort.IsSorted(a);
	}

	@Test
	public void IsSorted7() {
		int[] a = {  };
		boolean expected = false;
		boolean actual = Sort.IsSorted(a);

		assertEquals(expected, actual);
	}

	@Test
	public void IsSorted8() {
		int[] a = { 0 };
		boolean expected = true;
		boolean actual = Sort.IsSorted(a);

		assertEquals(expected, actual);
	}

	@Test
	public void IsSorted9() {
		int[] a = { 0, -2147483648 };
		boolean expected = false;
		boolean actual = Sort.IsSorted(a);

		assertEquals(expected, actual);
	}

	@Test
	public void IsSorted10() {
		int[] a = { 0, 0 };
		boolean expected = true;
		boolean actual = Sort.IsSorted(a);

		assertEquals(expected, actual);
	}
}
