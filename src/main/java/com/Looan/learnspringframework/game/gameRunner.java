package com.Looan.learnspringframework.game;

public class gameRunner {
	MarioGame game;

	public gameRunner(MarioGame game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();

	}
}
