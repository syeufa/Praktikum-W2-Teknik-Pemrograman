import java.util.Scanner;
/**
* <h1> which primitive data types are capable of properly storing that input?</h1>
* This program implements an application that determine which data type 
* should be used by an integer input to be properly stored 
* <p>
* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author Syifa Khairina
* @version 1.0
* @since 2022-02-10
*/

public class StoringInput {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int nInput = scan.nextInt();
        String[] number = new String[nInput];
        for (int i = 0; i< nInput; i++){
           number[i]= scan.next();
        }
        for (int i = 0; i< nInput; i++){
        try{
        long convtdNumber = Long.parseLong(number[i]);
        System.out.println(convtdNumber + " can be fitted in:");
        if (convtdNumber >= -32768 && convtdNumber <= 32767){
            System.out.println("*short");
        }
        if (convtdNumber >= -2147483648 && convtdNumber <= 2147483647){
            System.out.println("*int");
        }
        if (convtdNumber >= -9223372036854775808L && convtdNumber <= 9223372036854775807L){
            System.out.println("*long");
        }
        }catch(Exception e){
            System.out.println(number[i]+ "can't be fitted anywhere");
        }
        }
        }
        
}
        