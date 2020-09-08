import java.util.HashMap;
import java.util.Map;

/**
 * This class has a method to convert Roman number to Integer
 */
public class RomanToInt {
    private static Map<Character, Integer> conversionMap;
    static{
        conversionMap = new HashMap<>();
        conversionMap.put('I', 1);
        conversionMap.put('V', 5);
        conversionMap.put('X', 10);
        conversionMap.put('L', 50);
        conversionMap.put('C', 100);
        conversionMap.put('D', 500);
        conversionMap.put('M', 1000);
    }
    public static void main(final String[] args) {
        System.out.println(getInt("CCXLVIII"));//248
        System.out.println(getInt("CCC"));//300
    }

    private static int getInt(final String roman) {
        int r = 0;
        for(int i=0;i<roman.length(); i++){
            if(conversionMap.containsKey(roman.charAt(i))){
                if(i > 0 && conversionMap.get(roman.charAt(i)) > conversionMap.get(roman.charAt(i-1))){
                    r -= conversionMap.get(roman.charAt(i-1)); // undo previous add
                    r += conversionMap.get(roman.charAt(i)); // add current value
                    r -= conversionMap.get(roman.charAt(i-1)); // subtract the previous value
                }
                else{
                    r += conversionMap.get(roman.charAt(i));
                }
            }
        }
        return r;
    }
    
}
