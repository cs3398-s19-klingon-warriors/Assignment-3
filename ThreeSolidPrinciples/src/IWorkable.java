/**
*	
* We moved the work function to its own interface because 
* some employees do not use the eat method originally 
* included (i.e. Robot). This follows the Interface
* Segregation principle by spreading out one big interface
* into multiple interfaces, so that classes implementing
* each interface do not need to implement any irrelevant or unused functions.
*
* @author Abel
*
*/

package threesolid;

interface IWorkable {

	public void work();

}
