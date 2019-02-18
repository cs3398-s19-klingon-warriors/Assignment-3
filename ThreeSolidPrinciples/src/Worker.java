/* 
 * @author Serena Gutierrez
 * see explanation in A3_Klingons.txt
 */
  
package threesolid;

class Worker extends BaseWorker {//implements IEat, ISick{
	public void eat() {
		System.out.println("Worker eat and eat and eat");
	}

	public void sick() {
		System.out.println("Worker: *puke emoji*");
	}
}
