import java.util.Scanner;

public class StringApp3 {

  public static void main(String[] args) {
    System.out.println("Enter String: ");
    
    Scanner sc = new Scanner(System.in); 
    String str1 = sc.nextLine();
    
    for(int i=0; i<str1.length(); i++) {
      for(int j=i+1; j<str1.length(); j++) {
       
        if(str1.charAt(i)==str1.charAt(j)) {
          System.out.print(str1.charAt(i));
          

        }
      }
    }
  }

}
