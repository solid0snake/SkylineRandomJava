//******************************************************************
//  Star.java    Author: Pedro Garate     Date: Mar. 11th, 2013
//
//  This class represents a graphical depiction of a single star.
//  1. Takes arguments.
//  2. Draws the star.
//******************************************************************

import java.awt.*;

public class Star
{
   private int x, y;
   private final int SIZE = 2;

   //-----------------------------------------------------------------
   //  Constructor: Sets up this star with the specified values.
   //-----------------------------------------------------------------
   public Star(int upperX, int upperY)
   {
      x = upperX;
      y = upperY;      
   }

   //-----------------------------------------------------------------
   //  Draws this star in the specified graphics context.
   //-----------------------------------------------------------------
   public void draw(Graphics page)
   {
      page.setColor(Color.white);
      page.fillRect(x, y, SIZE, SIZE);
   }

   //-----------------------------------------------------------------
   //  X mutator.
   //-----------------------------------------------------------------
   public void setX(int upperX)
   {
      x = upperX;
   }


   //-----------------------------------------------------------------
   //  Y mutator.
   //-----------------------------------------------------------------
   public void setY(int upperY)
   {
      y = upperY;
   }

   //-----------------------------------------------------------------
   //  X accessor.
   //-----------------------------------------------------------------
   public int getX()
   {
      return x;
   }

   //-----------------------------------------------------------------
   //  Y accessor.
   //-----------------------------------------------------------------
   public int getY()
   {
      return y;
   }
}
