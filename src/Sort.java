import java.util.Arrays;
import java.util.Scanner;

public class Sort {
  public static void main(String[] args) {
    
    System.out.println("Enter String: ");
    
    Scanner sc = new Scanner(System.in); 
    String str1 = sc.nextLine();
    char a[] = str1.toCharArray();
    char temp;
    
    for(int i=0; i<a.length; i++) {
      for(int j=i+1; j<a.length; j++) {
        if(a[i] > a[j])
        {
          temp = a[i];
          a[i] = a[j];
          a[j]= temp;
        }
     
      }
    }
    
    System.out.println(a);
  }   
}
