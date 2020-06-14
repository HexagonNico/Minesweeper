package minesweeper.utils;

import java.awt.Graphics2D;

import minesweeper.gameelements.Grid;

public class MapGenerator {
	
	/**Draws a grid of green tiles*/
	public void drawGrayTiles(Graphics2D g, Grid grid) {
		for(int h=0;h<grid.getHeight();h++) {
			for(int w=0;w<grid.getWidth();w++) {
				switch(grid.getTile(h, w).getNumber()) {
				case -1:
					g.drawImage(ResourceManager.tileMine, w*36, h*36, 36, 36, null); break;
				case 0:
					g.drawImage(ResourceManager.tileOpen, w*36, h*36, 36, 36, null); break;
				case 1:
					g.drawImage(ResourceManager.tileOne, w*36, h*36, 36, 36, null); break;
				case 2:
					g.drawImage(ResourceManager.tileTwo, w*36, h*36, 36, 36, null); break;
				case 3:
					g.drawImage(ResourceManager.tileThree, w*36, h*36, 36, 36, null); break;
				case 4:
					g.drawImage(ResourceManager.tileFour, w*36, h*36, 36, 36, null); break;
				case 5:
					g.drawImage(ResourceManager.tileFive, w*36, h*36, 36, 36, null); break;
				case 6:
					g.drawImage(ResourceManager.tileSix, w*36, h*36, 36, 36, null); break;
				case 7:
					g.drawImage(ResourceManager.tileSeven, w*36, h*36, 36, 36, null); break;
				case 8:
					g.drawImage(ResourceManager.tileEight, w*36, h*36, 36, 36, null); break;
				default:
					break;
				}
			}
		}
	}
	
	/**Draws a grid of green tiles*/
	public void drawGreenTiles(Graphics2D g, Grid grid) {
		for(int h=0;h<grid.getHeight();h++) {
			for(int w=0;w<grid.getWidth();w++) {
				if(!grid.getTile(h, w).isOpen())
					g.drawImage(ResourceManager.tile, w*36, h*36, 36, 36, null);
				if(grid.getTile(h, w).isFlagged())
					g.drawImage(ResourceManager.flaggedTile, w*36, h*36, 36, 36, null);
				if(grid.getTile(h, w).isWrong())
					g.drawImage(ResourceManager.wrongFlag, w*36, h*36, 36, 36, null);
			}
		}
	}
}
