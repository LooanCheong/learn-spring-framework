package com.Looan.learnspringframework;

import com.Looan.learnspringframework.game.PacmanGame;
import com.Looan.learnspringframework.game.GameRunner;

public class App01GamingBasicJava {

	public static void main(String[] args) {

		// var game = new MarioGame();
		// var game = new SuperContraGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
