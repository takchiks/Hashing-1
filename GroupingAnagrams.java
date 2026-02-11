import java.math.BigInteger;
// time complexity is O(N k log k )
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // this is to check id we have already looked at a string with the same char
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] sortedArr = str.toCharArray();
            // sorting will produce the same for each anagram
            Arrays.sort(sortedArr);
            String sortedStr = String.valueOf(sortedArr);

            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }

            map.get(sortedStr).add(str);
        }

        return new ArrayList<>(map.values());
    }
}