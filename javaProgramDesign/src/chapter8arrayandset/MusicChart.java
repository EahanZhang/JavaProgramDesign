package chapter8arrayandset;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JFrame;

public class MusicChart {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		JFrame mWindow = new JFrame("Music Preference");
		mWindow.setSize(450, 300);
		mWindow.setVisible(true);
		mWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = mWindow.getContentPane();
		container.setBackground(Color.WHITE);
		
		Graphics graphics = container.getGraphics();
		
		double[] choice = { 3.2, 10.5, 3.4, 12.1, 11.4, 6.7, 24.4,
				10.6, 17.7 };
			
		String[] genre = { "Classic", "Country", "Jazz", "Pop", 
				"Rap and Hip-Hop", "Religious", "Rock", 
				"Urban and R&B", "Other" };
		
		System.out.println("Enter any key when you ready:");
		System.in.read();
		
		PieChart chart = new PieChart(choice, genre);
		chart.paint(graphics);
	}

}
