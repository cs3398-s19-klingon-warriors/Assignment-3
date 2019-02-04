package threesolid ;

// Rachel Kelmenson
// Commentary in general explanation txt file


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
