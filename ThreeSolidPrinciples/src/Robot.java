/* 
   Talon Sjostrom
   
   Three Principles explanation found in Assignment-3/A3_Klingons.txt
*/

package threesolid;

class Robot extends BaseWorker implements IReboot{
	public void reboot() {
		System.out.println("Robot: \n\tRebooting... and done.\n");
	}
}
