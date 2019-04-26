/*
@author: Serena Gutierrez
*/

package threesolid;

public class BaseWorker{
    public void work(){
        System.out.println(this.getClass().getSimpleName() + ":\n\tWerk werk werk werk\n");
    }

    
    public int new_work() // added for A17
    {
	    return 6;
    }

}
