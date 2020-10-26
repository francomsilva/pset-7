public class ProblemSet7 {
    public static void main(String[] args) {

    }

    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */
    public String surroundMe(String in, String out) {
        if (in == null || out == null || out.length() != 4) {
            return in;
        }
        else {
            String firstHalf = out.substring(0,2);
            String secondHalf = out.substring(2,4);
            String newString = firstHalf + in + secondHalf;
            return newString;
        }
    }

    /*
     * Exercise 2.
     *
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text (overlapping, as needed).
     */
    public String endsMeet(String text, int n) {
        if (text == null || (text.length() > 10 || text.length() < 1) || (n<1 || n>text.length())) {
            return text;
        }
        else {
            String firstHalf = text.substring(0,n);
            String secondHalf = text.substring(text.length()-n, text.length());
            String newString = firstHalf + secondHalf;
            return newString;
        }
    }

    /*
     * Exercise 3.
     *
     * Given a string, return a new string using the middle three characters of text.
     */
    public String middleMan(String text) {
        if (text == null || text.length() % 2 != 1 || text.length() < 3) {
            return text;
        }
        else {
            String newString = text.substring((text.length()/2)-1, text.length()/2+2);
            return newString;
        }
    }
    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */
    public boolean isCentered(String text, String target) {
        if (text == null || text.length() % 2 != 1 || text.length() < 3 || target == null || target.length() != 3) {
            return false;
        }
        else {
            String middleString = text.substring((text.length()/2)-1, text.length()/2+2);
            if (middleString.equals(target)) {
                return true;
            }
            else {
                return false;
            }
        }
    }

    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */
    public int countMe(String text, char suffix) {
        if(text == null || !Character.isLetter(suffix)){
            return -1;
        }
        int count = 0;
        String[] arr = text.split(" ");
        for(String i : arr){
            if(i.charAt(i.length()-1) == suffix){
                count++;
            }
        }
        return count;
    }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */
    public int triplets(String text) {
        int count;
        if (text == null) {
            return -1;
        }
        else {
            count = 0;
            for (int i = 1; i < text.length()-1; i++) {
                if (text.charAt(i) == (text.charAt(i-1)) && text.charAt(i) == text.charAt(i+1)) {
                    count +=1;
                }
            }
            return count;
        }
    }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */
    public long addMe(String text) {
        long sum;
        if (text == null) {
            return -1;
        }
        else {
            sum = 0;
            for (int i = 0; i < text.length(); i ++) {
                if (Character.isDigit(text.charAt(i))) {
                    sum += Integer.parseInt(text.valueOf(text.charAt(i)));
                }
            }
            return sum;
        }
    }

    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */
    public long sequence(String text) {
        char nextCharacter;
        int count = 1;
        int number = 1;
        if (text == null) {
            return -1;
        } else if (text.isEmpty() || text.isBlank()) {
            return 0;
        } else if (text.length() == 1) {
            return 1;
        } else {
            for (int n = 0; n < text.length(); n++) {
                char character = text.charAt(n);
                if (n + 1 == text.length()) {
                    break;
                } else {
                    nextCharacter = text.charAt(n + 1);
                }
                if (character == nextCharacter) {
                    count++;
                }
                if (count > number) {
                    number = count;
                    count= 1;
                }
            }
            return number;
        }
    }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */
    public String intertwine(String a, String b) {
        String intertwine = "";
        int lengthOfA = a.length();
        int lengthOfB = b.length();
        int length = 0;
        if(lengthOfA >= lengthOfB){
            length = lengthOfA;
        }else if (lengthOfB > lengthOfA){
            length = lengthOfB;
        }
        for(int i = 0; lengthOfA < length; i++){
            if(i < lengthOfA){
                intertwine+=Character.toString(a.charAt(i));
            }
            if(i < lengthOfB){
                intertwine+=Character.toString(b.charAt(i));
            }
        }
        return intertwine;
    }

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */
    public boolean isPalindrome(String text) {
        if(text == null){
            return false;
        }
        String reverseText = "";
        for(int i = text.length()-1; i >= 0; i--){
            reverseText += Character.toString(text.charAt(i));
        }
        if(reverseText.equals(text)){
            return true;
        }else{
            return false;
        }
    }
}