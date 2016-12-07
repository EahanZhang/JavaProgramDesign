package chapter5branchstatement;

import javax.swing.*;
import java.awt.*;

public class ColoredTriangle {
	//属性
	private Point mPoint1;
	private Point mPoint2;
	private Point mPoint3;
	private Color mColor;
	
	
	//默认构造函数
	public ColoredTriangle() {
		// TODO Auto-generated constructor stub
		mPoint1 = new Point(1, 1);
		mPoint2 = new Point(2, 2);
		mPoint3 = new Point(3, 3);
		mColor = Color.BLACK;
	}
	
	//自定义构造函数
	public ColoredTriangle(Point point1, Point point2, Point point3, Color color) {
		mPoint1 = point1;
		mPoint2 = point2;
		mPoint3 = point3;
		mColor = color;
	}
	
	//设置属性
	public boolean setPoint(int i, Point point) {
		if (i == 1) {
			mPoint1 = point;
		} else if (i == 2) {
			mPoint2 = point;
		} else if (i == 3) {
			mPoint3 = point;
		} else {
			System.out.println("Wrong number " + i);
		}
		return true;
	}
	
	//设置颜色
	public boolean setColor(Color color) {
		mColor = color;
		return true;
	}
	
	//获取点
	public Point getPoint(int i) {
		if (i == 1) {
			return mPoint1;
		} else if (i == 2) {
			return mPoint2;
		} else if (i == 3) {
			return mPoint3;
		} else {
			System.out.println("Wrong number " + i);
			return null;
		}
	}
	
	//获取颜色
	public Color getColor() {
		return mColor;
	}
	
	//绘图
	public void paint(Graphics graphics) {
		Point v1 = getPoint(1);
		Point v2 = getPoint(2);
		Point v3 = getPoint(3);
		Color c = getColor();
		
		graphics.setColor(c);
		
		Polygon tPolygon = new Polygon();
		tPolygon.addPoint(v1.x, v1.y);
		tPolygon.addPoint(v2.x, v2.y);
		tPolygon.addPoint(v3.x, v3.y);
		
		graphics.fillPolygon(tPolygon);
	}
}
