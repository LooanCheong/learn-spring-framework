package com.Looan.learnspringframework;

import com.Looan.learnspringframework.game.MarioGame;
import com.Looan.learnspringframework.game.gameRunner;

public class AppGamingBasicJava {

	public static void main(String[] args) {

		var marioGame = new MarioGame();
		var gameRunner = new gameRunner(marioGame);
		gameRunner.run();

	}

}
