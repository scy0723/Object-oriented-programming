package °´Áölab12;

public class Buffer {
	private int loc=0;
	private double[] data;
	
	public Buffer(int size) {
		super();
		this.data=new double[size];
	}
	int getSize() {
		return data.length;
	}
	synchronized void add (double toAdd)throws InterruptedException{
		//wait
		if(loc>=data.length) {
			System.out.println("Buffer is full");
			wait();
		}
		//adding item
		System.out.println("Adding item"+toAdd);
		System.out.flush();
		data[loc++]=toAdd;
		notifyAll();
	}
	
	synchronized double remove() throws InterruptedException{
		//wait
		if(loc<=0) {
			System.out.println("Buffer is empty");
			wait();
		}
		//removing item
		System.out.println("Removing item: "+data[loc-1]);
		data[loc-1]=0.0;
		loc--;
		System.out.flush();
		notifyAll();
		return data[loc];
	}
}

