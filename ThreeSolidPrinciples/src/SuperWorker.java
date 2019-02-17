/*
SuperWorker.java

Three Principles explanation found in Assignment-3/A3_Klingons.txt
superworker implements IEat and ISick interfaces. Superworker extends BaseWorker
Superworker overrides inherited work method. SuperWorker follows ISP in that if you were to add a different type of worker with new responsibilities then this worker wouldnt have to use the new responsibility.

@author: sarah gibbons
*/

package threesolid;

public class SuperWorker extends BaseWorker implements IEat, ISick{
	@Override
	public void work() {
		System.out.format("\tSuperWorker work() ... \n");
		//.... i override my work method cause im super duper
	}

	public void eat() {
		System.out.format("\tSuperWorker eat() ... \n");

	}
	public void sick() {
		System.out.format("\tSuperWorker sick() ... \n");

	}
}
