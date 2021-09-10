package °´Áö½Ç½À2;
import java.util.Scanner;

public class lab02_2 {
	private static String makeOrdinalNumber(int num)
	{
		if((num%100)/10==1)
			return num+"th";
		switch(num%10) {
			case 1:
				return num+"st";
			case 2:
				return num+"nd";
			case 3:
				return num+"rd";
		}
		return num+"th";
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input= scan.nextLine();
		input=input.toUpperCase();
		String scores[]=input.split(" ");
		
		double sum=0;
		for(int i=0;i<scores.length;i++)
		{	
			System.out.print(makeOrdinalNumber(i+1)+" stuent's score is ");
			switch(scores[i]) {
				case "A":
					System.out.println("100");
					sum=sum+100;
					break;
				case "B":
					System.out.println("90");
					sum=sum+90;
					break;
				case "C":
					System.out.println("80");
					sum=sum+80;
					break;
				case "D":
					System.out.println("70");
					sum=sum+70;
					break;
				default:
					System.out.println("0");
			}
		}
		System.out.print("The class's average = ");
		System.out.printf("%.2f\n", sum/scores.length);
		scan.close();
	};
}
