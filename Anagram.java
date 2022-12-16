public class Anagram {
    public static boolean Anagrams (String s, String s1){
        if (s.length() != s1.length()){
            return false;
        }
        for (int i = 0; i < s.length(); i ++){
            if (s.charAt(i) != s1.charAt(s.length()-1)){
                return false;
            } 
    }
    return true;
}}
