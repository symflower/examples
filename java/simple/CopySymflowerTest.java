import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.*;
import static org.junit.Assert.*;

public class CopySymflowerTest {
	@Test // (expected = java.lang.NullPointerException.class)
	public void copy1() {
		java.lang.String[] from = null;
		java.lang.String[] to = null;
		java.lang.String[] actual = Copy.copy(from, to);
	}

	@Test
	public void copy2() {
		java.lang.String[] from = {  };
		java.lang.String[] to = null;
		java.lang.String[] expected = null;
		java.lang.String[] actual = Copy.copy(from, to);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test // (expected = java.lang.NullPointerException.class)
	public void copy3() {
		java.lang.String[] from = { null };
		java.lang.String[] to = null;
		java.lang.String[] actual = Copy.copy(from, to);
	}

	@Test // (expected = ArrayIndexOutOfBoundsException.class)
	public void copy4() {
		java.lang.String[] from = { "" };
		java.lang.String[] to = {  };
		java.lang.String[] actual = Copy.copy(from, to);
	}

	@Test
	public void copy5() {
		java.lang.String[] from = { "" };
		java.lang.String[] to = { "" };
		java.lang.String[] expected = { "" };
		java.lang.String[] actual = Copy.copy(from, to);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}
}
