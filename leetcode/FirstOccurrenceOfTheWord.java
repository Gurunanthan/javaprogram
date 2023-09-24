package leetcode;

public class FirstOccurrenceOfTheWord {
    public static int occur(String haystack, String needle) {
        int hayStacklength=haystack.length();
        int needlelength=needle.length();
        if(hayStacklength<needlelength)
            return -1;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j=0;
            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.print(occur("racecar","car")+"\n");
    }
}
