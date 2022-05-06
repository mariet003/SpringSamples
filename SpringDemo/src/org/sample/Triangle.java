package org.sample;

public class Triangle {
	
	String type;
	int height;
	


	public Triangle() {
		
	}

	public Triangle(String type) {
		super();
		this.type = type;
	}
	
	public Triangle(String type, int height) {
		super();
		this.type = type;
		this.height = height;
	}
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	void draw()
	{
		System.out.println(getType()+" triangle drawn with a height of "+getHeight());
	}

}
