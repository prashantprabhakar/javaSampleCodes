import java.util.Scanner;

public class UserInput{
public static void main(String args[]){
	String first_name;
	Scanner user_input = new Scanner( System.in );
	System.out.print("Enter your first name: ");
	first_name = user_input.next( );
	System.out.println(first_name);
        System.out.println(args[0]);
}
}
