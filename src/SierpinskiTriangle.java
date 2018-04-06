/**
 * Erick Williams
 * Sierpinski Triangle
 * 2/22/16
 * This program recursively draws a Sierpinski Triangle.
 */

public class SierpinskiTriangle 
{
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		double x1=0;
		double y1=0;
		double x2=1;
		double y2=0;
		double x3=0.5;
		double y3=Math.sqrt(3)/2;
		drawSierpinskiTriangle(x1,y1,x2,y2,x3,y3,8);
	}
/**
 * This method recursively draws Sierpinski Triangles.
 * @param x1 - the first x coordinate
 * @param y1 - the first y coordinate
 * @param x2 - the second x coordinate
 * @param y2 - the second y coordinate
 * @param x3 - the third x coordinate
 * @param y3 - the third y coordinate
 * @param n - the number of desired levels of recursion
 */
	public static void drawSierpinskiTriangle(double x1, double y1,double x2, double y2, double x3, double y3, int n)
	{
		double[] x={x1,x2,x3};
		double[] y={y1,y2,y3};
		StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
		StdDraw.filledPolygon(x,y);
		
		if(n==0)
		{
			return;
		}
		else
		{
			double x4=(x1+x2)/2;
			double y4=(y1+y2)/2;
			double x5=(x2+x3)/2;
			double y5=(y2+y3)/2;
			double x6=(x1+x3)/2;
			double y6=(y1+y3)/2;
			
			double[] xx={x4,x5,x6};
			double[] yy={y4,y5,y6};
			
			StdDraw.setPenColor(StdDraw.DARK_GRAY);
			StdDraw.filledPolygon(xx,yy);
			
			n--;
			
			
			drawSierpinskiTriangle(x1,y1,x4,y4,x6,y6,n);
			drawSierpinskiTriangle(x4,y4,x2,y2,x5,y5,n);
			drawSierpinskiTriangle(x6,y6,x5,y5,x3,y3,n);
		}
	}
}
