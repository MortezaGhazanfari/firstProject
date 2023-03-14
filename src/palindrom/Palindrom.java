package palindrom;

public class Palindrom {

    public static boolean isPalindrom(String s){
        System.out.println(s);
            if(s==null) return false;
            if(s.length() <= 1) return true;
            if(s.charAt(0) == s.charAt(s.length()-1)) {
                return isPalindrom(s.substring(1, s.length() - 1));
            }
        return false;
    }
}

