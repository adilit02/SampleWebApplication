// ........Reverse A String........
import java.util.Scanner;
public class Abc{
  public static void main(String[] args) {
    //String str = "Welcome to Adil It";
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter Any Words Or Sentence : ");
	String str = sc.nextLine();
	
	String reversed = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      reversed += str.charAt(i);
    }
	System.out.println("........Reverse..String........");
    System.out.println(reversed);

// Display in UpperCase
    String output = str.toUpperCase();
	System.out.println("........Display in UpperCase........");
    System.out.println(output);
 
 // Display in LowerCase----->

 	String lower = str.toLowerCase();
	System.out.println("........Display in LowerCase........");
	System.out.println(lower);
  }
}
