package chapter5branchstatement;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.io.IOException;

import javax.swing.JFrame;

public class TriangularCat {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ColoredTriangle catBody = new ColoredTriangle(
				new Point(20, 100), new Point(190, 150),
				new Point(190, 65), Color.BLACK);
		
		ColoredTriangle catHead = new ColoredTriangle(
				new Point(190, 90), new Point(270, 90),
				new Point(230, 30), Color.YELLOW);
		
		ColoredTriangle catLeftEye = new ColoredTriangle(
				new Point(220, 50), new Point(215, 60),
				new Point(225, 60), Color.BLUE);
		
		ColoredTriangle catRightEye = new ColoredTriangle(
				new Point(240, 50), new Point(235, 60),
				new Point(245, 60), Color.BLUE);
		
		ColoredTriangle catMouth = new ColoredTriangle(
				new Point(215, 75), new Point(245, 80),
				new Point(245, 70), Color.BLUE);
		
		ColoredTriangle catBackLegs = new ColoredTriangle(
				new Point(20, 110), new Point(25, 160),
				new Point(15, 160), Color.GRAY);
		
		ColoredTriangle catFrontLegs = new ColoredTriangle(
				new Point(190, 150), new Point(195, 200),
				new Point(185, 200), Color.GRAY);
		
		JFrame window = new JFrame("Triangular cat");
		window.setSize(285, 250);
		window.setVisible(true);
		Graphics graphics = window.getGraphics();
		
		System.out.println("Enter anything when you ready:");
		System.in.read();
		
		catBody.paint(graphics);
		catHead.paint(graphics);
		catLeftEye.paint(graphics);
		catRightEye.paint(graphics);
		catMouth.paint(graphics);
		catFrontLegs.paint(graphics);
		catBackLegs.paint(graphics);
		
	}

}
