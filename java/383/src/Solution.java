import java.util.Hashtable;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public boolean canConstruct(String ransomNote, String magazine) {

        Hashtable<Character, Integer> hash = new Hashtable<>();

        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            hash.put(ch, hash.getOrDefault(ch, 0) + 1);
        }


        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            if (!hash.containsKey(ch) || hash.get(ch) == 0) {
                return false;
            }


            hash.put(ch, hash.get(ch) - 1);
        }

        return true;
    }
}