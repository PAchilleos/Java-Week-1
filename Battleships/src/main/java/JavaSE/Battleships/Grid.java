package JavaSE.Battleships;

import java.util.ArrayList;

public class Grid {
	private int length;
	private int width;
	private ArrayList<Ship> S;
	
	
	public Grid(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public ArrayList<Ship> getS() {
		return S;
	}


	public void setS(ArrayList<Ship> s) {
		S = s;
	}
	
	
	public void addship(Ship s) {  //adds a ship to the grid
		S.add(s);
	}
	
	public void remship(Ship s) { //removes ship from grid
		S.remove(s);
	}
	
	public int numsh() { //retrieves number of ships on grid once the game starts
		int size = S.size();
		if (size ==0) {
			System.out.println("You Lose!"); //lose if no ships on board
		}
		return size;
	}
	

}
