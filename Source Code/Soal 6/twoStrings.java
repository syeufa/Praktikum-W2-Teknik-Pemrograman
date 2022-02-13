import java.util.Scanner;

/**
* <h1> String </h1>
* This program implements an application that can sum 
* the elements of two strings, comparing them lexicographically,
* then capitalize the first letter in both and print them on a 
* single line
* 
* <p>
* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author Syifa Khairina
* @version 1.0
* @since 2022-02-13
*/
public class twoStrings {
    public static void main (String args[]){
     String A, B;
        // membuat scanner
        Scanner scan = new Scanner(System.in);
        
         A = scan.nextLine();
         A = A.toLowerCase();
         B = scan.nextLine();
         B = B.toLowerCase();
        
         
        int charA = A.length();
        int charB = B.length();
        
    
        //menjumlahkan jumlah karakter tiap string
        int sumChar = charA + charB;
        System.out.println(sumChar);
        
        //apakah A lexicographically greater dari B?
        int greaterString = A.compareTo(B);
        if (greaterString > 0 ){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        
      //kapitalisasi kata dalam string
      A = A.substring(0,1).toUpperCase() +
          A.substring(1).toLowerCase();
      B = B.substring(0,1).toUpperCase() +
          B.substring(1).toLowerCase();
      
        System.out.println(A + " " + B);
    }       
}

