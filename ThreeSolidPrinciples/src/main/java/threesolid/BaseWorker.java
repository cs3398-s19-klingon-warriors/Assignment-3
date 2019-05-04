/*
@author: Serena Gutierrez
*/

package threesolid;

public class BaseWorker{
    public void work(){
        System.out.println(this.getClass().getSimpleName() + ":\n\tWerk werk werk werk\n");
    }

    
    public String new_work() // added for A17
    {
	    return "Ready for new work";
    }


    public boolean all_good()  // rk added for A17

    {
	    return false ; // so test will fail
    }

    public int break_time()  // rk added for A17

    {
	    return 8 ;
    }
}
