package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;


public class ThreeSolidMain
{

   public static Manager tsManager = new Manager();

   // The entry main() method
   public static void main(String[] args)
   {

      try
      {
         System.out.format("Starting ... \n");
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

// interface segregation principle - good example

class Worker implements IWorkable, IFeedable{
	public void work() {
		// ....working
	}

	public void eat() {
		//.... eating in launch break
	}
}

class Manager {
	IWorkable worker;

	public void Manager() {

	}
	public void setWorker(IWorkable w) {
		worker=w;
	}

	public void manage() {
		worker.work();
	}
}
