
package com.HorizonLive.RfbPlayer;

import java.applet.*;

public class RfbPlayerSetDisplaySize extends Applet {

  public void init() {
    Applet receiver = null;
    receiver = RfbSharedStatic.refApplet;
    int width = Integer.valueOf(getParameter("DISPLAY_WIDTH")).intValue();
    int height = Integer.valueOf(getParameter("DISPLAY_HEIGHT")).intValue();

    if (receiver != null) {
      ((RfbPlayer)receiver).displaySize(width, height);
    } else
      System.out.println("Couldn't resize RfbPlayer.");
  }

}
