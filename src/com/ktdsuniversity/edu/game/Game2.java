package com.ktdsuniversity.edu.game;

import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		GameInfo2 gameInfo2 = new GameInfo2();
		
		System.out.println("\"나\"로 시작하는 두 글자 이상의 단어를 입력하세요.");
		System.out.println("중복 단어는 불가능합니다");
		
		while(true) {
			String answerWord= keyboard.nextLine().trim();
			
			gameInfo2.inputAnswerWord(answerWord);
			
			boolean isEnoughLength = gameInfo2.isEnoughLength();
			if(!isEnoughLength) {
				break;
			}
			
			boolean isStartLetter = gameInfo2.isStartLetter();
			if(!isStartLetter) {
				break;
			}
			
			boolean isSameLetter = gameInfo2.isSameLetter();
			if(isSameLetter) {
				System.out.println("중복 단어는 입력 하실 수 없습니다");
				break;
			}
			
			gameInfo2.addCount();
			
			gameInfo2.addUsedWords();
			
		}
		gameInfo2.gameOver();
	}
}
