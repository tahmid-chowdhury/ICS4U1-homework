
import java.util.Scanner;

public class ClassStats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		//Outputs user input, quits when 'q' is entered
		System.out.print("Enter anything (enter 'q' to quit): ");
		String input = sc.nextLine();
		
		while (!input.equals("q"))
		{
			System.out.print(input + "\n");
			System.out.print("Enter something else (enter 'q' to quit): ");
			input = sc.nextLine();
		}

		//Outputs number of each letter grade in a class
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		
		System.out.print("Enter the number of students in your class: ");
		int n = sc.nextInt();
		
		int rounds = 0;
		int mark = 0;
		
		while (rounds != n)
		{
			System.out.print("Enter a students mark: ");
			mark = sc.nextInt();
			if (mark >= 80)
			{
				a = a + 1;
			}
			if (mark <=79)
			{
				if (mark >= 70)
				{
					b = b + 1;
				}
			}
			if (mark <= 69)
			{
				if (mark >= 60)
				{
					c = c + 1;
				}
			}
			if (mark <= 59)
			{
				if (mark >= 50)
				{
					d = d + 1;
				}
			}
			if (mark <= 49)
			{
				f = f + 1;
			}
			rounds = rounds + 1;
		}
		
		System.out.println(a + " students recieved 'A's");
		System.out.println(b + " students recieved 'B's");
		System.out.println(c + " students recieved 'C's");
		System.out.println(d + " students recieved 'D's");
		System.out.println(f + " students recieved 'F's.");
		
		sc.close();
	}

}
