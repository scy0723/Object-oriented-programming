package ����lab10;

public class Tiger extends Animal implements Barkable{
	public Tiger() {
		super("ȣ����");
	}

	@Override
	public String bark() {
		return "����";
	}
}
