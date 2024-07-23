package com.ktdsuniversity.edu.game;

import java.util.Scanner;

public class Game3 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		GameInfo3 gameInfo3 = new GameInfo3();
		
		System.out.println("\"기\"로 끝나는 두 글자 이상의 단어를 입력하세요.");
		System.out.println("중복 단어는 불가능합니다");
		
		while(true) {
			String answerWord = keyboard.nextLine().trim();
			
			gameInfo3.inputAnswerWord(answerWord);
			
			boolean isEnoughLength = gameInfo3.isEnoughLength();
			if(!isEnoughLength) {
				break;
			}
			
			boolean isLastLetter = gameInfo3.isLastLetter();
			if(!isLastLetter) {
				break;
			}
			
			boolean isSameLetter = gameInfo3.isSameLetter();
			if(isSameLetter) {
				System.out.println("중복 단어는 입력 하실 수 없습니다");
				break;
			}
			
			gameInfo3.addCount();
			
			gameInfo3.addUsedWords();
		}
		gameInfo3.gameOver();
	}
}
