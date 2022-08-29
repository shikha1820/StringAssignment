import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter first String: ");
    String str1 = sc.nextLine();
    System.out.println("Enter Second String: ");
    String str2 = sc.nextLine();
    
    if(str1.length() != str2.length()) {
      
      System.out.println("Strings are not Anagram");
    }
    else {
      
      char a1[] = str1.toLowerCase().toCharArray();
      Arrays.sort(a1);
      char a2[] = str2.toLowerCase().toCharArray(); 
      Arrays.sort(a2);
      
      if(Arrays.equals(a1, a2)) {
        System.out.println("Strings are Anagram");
      }
      else {
        System.out.println("Strings are not Anagram");
      }
    }

  }

}
