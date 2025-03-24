
import java.util.Scanner;

public class Assignment {
    // DO NOT MODIFY THIS SCANNER
    // This will be used to autograde your solution
    public static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
      String repeated = repeatWord("hola", 3);
      System.out.println(repeated);
      String pyramid = createPyramid(5);
      System.out.println(pyramid);
      String FizzBuzz = countTo(10);
      System.out.println(FizzBuzz);
      
    }
    
    /**
     * Exercise 1: Word Repeater
     * Repeat the provided word the specified number of times
     * Example: word="hello" times=3 → "hello hello hello"
     */
    public static String repeatWord(String word, int times) {
       StringBuilder words = new StringBuilder("");
        // TODO: Implement this method
        // Use a while loop to build a string that repeats the word
        // Words should be separated by single spaces
        // No trailing space at the end
        int i = 1;
        
        
        while (i <= times) {
            words.append(word + " ");
            i += 1;
           
        }

        word = words.toString().trim();

        
        return word;

    
    }
    
    /**
     * Exercise 2: Number Pyramid
     * Create a string pyramid of numbers from 1 to maxNumber
     * Example: maxNumber=3 →
     * 1
     * 22
     * 333
     */
    public static String createPyramid(int maxNumber) {
       
            StringBuilder pyramid = new StringBuilder();  // StringBuilder to store the pyramid pattern
        
            int outer = 1;  
            while (outer <= maxNumber) {
                int inner = 0;
                
               
                while (inner < outer) {
                    pyramid.append(outer);  
                    inner += 1;
                }
                
                pyramid.append("\n");  
                outer += 1;  
            }
            
            return pyramid.toString(); 
        }
        
       
  

        
           
    
 
    
    
    /**
     * Exercise 3: Counting Game
     * Return a string of numbers replacing:
     * - Multiples of 3 with "Fizz"
     * - Multiples of 5 with "Buzz"
     * - Multiples of both with "FizzBuzz"
     * Example: countTo(6) → "1 2 Fizz 4 Buzz Fizz"
     */
    public static String countTo(int maxNumber) {
        StringBuilder result = new StringBuilder();  

        
        for (int i = 1; i <= maxNumber; i++) {
           
            if (i % 3 == 0 && i % 5 == 0) {
                result.append("FizzBuzz");
            }
            
            else if (i % 3 == 0) {
                result.append("Fizz");
            }
          
            else if (i % 5 == 0) {
                result.append("Buzz");
            }
        
            else {
                result.append(i);
            }

            if (i != maxNumber) {
                result.append(" ");
            }
        }

        return result.toString();  // Return the final result as a string
    }
}



    