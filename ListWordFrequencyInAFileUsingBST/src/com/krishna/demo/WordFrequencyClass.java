package com.krishna.demo;

public class WordFrequencyClass {
	private String word;
	private int frequency;
	
	public WordFrequencyClass() {
		super();
	}
	
	public WordFrequencyClass(String word) {
		super();
		this.word = word;
		this.frequency = 1;
	}
	
	@Override
	public String toString() {
		return "WordFrequencyClass [word=" + word + ", frequency=" + frequency + "]";
	}

	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	
	
}
