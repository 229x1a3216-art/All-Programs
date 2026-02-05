import java.util.Scanner;

public class Launch1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();
	        str = str.replaceAll("\\s+", "").toLowerCase(); // Remove spaces and ignore case
	        boolean isPalindrome = true;
	        int n = str.length();
	        for (int i = 0; i < n / 2; i++) {
	            if (str.charAt(i) != str.charAt(n - 1 - i)) {
	                isPalindrome = false;
	                break;
	            }
	        }
	        if (isPalindrome) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is NOT a palindrome.");
	        }
	        sc.close();
	    }
	}




