package com.ktdsuniversity.edu.game;

public class GameInfo3 {

	public final int WORD_LENGTH = 2;
	
	public final String LAST_LATTER = "기";
	
	private String answerWord;
	
	private int wordCount;
	
	private StringBuffer usedWords;
	
	public GameInfo3() {
		this.wordCount = 0;
		this.answerWord = "";
		this.usedWords = new StringBuffer();
	}
	
	public void inputAnswerWord(String answerWord) {
		this.answerWord = answerWord;
	}
	
	public boolean isEnoughLength() {
		return this.answerWord.length() >= this.WORD_LENGTH;
	}
	
	public boolean isLastLetter() {
		return this.answerWord.endsWith(this.LAST_LATTER);
	}
	
	public void addCount() {
		this.wordCount++;
	}
	
	public void addUsedWords() {
		this.usedWords.append(answerWord);
		this.usedWords.append("\n");
	}
	
	public void gameOver() {
		System.out.println("게임이 종료 되었습니다.");
		System.out.println("이어나간 단어의 수: " + this.wordCount + "개");
		
		System.out.println("이어나간 단어들 목록");
		System.out.println(this.usedWords.toString());
	}
}
