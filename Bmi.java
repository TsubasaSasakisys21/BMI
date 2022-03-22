import java.util.Scanner;
public class Main {
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("身長(m)");
		double sin=sc.nextInt();
		System.out.println("体重(kg)");
		double tai=sc.nextInt();
		double BMI=tai/(sin*sin);
		System.out.println("your BMI is"+BMI);
		System.out.println("your BMI is"+BMI);
	}
}