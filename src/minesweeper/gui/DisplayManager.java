package minesweeper.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import minesweeper.utils.Difficulty;
import minesweeper.utils.ResourceManager;

public class DisplayManager {

	private static int windowWidth;
	private static int windowHeight;
	
	private static JFrame window;
	private static JPanel mainMenu;
	private static JPanel gameBoard;
	
	/**Creates a JFrame window*/
	public static void createWindow() {
		window = new JFrame("Minesweeper :D");
		window.setBounds(100, 50, windowWidth, windowHeight);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		System.out.println("[DisplayManager]: Created window");
	}
	
	/**Initializes a MainMenu and adds it to the JFrame*/
	public static void addMainMenu() {
		mainMenu = new MainMenu();
		windowWidth = 580;
		windowHeight = 300;
		if(gameBoard!=null) window.remove(gameBoard);
		window.setSize(windowWidth, windowHeight);
		window.add(mainMenu);
		mainMenu.requestFocusInWindow();
		System.out.println("[DisplayManager]: MainMenu added");
	}
	
	/**Initializes a GameBoard and adds it to the JFrame
	 * @param w - New window width
	 * @param h - New window height
	 * @param m - Number of mines
	 */
	public static void addGameBoard(Difficulty diff) {
		ResourceManager.init();
		gameBoard = new GameBoard(diff);
		windowWidth = diff.getWidth()*36+5;
		windowHeight = diff.getHeight()*36+30+60;
		window.remove(mainMenu);
		window.setSize(windowWidth, windowHeight);
		window.add(gameBoard);
		gameBoard.requestFocusInWindow();
		System.out.println("[DisplayManager]: GameBoard added");
	}
	
	/**Sets window visible*/
	public static void startGame() {
		window.setVisible(true);
	}

	public static int getWindowWidth() {
		return windowWidth;
	}

	public static int getWindowHeight() {
		return windowHeight;
	}
}
