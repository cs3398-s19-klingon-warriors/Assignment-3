package threesolid ;

// RK
// in progress

class Manager {
	// IWorker worker;
	
	IWorkable worker ;

	public void Manager() {

	}
	public void setWorker(IWorker w) {
		worker=w;
	}

	public void manage() {
		worker.work();
	}
}
