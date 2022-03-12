package moueza.htmling_java;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void testTablingNo1with1line() {
		Main main = new Main();
		assertEquals(main.tablingNoempty("3  5"), "<table><tr><td>3</td><td>5</td></tr></table>");
	}

}
