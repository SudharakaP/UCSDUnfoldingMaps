package module2;

import processing.core.PApplet;

/**
 * @author Sudharaka Palamakumbura
 *
 */
public class MyDisplay extends PApplet {
	public void setup(){
		size(400, 400);
		background(200,100,200);
	}
	
	public void draw(){
		fill(255, 255, 0);
		ellipse(200, 200, 390, 390);
		fill(0,0,0);
		ellipse(120, 120, 50, 50);
		ellipse(280, 120, 50, 50);
		noFill();
		arc(200, 280, 100, 100, 0, PI, OPEN);
	}
}
