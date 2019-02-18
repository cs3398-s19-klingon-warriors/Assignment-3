/* 
 * @author Serena Gutierrez
 * see explanation in A3_Klingons.txt
 */
  
package threesolid;

class Worker extends BaseWorker implements IEat, ISick{
    @Override
    public void work() {
        System.out.println("Worker: Work is never over");
    }
    public void eat() {
        System.out.println("Worker: eats and eats and eats and eats");
    }
    public void sick(){
        System.out.println("Worker: *puke emoji*");
    }
}
