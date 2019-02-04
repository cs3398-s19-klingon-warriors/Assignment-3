package threesolid ;

// RK
// in progress


class Manager {
	
	IWorkable worker ;

	public void Manager() {

	}
	public void setWorker(IWorkable w) {
		worker=w;
	}

	public void manage() {
		worker.work();
	}
}
