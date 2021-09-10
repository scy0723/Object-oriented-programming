package °´Áö½Ç½À4;

public class Lab04 {

	public static void main(String[] args) {
		City a=new City("Seoul",23,45);
		System.out.println(a.tostring());
		City b=new City("Paris",123,41);
		System.out.println(b.tostring());
		City c=new City("Racoon City");
		System.out.println(c.tostring());
		City d=new City("Mega City");
		System.out.println(d.tostring());
		
		//seoul-paris
		System.out.println("Seoul-Paris: "+ City.getDistance(a,b));
		System.out.println("Seoul-Racoon City: "+City.getDistance(a, c));;
		System.out.println("Paris-Mega City: "+City.getDistance(b, d));
	}

}
