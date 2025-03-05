package csc372ct4;
import java.lang.Math;

public class Cylinder extends Shape {
	private double radius;
	private double height; 
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height; 
	}

	public double surface_area() {
		return 0;
	}

	public double volume() {
		return 0;
	}
	
	public String toString() {
		return String.format("<Cylinder: radius = %f, height = %f>", this.radius, this.height);
	}

}
