package chapter4_GotoClass;

import java.awt.Image;

import javax.swing.*;

public class TwoWindows {
	//程序入口
	public static void main(String[] args) {
		JFrame window1 = new JFrame("Bigger");
		JFrame window2 = new JFrame("Smaller");
		
		window1.setSize(200, 125);
		window2.setSize(100, 75);
		
		ImageIcon imageIcon = new ImageIcon("C:\\icon.png");
		Image image = imageIcon.getImage();
		window1.setIconImage(image);
		
		window1.setVisible(true);
		window2.setVisible(true);
	}
}
