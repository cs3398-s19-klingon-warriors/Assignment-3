/* 
   Talon Sjostrom
   
   Three Principles explanation found in Assignment-3/A3_Klingons.txt
*/

package threesolid;

class Robot extends BaseWorker implements IReboot{
	public void work() {
		System.out.println("Robot: \n\tOf course they send the robot to do janitorial work.");
		System.out.println("\tIt's like they think I don't have a highly sophisticated");
		System.out.println("\temotional response system in place.\n");
	}
	public void reboot() {
		System.out.println("Robot: \n\tRebooting... and done.\n");
	}
}
