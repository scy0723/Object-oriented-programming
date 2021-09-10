package 객지lab10;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Tiger tiger = new Tiger();
		Turtle turtle = new Turtle();
		
		Animal[] animal = new Animal[3];
		animal[0]=dog;
		animal[1]=tiger;
		animal[2]=turtle;
		
		Person person = new Person() {
			private int hp=100;
			
			@Override
			public void control(Barkable b) {
				if(b.getClass().equals(dog.getClass())) {
					hp-=10;
					System.out.println(dog.getName() + "를 제압하였습니다.");
				}
				else if (b.getClass().equals(tiger.getClass())) {
					hp-=80;
					System.out.println(tiger.getName() + "를 제압하였습니다.");
				}
			}

			@Override
			public void showInfo() {
				System.out.println("사람 HP : "+ this.hp);
			}
		};
		
		showResult(animal,person);
	
	}
	
	private static void showResult(Animal[] animals, Person p) {
		for(int i=0; i<animals.length; i++) {
			if(animals[i] instanceof Barkable) {
				System.out.println((i+1)+"번째 동물 : "+animals[i].getName());
				Barkable b =(Barkable) animals[i];
				System.out.println((i+1)+"번째 동물 울음소리 : "+b.bark());
				p.control(b);
				p.showInfo();
			}
		}
	}
	

}
