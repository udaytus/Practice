package eighth;

import java.awt.Point;


public class RectanglesOverlapCheck {
//
//	public class Rectangle {
//	    private Point bottomLeft;
//	    private Point topRight;
//
//	public Rectangle(Point bottomLeft, Point topRight) {
//			super();
//			this.bottomLeft = bottomLeft;
//			this.topRight = topRight;
//		}
//	public Point getBottomLeft() {
//		return bottomLeft;
//	}
//	public void setBottomLeft(Point bottomLeft) {
//		this.bottomLeft = bottomLeft;
//	}
//	public Point getTopRight() {
//		return topRight;
//	}
//	public void setTopRight(Point topRight) {
//		this.topRight = topRight;
//	}
//}
//	public class Point {
//	    private int x;
//	    private int y;
//		public int getX() {
//			return x;
//		}
//		public void setX(int x) {
//			this.x = x;
//		}
//		public int getY() {
//			return y;
//		}
//		public void setY(int y) {
//			this.y = y;
//		}
//		public Point(int x, int y) {
//			super();
//			this.x = x;
//			this.y = y;
//		}
//
//	   
//}	
	public boolean overlapcheck(Rectangle other) {
	if(this.topRight.getY()<other.bottomLeft.getY()||
			this.bottomLeft.getY()>other.topRight.getY()) {
		return false;
	}
	if (this.topRight.getX() < other.bottomLeft.getX() 
		      || this.bottomLeft.getX() > other.topRight.getX()) {
		        return false;
		    }
		    return true;
		}
}

