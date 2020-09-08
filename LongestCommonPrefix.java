
/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".

 * Example 1:
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] input = {"ffffff", "ffffffff", "ffff"};
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(input));
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        StringBuffer longestPrefix = new StringBuffer();
        boolean allPasses = true;
        for(int i = 0; i < strs[0].length(); i++){
            for(int j = 1; j < strs.length; j++){
                if(strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i)){
                    allPasses = false;
                    break;
                }
            }
            if(!allPasses){
                break;
            }
            longestPrefix.append(strs[0].charAt(i));
        }
        return longestPrefix.toString();
    }
}
