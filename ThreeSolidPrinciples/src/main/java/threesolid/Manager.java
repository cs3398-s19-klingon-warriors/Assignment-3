/* 
Rachel Kelmenson
Three Principles explanation found in Assignment-3/A3_Klingons.txt
*/

package threesolid ;

class Manager {
	
	BaseWorker worker ; // changed from IWorkable to BaseWorker

	public void Manager() {

	}
	public void setWorker(BaseWorker w) {
		worker=w;
	}

	public void manage() {
		worker.work();
	}
}
