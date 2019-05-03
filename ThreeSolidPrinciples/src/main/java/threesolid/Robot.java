/* 
   Talon Sjostrom
   
   Three Principles explanation found in Assignment-3/A3_Klingons.txt
*/

package threesolid;

class Robot extends BaseWorker implements IReboot{
	
	private int rebootSeconds = 3;

	public void reboot() {
		System.out.println("Robot: \n\tRebooting... and done.\n");
	}

	public int getRebootSeconds(){
		return rebootSeconds;
	}
}
