/*
Three Principles explanation found in Assignment-3/A3_Klingons.txt
@ Sarah Gibbons
*/
package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;


public class ThreeSolidMain
{

  /*
  ==================
  Classes
  ==================
  */

  public static Manager tsManager = new Manager();
  public static ProjectManager tsProjectManager = new ProjectManager();
  public static ProductManager tsProductManager = new ProductManager();


  public static BaseWorker tsBaseWorker = new BaseWorker(); //(Possibly abstract?)
  public static Robot tsRobot = new Robot();
  public static Worker tsWorker = new Worker();
  public static SuperWorker tsSuperWorker = new SuperWorker();
  public static TempWorker tsTempWorker = new TempWorker();

  // The entry main() method
  public static void main(String[] args)
  {

    try
    {
      System.out.format("Starting ... \n");
      /*
      ===============
      Manager
      ==============
      */
      tsManager.setWorker(tsWorker);
      tsManager.manage();

      /*
      ===============
      Project Manager
      ===============
      */
      tsProjectManager.scheduleWork();
      tsProjectManager.setWorker(tsWorker);
      tsProjectManager.manage();

      /*
      ===============
      Product Manager
      ===============
      */
      tsProductManager.defineProduct();
      tsProductManager.setWorker(tsWorker);
      tsProductManager.manage();

      /*
      ===============================
      Base Worker (Might be abstract)
      ===============================
      */
      tsBaseWorker.work();


      /*
      ===============
      Robot
      ===============
      */
      tsRobot.work();
      tsRobot.reboot();

      /*
      ===============
      Worker
      ===============
      */
      tsWorker.work();
      tsWorker.eat();
      tsWorker.sick();

      /*
      ===============
      Super Worker
      ===============
      */
      tsSuperWorker.work();
      tsSuperWorker.eat();
      tsSuperWorker.sick();

      /*
      ===============
      Temp Worker
      ===============
      */
      tsTempWorker.work();
      tsTempWorker.eat();
      tsTempWorker.sick();

    }
    catch (Exception main_except)
    {
      main_except.printStackTrace();
    }

    try
    {
      System.out.format("Stopping ... \n");
    }
    catch (Exception main_except)
    {
      main_except.printStackTrace();
    }

    System.exit(0);

  }
}
