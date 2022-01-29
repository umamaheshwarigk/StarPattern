package org.test.in;

public class PrintString {

	public static void main(String[] args) {
		String input = "Text in a box by uma";
		String[] inputs = input.split(" ");
		int maxLength = 0;
		// find maxLength
		for (String word : inputs) {
		if (maxLength < word.length()) {
		maxLength = word.length();
		}
		}

		// Print starts
		// first line star
		System.out.println(printStar(maxLength + 4));
		// format: *<space>inputWord<space>*
		for (String word : inputs) {
		System.out.println(printStar(1) + printWhitespace(1) + word + printWhitespace(maxLength - word.length())
		+ printWhitespace(1) + printStar(1));
		}
		// last line star
		System.out.println(printStar(maxLength + 4));
		}

		private static String printStar(int starsLength) {
		String stars = "";
		for (int i = 0; i < starsLength; i++) {
		stars += "*";
		}
		return stars;
		}

		private static String printWhitespace(int whitespacelength) {
		String whitespace = "";
		for (int i = 0; i < whitespacelength; i++) {
		whitespace += " ";
		}
		return whitespace;
		}
		}