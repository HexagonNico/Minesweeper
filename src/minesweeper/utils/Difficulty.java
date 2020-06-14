package minesweeper.utils;

public enum Difficulty {

	EASY("Easy", 9, 9, 10),
	NORMAL("Normal", 16, 16, 40),
	HARD("Expert", 30, 16, 99);
	
	private String name;
	private int width;
	private int height;
	private int minesCount;
	
	private Difficulty(String name, int width, int height, int minesCount) {
		this.name=name; this.width=width; this.height=height; this.minesCount=minesCount;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getMinesCount() {
		return minesCount;
	}

	public String getName() {
		return name;
	}
}
