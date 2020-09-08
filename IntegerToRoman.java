import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.IntStream;

/**
 * This class has a method to convert Integer number to Roman
 */
public class IntegerToRoman {
    private static Map<Integer, String> conversionMap;
    static{
        conversionMap = new TreeMap<>(Collections.reverseOrder());
        conversionMap.put(1000, "M");
        conversionMap.put(900, "CM");
        conversionMap.put(500, "D");
        conversionMap.put(400, "CD");
        conversionMap.put(100, "C");
        conversionMap.put(90, "XC");
        conversionMap.put(50, "L");
        conversionMap.put(40, "XL");
        conversionMap.put(10, "X");
        conversionMap.put(9, "IX");
        conversionMap.put(5, "V");
        conversionMap.put(4, "IV");
        conversionMap.put(1, "I");
    }
    public static void main(String[] args) {
        System.out.println(getRoman(248));//CCXLVIII
        System.out.println(getRoman(300));//CCC
    }

    private static String getRoman(int i) {
        StringBuffer sb = new StringBuffer();
        Iterator<Integer> iter = conversionMap.keySet().iterator();
        while(iter.hasNext()){
            int k = iter.next();
            int div = i / k;
            if(div > 0){
                IntStream.range(0, div).forEach(p->sb.append(conversionMap.get(k)));
                i = i % k;
            }
        }

        return sb.toString();
    }
    
}
