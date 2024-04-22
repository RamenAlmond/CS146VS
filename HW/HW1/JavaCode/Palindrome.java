package HW.HW1.JavaCode;


public class Palindrome{
    public static void main(String[] args) {
        Palindrome test = new Palindrome();
        String a = "Testtset";
        String b = "Test";
        System.out.println(test.isPalindrome(a));
        System.out.println(test.isPalindrome(b));
    }
    public boolean isPalindrome(String text){
        int start = 0;
        int last = text.length() - 1;
        while(start <= last) {
        	char currFirst = text.charAt(start);
        	char currLast = text.charAt(last);
        	if (!Character.isLetterOrDigit(currFirst)) {
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
    }
}