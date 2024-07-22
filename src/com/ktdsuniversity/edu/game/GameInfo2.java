package com.ktdsuniversity.edu.game;

public class GameInfo2 {

	public final int WORD_LENGTH = 2;
	
	private String answerWord;
	
	private String firstLetter;
	
	private int wordCount;
	
	public GameInfo2() {
		this.firstLetter = "나";
	}
	
	public void inputAnswerWord(String answerWord) {
		this.answerWord = answerWord;
	}
	
	public boolean isEnoughLength() {
		return this.answerWord.length() >= this.WORD_LENGTH;
	}
	
	public boolean isStartLetter() {
		return this.answerWord.startsWith(this.firstLetter);
	}
	
	public void addCount() {
		this.wordCount++;
	}
	
	public void gameOver() {
		System.out.println("게임이 종료 되었습니다.");
		System.out.println("이어나간 단어의 수: " + this.wordCount + "개");
	}
}
