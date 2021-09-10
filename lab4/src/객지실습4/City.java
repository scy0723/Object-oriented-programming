package °´Áö½Ç½À4;

public class City {
	private String name;
	private int location_x;
	private int location_y;
	
	//constructors
	public City(String name, int location_x, int location_y) {
		this.name = name;
		this.location_x = location_x;
		this.location_y = location_y;
	}
	public City(String name) {
		this.name = name;
		this.location_x=(int)(Math.random()*360);
		this.location_y=(int)(Math.random()*360);
	}

	//getters
	public String getName() {
		return name;
	}
	public int getLocation_x() {
		return location_x;
	}
	public int getLocation_y() {
		return location_y;
	}
	
	public boolean equals(City c) {
		if(this.name.equals(c.name)&&this.location_x==c.location_x&&this.location_y==c.location_y)
			return true;
		else
			return false;
	}
	public String tostring() {
		return (this.name+','+this.location_x+','+this.location_y);
	}
	public static double getDistance(City a, City b) {
		double c=Math.pow(a.location_x-b.location_x, 2);
		double d=Math.pow(a.location_y-b.location_y, 2);
		return Math.sqrt(c+d);
	}
}
