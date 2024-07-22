package com.ktdsuniversity.edu.game;

import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		GameInfo2 gameInfo2 = new GameInfo2();
		
		System.out.println("\"나\"로 시작하는 두 글자 이상의 단어를 입력하세요.");
		
		while(true) {
			String answerWord= keyboard.nextLine();
			
			gameInfo2.inputAnswerWord(answerWord);
			
			boolean isEnoughLength = gameInfo2.isEnoughLength();
			if(!isEnoughLength) {
				break;
			}
			
			boolean isStartLetter = gameInfo2.isStartLetter();
			if(!isStartLetter) {
				break;
			}
			
			gameInfo2.addCount();
			
		}
		gameInfo2.gameOver();
	}
}
