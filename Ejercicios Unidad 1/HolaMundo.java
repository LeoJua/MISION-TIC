import java.util.Scanner;

public class HolaMundo {


    public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your first Name");

    String firstname = sc.nextLine();
    
    System.out.println("Please enter your Last Name");
    String lastname = sc.nextLine();


    System.out.println( "Hello "  +firstname + " " + lastname );
}        
}