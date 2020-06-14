package minesweeper.gameelements;

public class Tile {

	private Status status;
	private int number;
	
	private boolean wrong;
	
	public Tile() {
		status = Status.UNKNOWN;
		number = 0;
		wrong = false;
	}

	/**Puts a flag on the tile*/
	public void flag() {
		this.status=Status.FLAGGED;
	}
	
	/**If the tile has a flag it is removed*/
	public void unflag() {
		if(this.status == Status.FLAGGED) status = Status.UNKNOWN;
	}
	
	/**Checks if tile's status is "FLAGGED"*/
	public boolean isFlagged() {
		return this.status == Status.FLAGGED;
	}
	
	/**Checks if tile's status is "OPEN"*/
	public boolean isOpen() {
		return this.status == Status.OPEN;
	}
	
	/**Checks if tile's content is "MINE"*/
	public boolean hasMine() {
		return number == -1;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	/**Open tile*/
	public void open() {
		this.status = Status.OPEN;
	}

	/**Tile can only be opened if it doesn't contain a mine and its status is 'UNKNOWN'*/
	public boolean canOpen() {
		return number>=0 && status==Status.UNKNOWN;
	}
	
	/**Checks if tile is flagged but has no mine*/
	public boolean isWrong() {
		return number!=-1 && status==Status.FLAGGED && wrong==true;
	}
	
	/**Tells MapGenerator if it should tell the player if the flag is wrong*/
	public void displayWrong(boolean d) {
		this.wrong=d;
	}
	
	private enum Status {
		UNKNOWN,
		OPEN,
		FLAGGED;
	}
}
