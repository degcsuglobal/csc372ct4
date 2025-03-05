package csc372ct4;
import java.lang.Math;

public class Sphere extends Shape {
	private double radius; 
	
	public Sphere(double radius) {
		this.radius = radius;
	}

	public double surface_area() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}


	public double volume() {
		return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
	}

}
