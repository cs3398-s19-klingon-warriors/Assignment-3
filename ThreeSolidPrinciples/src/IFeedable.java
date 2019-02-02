/**
*	
* We moved the eat function to it's own interface because 
* some employees do not use the eat method originally 
* included. (i.e. Robot) This follows the Interface
* Segregation principle by spreading out one big interface
* into multiple interfaces.
*
* @author Abel
*
*/

package threesolid;

interface IFeedable {

	public void eat();

}