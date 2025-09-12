/*
 * Max Lee
 * 9/10/25
 * 4
 * Follow through with the given instuctions in the slides, and print out the values that the user has given.
 */
//Yes, I know the file name should be something like ReviewProgram - working on it!
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		Scanner keyB = new Scanner (System.in);
        
		//Getting the basic information
		System.out.println("Hello! How are you doing?");
        System.out.println("Please enter your name.");
        String name =  keyB.nextLine();
		System.out.println("Please enter your age.");
        int age =  keyB.nextInt();
		System.out.println("Please enter your favorite 3 digit number.");
        int fav =  keyB.nextInt();
		System.out.println("Please enter your gpa.");
        double gpa =  keyB.nextDouble();

		//Printing if they are able to vote
		if(age>=18)
			System.out.println("Congratulations for being " + age + ". You are able to vote!");
		else
			System.out.println("Sorry, you need to wait " + (18-age) + " more year until you can vote.");

		//GPA Results
		System.out.println("Your GPA: " +gpa);

		if(gpa>=4.5)
			System.out.println("Fantastic Job! Keep it up!");
		if((gpa<4.5)&&(gpa>=4))
			System.out.println("Keep up the good work!");
		if((gpa<4)&&(gpa>=3.5))
			System.out.println("Keep going! You got this!");
		if((gpa<3.5)&&(gpa>=3))
			System.out.println("Keep working hard!");
		if(gpa<3)
			System.out.println("Don't give up! Keep trying!");
		
		int nameLength = (name.length());
		for(int i = 0; nameLength * i<=fav; i++)
			System.out.print(nameLength * i + ", ");

		}

}
