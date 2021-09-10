package ����lab12;

public class ProdConSelfTest {
	private Buffer buffer;
	private Producer producer;
	private Consumer consumer;
	public ProdConSelfTest() {
		super();
		this.buffer=new Buffer(15);
		this.producer=new Producer(buffer);
		this.consumer=new Consumer(buffer);
	}
	//consumer
	public class Consumer extends Thread{
		private final Buffer buffer;
		public Consumer(Buffer buffer) {
			super();
			this.buffer = buffer;
		}
		public void consume() throws InterruptedException{
			for(int i=buffer.getSize();i>=0;i--) {
				buffer.remove();
			}
		}
		public void run() {
			try {
				consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	//producer
	public class Producer extends Thread{
		private final Buffer buffer;
		public Producer(Buffer buffer) {
			super();
			this.buffer = buffer;
		}
		public void produce() throws InterruptedException{
			for(int i=0;i<buffer.getSize();i++) {
				buffer.add(Math.random()*100);
			}
		}
		public void run() {
			try {
				produce();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	void startThread() {
		producer.start();
		consumer.start();
	}
}
