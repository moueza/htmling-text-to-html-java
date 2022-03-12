package moueza.htmling_java;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/** no empty line */
	public String tablingNoempty(String strr) {
		List<String> linesColl = new ArrayList<String>();// .=null

		// https://codegym.cc/fr/groups/posts/la-methode-string-split-en-java*/
		// String[] words = strr.split(" +");
		String[] words = strr.split("\n+");

		// for (String word : words) {
		for (int cpt = 0; cpt <= (words.length - 1); cpt++) {
			System.out.println("line=" + cpt + " " + words[cpt]);
		}

		return "";
	}

	public String tablingEmpty(String strr) {
		return "";
	}

	public String spaces2html(String strr) {
		return "";
	}

	public String lines2html(String strr) {
		return "";
	}

	public String tablingTextNewlines(String strr) {
		return "";
	}

	public String indents2html(String strr) {
		return "";
	}

	public static void main(String[] args) {
		Main main = new Main();
		// String res= main.tablingNoempty("3 5");
		String res = main.tablingNoempty("3  5" + "\n8");// TODO // par ligne

	}

}
