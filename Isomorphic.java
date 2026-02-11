public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        // to check the reverse order we need to store the reverse
        char[] isormofic = new char[95];
        char[] reverseIsormofic = new char[95];
        // O (N)
        for (int i = 0; i < s.length(); i++) {
            if (isormofic[s.charAt(i) - ' '] != 0) {
                if (reverseIsormofic[t.charAt(i) - ' '] != s.charAt(i)) return false;
            } else {
                // if reverse dont match then return false
                if (reverseIsormofic[t.charAt(i) - ' '] != 0) return false;
                reverseIsormofic[t.charAt(i) - ' '] = s.charAt(i);
                isormofic[s.charAt(i) - ' '] = t.charAt(i);
            }
        }
        return true;
    }
}