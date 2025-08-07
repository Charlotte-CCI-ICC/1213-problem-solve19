import java.awt.Color;

/**
 * The {@code Circle} class represents a circle with a specific radius and color.
 * It includes methods to retrieve the radius, color, and computed area of the circle.
 * 
 * @author Nimota
 * @version Summer 25
 */
public class Circle {

    // Private instance variables
    private double radius;
    private Color color;
    private double area;

    /**
     * Default constructor that initializes the circle 
     * with a radius of 1.0 and a default color.
     */
    public Circle() {
        radius = 1.0;
        this.color = new Color(255, 119, 65);
    }

    /**
     * Constructor that initializes the circle with a given radius and color.
     *
     * @param r   the radius of the circle
     * @param clr the color of the circle
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
     * Calculates and returns the area of the circle.
     *
     * @return the area
     */
    public double getArea() {
        calculateArea();
        return area;
    }

    /**
     * Calculates the area of the circle using the formula: π × r²
     */
    private void calculateArea() {
        area = radius * radius * Math.PI;
    }
}
