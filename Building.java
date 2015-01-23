//******************************************************************
//  Building.java    Author: Pedro Garate     Date: Mar. 11th, 2013
//
//  This class represents a graphical depiction of a single building.
//  1. Takes arguments.
//  2. Draws the building.
//  3. Draws windows for the building.
//******************************************************************

import java.awt.*;

public class Building
{
   private int x, y, width, height, xBound, distanceX, distanceY;
   private final int WINSIZE = 10, YBOUND = 450;

   //-----------------------------------------------------------------
   //  Constructor: Sets up this building with the specified values.
   //-----------------------------------------------------------------
   public Building(int upperX, int upperY, int buildWidth, int buildHeight)
   {
      x = upperX;
      y = upperY;
      width = buildWidth;
      height = buildHeight;
      xBound = x + width - 12;      
   }

   //-----------------------------------------------------------------
   //  Draws this building in the specified graphics context.
   //-----------------------------------------------------------------
   public void draw(Graphics page)
   {
      page.setColor(Color.black);
      page.fillRect(x, y, width, height);
      
      //---------------------------------
      //  Draws windows
      //---------------------------------
      page.setColor(Color.yellow);
      for(int j=y+WINSIZE; j<YBOUND; j += distanceY){
      	      for(int i=x+2; i<xBound; i += distanceX){
      	      	      page.fillRect(i, j, WINSIZE, WINSIZE);
      	      	      distanceX = (int)(Math.random()*25+WINSIZE);
      	      }
      	      distanceY = (int)(Math.random()*25+WINSIZE);
     }
   }

   //-----------------------------------------------------------------
   //  Width mutator.
   //-----------------------------------------------------------------
   public void setWidth(int w)
   {
      width = w;
   }

   //-----------------------------------------------------------------
   //  Height mutator.
   //-----------------------------------------------------------------
   public void setHeight(int h)
   {
      height = h;
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
   //  Width accessor.
   //-----------------------------------------------------------------
   public int getWidth()
   {
      return width;
   }

   //-----------------------------------------------------------------
   //  Height accessor.
   //-----------------------------------------------------------------
   public int getHeight()
   {
      return height;
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
