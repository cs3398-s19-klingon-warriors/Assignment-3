/*
Description: TempWorker.java provides public class TempWorker, extends public class baseworker and implements IEat and ISick() interfaces for temp workers. This class adheres to OCP in that it it extends BaseWorker and is open for extension, closed for modification.
@author: sarah gibbons

*/
package threesolid;

public class TempWorker extends BaseWorker implements IEat, ISick {
  @Override
  public void work()
  {
    System.out.format("work method from TempWorker is working temporarily...\n");
  }
  public void IEat()
  {
    System.out.format("IEat method from TempWorker is eating temp meals...\n");
  }

  public void ISick()
  {
    System.out.format("ISick method from TempWorker is sick...\n");
  }
}
