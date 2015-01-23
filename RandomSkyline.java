//******************************************************************
//  RandomSkyline.java  Author: Pedro Garate   Date: Mar. 10th, 2013
//
//  Sets up a frame for the program and displays an instantiation
//  of SkylinePanel class.
//  1. Creates the frame.
//  2. Gets contents from SkylinePanel.
//  3. Displays the frame.
//******************************************************************

import javax.swing.*;
import java.awt.*;

public class RandomSkyline
{
   //-----------------------------------------------------------------
   //  Displays a city's skyline at night.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("City of Moradon");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new SkylinePanel());

      frame.pack();
      frame.setVisible(true);
   }
}
