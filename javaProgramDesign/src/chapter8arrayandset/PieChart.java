package chapter8arrayandset;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.time.Year;

public class PieChart {
	//类常量
	private static final int DEFAULT_RADIUS = 115;  //饼图默认半径
	private static final int DEFAULT_LINE_SPACING = 20;//默认间距
	private static final Point DEFAULT_PIE_LOCATION = //默认圆心
			new Point(10, 10);
	private static final Point DEFAULT_LEGEND_LOCATION = //图例默认起始位置
			new Point(280, 35);
	private static final Color[] DEFAULT_PIE_COLOR = {
		Color.RED, Color.BLUE, Color.MAGENTA, Color.BLACK,
		Color.GREEN, Color.YELLOW, Color.CYAN, Color.PINK,
		Color.GRAY, Color.ORANGE, Color.DARK_GRAY, Color.WHITE
	};
	
	private double[] data;  //数值列表的引用
	private String[] name;  //名字列表的引用
	private Color[] color;  //颜色列表的引用
	private int radius;     //饼状图半径
	private Point pieLocation;  //饼状图圆心位置
	private Point legendLocation;  //图例起始位置
	private int lineSpacing;  //图例的行间隔像素值
	
	
	public PieChart(double[] choice, String[] genre) {
		// TODO Auto-generated constructor stub
		data = choice;
		name = genre;
		color = DEFAULT_PIE_COLOR;
		radius = DEFAULT_RADIUS;
		pieLocation = DEFAULT_PIE_LOCATION;
		legendLocation = DEFAULT_LEGEND_LOCATION;
		lineSpacing = DEFAULT_LINE_SPACING;
	}
	
	//在graphics中画出饼状图和文字信息
	public void paint(Graphics graphics) {
		paintPie(graphics, pieLocation.x, pieLocation.y, radius);
		paintLegend(graphics, legendLocation.x, legendLocation.y, lineSpacing);
	}
	
	//在graphics中画出饼状图
	public void paintPie(Graphics graphics, int x, int y, int radius) {
		final int CIRCLE_DEGREES = 360;
		int size = data.length;
		
		//计算值的和
		double dataSum = 0;
		for (int i = 0; i < size; i++) {
			dataSum += data[i];
		}
		
		//开始绘制分片
		int startAngle = 0;
		
		for (int i = 0; i < size; i++) {
			//下一个分片占了多少度
			double percent = data[i] / dataSum;
			int arcAngle = (int) Math.round(percent * CIRCLE_DEGREES);
			
			//设置分片颜色
			graphics.setColor(color[i]);
			System.out.println(color[i] + ", i = " + i);
			//绘制分片
			graphics.fillArc(x, y, 
					2 * radius, 2 * radius, 
					startAngle, arcAngle);
			
			//记录下一个起始角度
			startAngle += arcAngle;
		}
	}
	
	//在graphics中画出图例
	public void paintLegend(Graphics graphics, int x, int y, int delta) {
		//计算数组大小
		int size = name.length;
		System.out.println("size = " + size);
		//当前偏移量
		int currentDelta = 0;
		
		for (int i = 0; i < size; i ++) {
			//构造当前图例的线
			String string = name[i] + ": " + data[i];
			System.out.println(string);
			//设置分片颜色
			graphics.setColor(color[i]);
			System.out.println("color: " + color[i]);
			graphics.drawString(string, x, y);
			//graphics.drawLine(100, 100, 300, 300);
			//确定下一条线的位置
			y += delta;
		}
	}
	
	//
}
