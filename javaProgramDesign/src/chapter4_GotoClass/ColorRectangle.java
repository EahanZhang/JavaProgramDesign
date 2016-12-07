package chapter4_GotoClass;

import javax.swing.*;
import java.awt.*;

public class ColorRectangle {
	//变量
	private int mWidth;
	private int mHeight;
	private int mX;
	private int mY;
	private JFrame mWindow;
	private Color mColor;
	
	public ColorRectangle() {
		// TODO Auto-generated constructor stub
		//设置矩阵的属性
		mWidth = 80;
		mHeight = 20;
		mX = 80;
		mY = 80;
		
		//设置窗口属性
		mWindow = new JFrame("ColorRectangle");
		mWindow.setSize(200, 200);
		mWindow.setVisible(true);
		
		//设置颜色
		mColor = Color.BLUE;
	}
	
	public ColorRectangle(int width, int height, int x, int y,
			JFrame window, Color color) {
		setWidth(width);
		setHeight(height);
		setX(x);
		setY(y);
		setWindow(window);
		setColor(color);
	}
	
	public void paint(Color color) {
		Graphics g = mWindow.getGraphics();
		g.setColor(color);
		g.fillRect(mX, mY, mWidth, mHeight);
		//g.fillRoundRect(mX, mY, mWidth, mHeight, mWidth/2, mHeight/2);
	}
	
	public void paint() {
		Graphics g = mWindow.getGraphics();
		g.setColor(mColor);
		g.fillRect(mX, mY, mWidth, mHeight);
		//g.fillRoundRect(mX, mY, mWidth, mHeight, mWidth/2, mHeight/2);
	}
	
	public void setWidth(int width) {
		mWidth = width;
	}
	
	public void setHeight(int height) {
		mHeight = height;
	}
	
	public void setX(int x) {
		mX = x;
	}
	
	public void setY(int y) {
		mY = y;
	}
	
	public void setWindow(JFrame window) {
		mWindow = window;
	}
	
	public void setColor(Color color) {
		mColor = color;
	}
	
    public int getWidth() {
		return mWidth;
	}
    
    public int getHeight() {
		return mHeight;
	}
    
    public int getX() {
		return mX;
	}
    
    public int getY() {
		return mY;
	}
    
    public JFrame getWindow() {
		return mWindow;
	}
    
    public Color getColor() {
		return mColor;
	}
    
    public int getArea() {
		return mX * mY;
	}
    
    public int getPerimeter() {
		return (mX + mY) * 2;
	}
    
    public void doubleSize() {
		mWidth *= 2;
		mHeight *= 2;
	}
    
    public void rotateClockwise() {
		int template = mWidth;
		mWidth = mHeight;
		mHeight = template;
	}
}
