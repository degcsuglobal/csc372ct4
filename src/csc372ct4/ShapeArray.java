package csc372ct4;

public class ShapeArray {

	public static void main(String[] args) {
		// Create one of each shape
		Sphere sphere = new Sphere(5);
		Cylinder cylinder = new Cylinder(5, 10);
		Cone cone = new Cone(5, 10);

		// Put in an array
		Shape shapeArray[] = {sphere, cylinder, cone};
		
		// Loop through and print
		for (int i = 0; i < shapeArray.length; i++) {
			System.out.printf("Shape %d/%d: %s\n", i+1, shapeArray.length, shapeArray[i].toString());
		}
	}
}
