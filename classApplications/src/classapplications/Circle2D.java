/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classapplications;

/**
 *
 * @author guven
 */
public class Circle2D {
    double x;
    double y;
    double radius;
    
    Circle2D(){
        x = 0;
        y = 0;
        radius = 0;
    }
    
    Circle2D(double newx, double newy, double newRadius){
        x = newx;
        y = newy;
        radius = newRadius;
    }
    
    public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getRadius() {
		return radius;
	}
    
    double getArea(double radius){
        return radius * radius * Math.PI;
    }
    
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    
    private double distance(double x, double y) {
		return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
	}
    
    boolean contains(double x, double y){
      return distance(x, y) <= radius;
    }
    
    boolean contains(Circle2D circle){
    if (!contains(circle.getX(), circle.getY())) {
			return false;
		} else {
			return circle.getRadius() < (this.getRadius() - distance(circle.getX(), circle.getY()));
		}
    }
    
    boolean overlaps(Circle2D circle){
    if (contains(circle.getX(), circle.getY())) {
			return true;
		} else {
			return this.radius + circle.getRadius() < distance(circle.getX(), circle.getY());
		}
    }
}
