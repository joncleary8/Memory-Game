import java.util.Scanner;

public class introduction
	{

		public static void main(String[] args)
			{
				int choice;
				Scanner decision = new Scanner(System.in);
				System.out.println("Would you like to play a memory game? Input 1 if you would. If not, input 2.");
				choice = decision.nextInt();
				if (choice==1)
					{
						System.out.println("Welcome to the memory game. You will be playing on a 4x4 board. What category would you like to play with?");	
					}
				if (choice==2)
					{
						System.out.println("That's too bad. Goodbye!");
						System.exit(0);
					}
			}

	}
