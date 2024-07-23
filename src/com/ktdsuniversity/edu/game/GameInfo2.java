package com.ktdsuniversity.edu.game;

public class GameInfo2 {

	public final int WORD_LENGTH = 2;
	
	public final String FIRST_LETTER = "나";
	
	private String answerWord;
	
	private int wordCount;
	
	private StringBuffer usedWords;
	
	public GameInfo2() {
		this.wordCount = 0;
		this.usedWords = new StringBuffer();
		this.answerWord = "";
	}
	
	public void inputAnswerWord(String answerWord) {
		this.answerWord = answerWord;
	}
	
	public boolean isEnoughLength() {
		return this.answerWord.length() >= this.WORD_LENGTH;
	}
	
	public boolean isStartLetter() {
		return this.answerWord.startsWith(this.FIRST_LETTER);
	}
	
	public boolean isSameLetter() {
		return this.usedWords.toString().contains(this.answerWord);
		// toString()으로 변환 후 contains 가능
	}
	
	public void addCount() {
		this.wordCount++;
	}
	
	public void addUsedWords() {
		this.usedWords.append(this.answerWord);
		this.usedWords.append("\n");
	}
	
	public void gameOver() {
		System.out.println("게임이 종료 되었습니다.");
		System.out.println("이어나간 단어의 수: " + this.wordCount + "개");
		
		System.out.println("이어나간 단어들 목록");
		System.out.println(this.usedWords.toString());
	}
}
