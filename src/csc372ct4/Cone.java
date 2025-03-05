package csc372ct4;
import java.lang.Math;


public class Cone extends Shape {

	private double radius;
	private double height;

	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	public double surface_area() {
		return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
	}

	public double volume() {
		return (1.0/3.0) * Math.PI * Math.pow(radius, 2) * height;
	}

	public String toString() {
		return String.format("<Cone: radius = %f, height = %f>", this.radius, this.height);
	}

}
