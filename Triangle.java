/* Triangle
 * This program will:
 *     create a class Triangle
 *     get the 3 sides of the triangle
 *     calculate the perimeter of the triangle
 *     calculate the area of the trianlge
 *     extend the SimpleGeometricObject class
 */

public class Triangle extends SimpleGeometricObject{
    // declare the sides
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;


    Triangle() {
    }

    // pass the values of the sides given to the sides in this object
    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public double getSide1() {
        return side1;
    } 
    
    public double getSide2() {
        return side2;
    } 
        
    public double getSide3() {
         return side3;
    } 
    
    // calculate the perimeter
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // calculate the area
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
    
    // holds the print values of the sides
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
        " side3 = " + side3;
    }

}
