import java.awt.Color;

/**
 * The Circle class models a circle with a radius and a color.
 * It also allows calculation of the area.
 * 
 * @author YourName
 */
public class Circle {
    /** Radius of the circle */
    private double radius;

    /** Color of the circle */
    private Color color;

    /** Area of the circle */
    private double area;

    /**
     * Default constructor.
     * Sets radius to 1.0 and color to a predefined color.
     */
    public Circle() {
        radius = 1.0;
        this.color = new Color(255, 119, 65);
    }

    /**
     * Constructs a circle with a given radius and color.
     * 
     * @param r    the radius of the circle
     * @param clr  the color of the circle
     */
    public Circle(double r, Color clr) {
        radius = r;
        color = clr;
    }

    /**
     * Returns the radius of the circle.
     * 
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Returns the color of the circle.
     * 
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Returns the area of the circle.
     * Calls calculateArea internally if needed.
     * 
     * @return the area
     */
    public double getArea() {
        calculateArea();
        return area;
    }

    /**
     * Computes the area of the circle.
     */
    private void calculateArea() {
        area = radius * radius * Math.PI;
    }
}
