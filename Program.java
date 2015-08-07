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
		int pointsleft = 24 - total;
		
		System.out.println("Awareness:" + awareness + " Coordination:" + coordination + " Ingenuity:" + ingenuity + " Presence:" + presence + " Resolve:" + resolve + " Strength:" + strength);
		System.out.println("Attributes Total:" + total);
		System.out.println("You have " + pointsleft + " Character Points left for traits. It's recommended you spend 18 points on attributes and 6 on traits.");
		
		if(pointsleft < 0){
			System.out.println("WARNING: You have used too many character points. Lower your attributes or add negative traits.");
		}
		else if(pointsleft >= 0 && pointsleft < 6){
			System.out.println("You've spent a few more points than recommended, but that's okay. :)");
		}
		else if(pointsleft > 6){
			System.out.println("You can afford to spend more points! Up your attributes, or have loads left for traits.");
		}
		else if(pointsleft == 6){
			System.out.println("Well done! You've spent your points exactly as recommended. :D");
		}
		
	}

}
