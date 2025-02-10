//Jose Zarate
import java.util.Scanner;

public class jzarate4
{

       public static void main(String[] args) 
       {
	     Scanner scanner = new Scanner(System.in);
	     boolean exit = false;

	     while(!exit)
	     {
		     System.out.println("Choose one");
		     System.out.println("1. Knock Knock");
                     System.out.println("2. Waffles");
                     System.out.println("3. You stink");
                     System.out.println("4. LEBRON");
                     System.out.println("5. Exit");
                     int choice = scanner.nextInt();
                     scanner.nextLine();

		     switch (choice)
		     {
			     case 1:
				    System.out.println("Whos there, Jess, Jess who? , jess me and my shadow");
				    break;
			     case 2:
				    System.out.println("Chicken");
				    break;
			     case 3:
				    System.out.println("Take a shower");
				    break;
			     case 4:
				    System.out.println("The GOAT LEBROOOOOOOON");
				    break;
			     case 5:
				    exit = true;
				    break;
			     default:
				    System.out.println("invalid choice. Try again");
				    break;
	             
		   }
           }
     }
}

