package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(189,159,191);
		StdDraw.filledRectangle(0.5,0.5,0.3,0.2);
		double[] x = {0.4, 0.6,0.5};
		double[] y = {0.4,0.4, 0.6};
		StdDraw.setPenRadius(0.05);
		StdDraw.setPenColor(128,169,191);
		StdDraw.polygon(x,y);
		
		
	}
}