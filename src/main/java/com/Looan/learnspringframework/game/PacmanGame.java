package com.Looan.learnspringframework.game;

public class PacmanGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Up Side");

	}

	@Override
	public void down() {
		System.out.println("Down Side");

	}

	@Override
	public void left() {
		System.out.println("Left Side");

	}

	@Override
	public void right() {
		System.out.println("Right Side");

	}

}
