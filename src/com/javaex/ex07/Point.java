package com.javaex.ex07;

public class Point {
	
	//Fields
	private int x,y;
	
	//Constructor
	public Point() {
		
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Getter / Setter

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		Point p = (Point) obj;
		if (this.getX() == p.getX()) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
	
	

}
