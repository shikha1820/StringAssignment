import java.util.Scanner;

public class StringApp {

  public static void main(String[] args) {
    // Vowels and Consonant count
    
    System.out.println("Enter String: ");
    
    Scanner sc = new Scanner(System.in); 
    String str1 = sc.nextLine();
    int vowel = 0;
    int consonant = 0;
    
    
    for(int i=0; i<str1.length(); i++) {
      if(str1.charAt(i)=='a'|| str1.charAt(i)=='e'|| str1.charAt(i)=='i'
          || str1.charAt(i)=='o' || str1.charAt(i)=='u') {
        
        vowel++;
      }else {
        consonant++;
      }
      
    }
    System.out.println("vowels:" + vowel);
    System.out.println("consonants:" + consonant);

  }

}
