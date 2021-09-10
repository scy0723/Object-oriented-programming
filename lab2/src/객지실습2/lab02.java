package °´Áö½Ç½À2;
import java.util.Scanner;

public class lab02 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String input= scan.nextLine();
		
		int position = input.indexOf("homework");
		String name = input.substring(0,position);
		String[] name_arr=name.split(" ");
		int name_length= name_arr.length;
		
		name_arr[1]=name_arr[1].substring(0,1);
		name_arr[2]=name_arr[2].substring(0,1);
		name_arr[1]=name_arr[1].toUpperCase();
		name_arr[2]=name_arr[2].toUpperCase();
		
		String homework=input.substring(position);
		String new_homework=homework.replace("ppt", "pdf");
		new_homework=new_homework.substring(0,1).toUpperCase()+new_homework.substring(1);

		System.out.println("Name Length(Korean):"+name_length);	
		System.out.println(name_arr[1]+"."+name_arr[2]+"."+name_arr[0]
				+" submitted "+ new_homework);
		
		scan.close();
	}

}


