public class Main {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
   }

    static boolean isAnagram(String s, String t) {
        for (char v : s.toCharArray()) {
           var i = t.indexOf(v);
           if (i == -1) {
               return false;
           }

           t = t.replaceFirst(String.valueOf(v), "");
        }

        return t.isEmpty();
    }
}