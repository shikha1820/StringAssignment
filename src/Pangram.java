import java.util.Scanner;

public class Pangram {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter String: ");
    String str1 = sc.nextLine();
    
    str1 = str1.toLowerCase();
    boolean isPangram = true;
    
    for(char c = 'a'; c<='z'; c++) {
      if(!str1.contains(String.valueOf(c))) {
        isPangram = false;
        break;
      }
    }
    
    if(isPangram) {
      System.out.println("String is Pangram");

    }else {
      System.out.println("String is not Pangram");

    }
    
  }
}
