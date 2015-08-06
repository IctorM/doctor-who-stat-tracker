import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("What is your Awareness?");
		int awareness = reader.nextInt();
		System.out.println("What is your Coordination?");
		int coordination = reader.nextInt();
		System.out.println("What is your Ingenuity?");
		int ingenuity = reader.nextInt();
		System.out.println("What is your Presence?");
		int presence = reader.nextInt();
		System.out.println("What is your Resolve?");
		int resolve = reader.nextInt();
		System.out.println("What is your Strength?");
		int strength = reader.nextInt();
		
		int total = awareness + coordination + ingenuity + presence + resolve + strength;
		
		System.out.println("Awareness:" + awareness + " Coordination:" + coordination + " Ingenuity:" + ingenuity + " Presence:" + presence + " Resolve:" + resolve + " Strength:" + strength);
		System.out.println("Total:" + total);
	}

}
