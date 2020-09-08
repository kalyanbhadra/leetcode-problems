public class Palindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome(-1121));
    }

    public static boolean isPalindrome(int x) {
        if(x >= 0){
            return false;
        }
        else {
            String s = Integer.toString(x);
            String rev = new StringBuilder(s).reverse().toString();
            if(s.equals(rev)){
                return true;
            }
            else{
                return false;
            }
        }
    }
}