package core.basesyntax;

public class Palindrome {

    public boolean isPalindrome(String text) {
        String str = text.toLowerCase().replaceAll("[^a-z0-9]","");
        StringBuilder strBuild = new StringBuilder(str);
        return strBuild.reverse().toString().equals(str);
    }
}
