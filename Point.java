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

import java.util.Random;

public class Point
{
    private int x, y;
    private int color;
    private Random rGen;
    
    public Point(int col)
    {
        rGen = new Random();
        x = rGen.nextInt(500);
        y = rGen.nextInt(500);
        color = col;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public int getColor()
    {
        return color;
    }
    
    public void printPoint()
    {
        System.out.println( "X: " + x + "\nY: " + y + "\nColor: " + color);
    }
}
