import java.util.Scanner;

public class ReverseSentence {

  public static void main(String[] args) {
    
    System.out.println("Enter Sentences to reverse: "); // Think Twice  
    
    Scanner sc = new Scanner(System.in); 
    String str1 = sc.nextLine();
    String a[] = str1.split(" ");
    String RevSentence = "";
    
    for(int i=0; i<=a.length-1; i++) {
      
      String revWord = "";
      String word = a[i];
      
      for(int j=word.length()-1; j>=0; j--) {
        revWord += word.charAt(j);
      }
      RevSentence += revWord+ " ";   
      
    }
    
    System.out.println("Reverse Sentence: " +RevSentence);

  }

}
