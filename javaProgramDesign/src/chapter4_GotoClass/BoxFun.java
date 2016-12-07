package chapter4_GotoClass;

import java.awt.Color;
import java.awt.Window;
import java.io.*;

import javax.swing.JFrame;

public class BoxFun {
	//程序入口
	public static void main(String[] args) throws IOException {
		//创建一个对象并初始化
		ColorRectangle colorRectangle = new ColorRectangle();
		
		//提示用户输入并监听
		System.out.println("Enter when you ready:");
		System.in.read();
		
		//进行绘图
		colorRectangle.paint();
		colorRectangle.setColor(Color.RED);
		colorRectangle.rotateClockwise();
		colorRectangle.paint();
		
		System.out.println(colorRectangle.getArea());
		System.out.println(colorRectangle.getPerimeter());
	}
}
