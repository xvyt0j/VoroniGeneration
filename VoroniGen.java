/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voronitest;
/**
 *
 * @author blender
 */
import java.awt.image.*;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

public class VoroniGen
{
    private BufferedImage Canvas;
    private List<Point> points;
    
    private int WIDTH = 500;
    private int HEIGHT = 500;
    private int NUM_POINTS = 7;
    
    public VoroniGen()
    { 
        Canvas = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        int backgroundColor = 0xFFFFFF;
        
        for(int i = 0 ; i < WIDTH ; i++)
        {
            for(int j = 0 ; j < HEIGHT ; j++)
            {
                Canvas.setRGB(i, j, 0xFFFFFF);
            }
        }
                
       points = new ArrayList<Point>();
       points.add(new Point(0xFF0000));
       points.add(new Point(0xFFFF00));
       points.add(new Point(0x00FF00));
       points.add(new Point(0x0000FF));
       points.add(new Point(0x00FFFF));
       points.add(new Point(0xFFFFFF));
       points.add(new Point(0xFF0F00));
       points.add(new Point(0x0F0000));
       NUM_POINTS = points.size();
    }
    
    public void doVoroni()
    {
        System.out.println("Calculating voroni cells...");
        for( int i = 0 ; i < WIDTH ; i++)
        {
            for( int j = 0 ; j < HEIGHT ; j++)
            {
                int c = 0;
                int closestIndex = 0;
                double closestDist = WIDTH * HEIGHT;
                for(c = 0 ; c < NUM_POINTS ; c++)
                {
                    double d = manhattanDistance(points.get(c), i, j);
                    if(d < closestDist)
                    {
                        closestIndex = c;
                        closestDist = d;
                        Canvas.setRGB(i, j, points.get(c).getColor());
                    }
                } 
            }
        }
        
        for(int i = 0 ; i < WIDTH ; i++)
        {
            for(int j = 0 ; j < HEIGHT ; j++)
            {
                for(int k = 0 ; k < points.size() ; k++)
                {
                    if( (points.get(k).getX()- 3 < i && i < points.get(k).getX()+3) && (points.get(k).getY() - 3 < j && j < points.get(k).getY() + 3) )
                    {
                        Canvas.setRGB(i, j, 0x000000);
                    }
                }
            }
        }
    }
    public BufferedImage getImage()
    {
        return Canvas;
    }    
    public double distance(Point p, int x, int y)
    {
        double rad = Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(), 2);
        double dist = Math.sqrt(rad);
        
        return dist;
    }
    public double manhattanDistance(Point p, int x, int y)
    {
        double mDist = Math.abs(x - p.getX()) + Math.abs(y - p.getY());
        return mDist;
    }
}
