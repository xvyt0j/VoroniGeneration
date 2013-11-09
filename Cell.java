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

import java.util.ArrayList;
import java.util.List;


public class Cell
{
    private List<Pixel> contained;
    private int id;
    
    public Cell(int i)
    {
        contained = new ArrayList<Pixel>();
        id = i;
    }
    public void addPixel(int x, int y)
    {
        contained.add(new Pixel(x, y));
    }
}
