/**
 * @author sunshine
 */

package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WindChill implements ActionListener{
	//类常亮
	private static final int WINDOW_WIDTH = 350;
	private static final int WINDOW_HEIGHT = 185;
	private static final int FIELD_WIDTH = 20;
	private static final int AREA_WIDTH = 40;
	
	private static final FlowLayout LAYOUT_STYLE = new FlowLayout();
	
	private static final String LEGEND = "This windchill "
			+ "calculator is intended for velocities greater than 4 mph.";
	
	//实例变量
	//GUI 窗口
	private JFrame window = new JFrame("Windchill Calculator");
	
	//图例
	private JTextArea legendArea = new JTextArea(LEGEND, 2, AREA_WIDTH);
	
	//温度的用户输入区域
	private JLabel fahrTag = new JLabel("Fahrenheit temperature");
	private JTextField fahrText = new JTextField(FIELD_WIDTH);
	
	//风速的用户输入区域
	private JLabel windTag = new JLabel("      WindSpeed (mph)");
	private JTextField windText = new JTextField(FIELD_WIDTH);
	
	//温度结果的输入区域
	private JLabel chillTag = new JLabel(" Windchill temperature");
	private JTextField chillText = new JTextField(FIELD_WIDTH);
	
	//run button
	private JButton runButton = new JButton("Run");
	
	//构造方法
	public WindChill() {
		// TODO Auto-generated constructor stub
		//配置GUI
		window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		legendArea.setEditable(false);
		legendArea.setLineWrap(true);
		legendArea.setWrapStyleWord(true);
		legendArea.setBackground(window.getBackground());
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		 
	}
}
