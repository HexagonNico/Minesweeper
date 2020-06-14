package minesweeper;

import minesweeper.gui.DisplayManager;

public class Main {

	public static void main(String[] args) {
		System.out.println("[Main]: Starting...");
		DisplayManager.createWindow();
		DisplayManager.addMainMenu();
		DisplayManager.startGame();
		System.out.println("[Main]: Game Started");
	}
}
