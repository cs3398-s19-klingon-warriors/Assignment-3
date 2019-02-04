package threesolid
/* Adheres to open close & single responsibility.
 * By having the class separated from other worker types, we could extend it to add
 * more functionality which applies to the open close principle. 
 * Furthermore, single responsibility applies as each class is organized by individual
 * responsibilities. 
 * @author Serena Gutierrez
 */
  
class Worker implements IWorkable, IFeedable{
	public void work() {
		// ....working
	}

	public void eat() {
		//.... eating in launch break
	}
}

