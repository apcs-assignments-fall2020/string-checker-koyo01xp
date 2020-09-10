import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        String str2 = str.toLowerCase();
        int counter = 0;
        for (int a = 0; a < str2.length() ;a++) { 
            if ((str2.charAt(a)=='a')||(str2.charAt(a)=='b')||(str2.charAt(a)=='c')) {
                counter = counter + 1;
            }
        }
        return counter;
        
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        int idx1 = str.indexOf("the");
        int idx2 = str.indexOf("The");
        if ((idx1 >= 0)||(idx2 >= 0)) {
            return true; 
        }
        else if((idx1 < 0)||(idx2 < 0)) {
            return false;
        }
        else {
            return false;
        }
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        for (int i = 0;i <= str.length()/2;i++) {
            if (str.charAt(i) == (str.charAt(str.length()-i-1))) {
                continue; 
            }
            else if (i == str.length()/2) {
                return true;
            }
            else {
                return false;
            }    

            }
        return true;     
        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String name = scan.nextLine();
        System.out.println(name);
        System.out.println("Your string contains " + countABC(name) + " a's, b's, or c's");
        if (containsThe(name) == true) {
            System.out.println("Your string DOES contain the");
        }
        else if(containsThe(name) == false) {
            System.out.println("Your string DOES NOT contain the");
        }    
        if (isPalindrome(name) == true){
            System.out.println("Your string IS a palindrome");
        }
        else if(isPalindrome(name) == false) {
            System.out.println("Your string IS NOT a palindrome");
        }    
        
        }
    }

