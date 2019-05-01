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
	    return "I'm working already!";
    }
    public String old_work(){
         return "I'm tired of working already!";
    }
    public String working(){
        return "I am working";
    }

}
