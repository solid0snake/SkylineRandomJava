//***********************************************************************
//  SkylinePanel.java    Author: Pedro Garate     Date: Mar. 11th, 2013
//
//  Holds instance data for some Building objects
//  1. Creates the panel.
//  2. Draws a moon.
//  3. Draws the stars.
//  4. Displays the name of the city.
//  5. Draws the buildings.
//***********************************************************************

import javax.swing.*;
import java.awt.*;

public class SkylinePanel extends JPanel
{
   private Building build;
   private Star star;
   private int buildNum, width, height, xCoor, yCoor, gap;

   //-----------------------------------------------------------------
   //  Constructor: sets panel size and background.
   //-----------------------------------------------------------------
   public SkylinePanel()
   {
      setPreferredSize (new Dimension(500, 500));
      setBackground (Color.blue);
   }

   //-----------------------------------------------------------------
   //  Draws this panel by requesting that the stars and each building 
   //  draws itself.
   //-----------------------------------------------------------------
   public void paintComponent(Graphics page)
   {
      super.paintComponent(page);

      page.setColor(Color.white);
      page.fillOval(-70, -70, 140, 140);  // moon
      
      // stars
      for(int i=2;i<497;i+=(int)(Math.random()*20)+10){
      	      for(int j=2;j<447;j+=(int)(Math.random()*20)+10){
      	      	      star = new Star(i,j);
      	      	      star.draw(page);
      	      }
      }      	      	      
      
      page.setColor(Color.black);
      page.drawString("Moradon's Skyline",350,10);  // city name
      
      // buildings
      buildNum = (int)(Math.random()*20)+5;
      xCoor = 1;
      for(int num = 1; num <= buildNum && xCoor < 439; num++)
      {
      	      width = (int)(Math.random()*49)+12;
      	      height = (int)(Math.random()*450)+32;
      	      gap = (int)(Math.random()*10)+2;
      	      yCoor = 500-height;
      	      build = new Building(xCoor,yCoor,width,height);
      	      build.draw(page);
      	      xCoor = xCoor+width+gap;
      }
   }
}
