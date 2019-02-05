/* 
Rachel Kelmenson
Three Principles explanation found in Assignment-3/A3_Klingons.txt
*/

package threesolid ;

class Manager {
	
	IWorkable worker ; // changed from IWorker to IWorkable

	public void Manager() {

	}
	public void setWorker(IWorkable w) {
		worker=w;
	}

	public void manage() {
		worker.work();
	}
}
