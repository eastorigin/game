package com.ktdsuniversity.edu.game;

public class GameInfo2 {

	public final int WORD_LENGTH = 2;
	
	private String answerWord;
	
	public final String FIRST_LETTER = "나";
	
	private int wordCount;
	
	public GameInfo2() {
		this.wordCount = 0;
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
	
	public void addCount() {
		this.wordCount++;
	}
	
	public void gameOver() {
		System.out.println("게임이 종료 되었습니다.");
		System.out.println("이어나간 단어의 수: " + this.wordCount + "개");
	}
}
