import java.util.Scanner;

public class StringApp1 {
//  Count Special Charcters
  public static void main(String[] args) {
    System.out.println("Enter String: ");
    
    Scanner sc = new Scanner(System.in); 
    String str1 = sc.nextLine();
    int spclChar = 0;
    
    for(int i=0; i<str1.length(); i++) {
      char c = str1.charAt(i);
     
      if(c>='A'&& c<='Z' || c>='a'&& c<='z' || c>='0'&& c<='9') {
        continue;
      }
      else {
        spclChar++;
      }
    }
    System.out.println("Number of Special Charcters: " + spclChar);

  }

}
