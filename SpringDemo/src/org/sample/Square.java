package org.sample;

public class Square {
	
	private Point A;
	private Point B;
	private Point C;
	private Point D;
	
	
	public Point getA() {
		return A;
	}
	public void setA(Point a) {
		A = a;
	}
	public Point getB() {
		return B;
	}
	public void setB(Point b) {
		B = b;
	}
	public Point getC() {
		return C;
	}
	public void setC(Point c) {
		C = c;
	}
	public Point getD() {
		return D;
	}
	public void setD(Point d) {
		D = d;
	}
	
	
	public void draw()
	{
		System.out.println("A= ("+A.getX()+","+A.getY()+")");
		System.out.println("B= ("+B.getX()+","+B.getY()+")");
		System.out.println("C= ("+C.getX()+","+C.getY()+")");
		System.out.println("D= ("+D.getX()+","+D.getY()+")");
	}

}
