package moueza.htmling_java;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/** no empty line */
	public String tablingNoempty(String strr) {
		List<String> linesColl = new ArrayList<String>(null);

		// https://codegym.cc/fr/groups/posts/la-methode-string-split-en-java*/
		String[] words = strr.split(" ");
		for (String word : words) {
			System.out.println(word);
		}

		return "";
	}

	public String tablingEmpty(String strr) {
		return "";
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.tablingNoempty("3  5");

	}

}
