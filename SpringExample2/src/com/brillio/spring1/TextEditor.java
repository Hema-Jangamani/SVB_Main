package com.brillio.spring1;

import com.brillio.spring1.SpellChecker;

public class TextEditor {
	
	private SpellChecker spellChecker;

	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor constructor");
		this.spellChecker = spellChecker;
	}
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	
}
