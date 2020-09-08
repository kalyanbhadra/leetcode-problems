public class ReverseInteger {
    public static void main(String[] args) {
        int i = Integer.MIN_VALUE;

        System.out.println("Reverse of " + i + " is : " + reverse(i));
    }
    public static int reverse(int x) {
        if(x == 0){
            return 0;
        }
        int sign = x < 0 ? -1 : 1;
        x=Math.abs(x);
        int result = 0;
        while(x != 0){
            if((result * 10 + x%10)*sign > Integer.MAX_VALUE || (result * 10 + x%10)*sign < Integer.MIN_VALUE){
                return 0;
            }
            result = result * 10 + x%10;
            System.out.println(result);
            x=x/10;
        }
        result = (result * 10 + x)*sign;
        return result;
    }
    
}