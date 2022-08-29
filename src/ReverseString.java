import java.util.Scanner;

public class ReverseString {

  public static void main(String[] args) {
  
    System.out.println("Enter String to reverse: ");
    
    Scanner sc = new Scanner(System.in); 
    String str1 = sc.nextLine();
    String str2 = "";
    
    for(int i=str1.length()-1; i>=0; i--) {
      str2 += str1.charAt(i);
    }
    
    System.out.println("Reverse String: " + str2);
    
    
    
    
   
    
  }

}
