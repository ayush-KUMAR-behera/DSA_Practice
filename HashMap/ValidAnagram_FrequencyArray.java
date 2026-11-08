package HashMap;

/**
 * ValidAnagram_FrequencyArray
 */
public class ValidAnagram_FrequencyArray {

    public static void main(String[] args) {
        String s1="car";
        String s2="cat";
        String s3="arc";
        System.out.println(isAnagram(s1, s2));
        System.out.println(isAnagram(s1, s3));
    }

    public static  boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return  false;
        }

        int[] charCount=new int[26];
        for(int i=0;i<s1.length();i++){
            charCount[s1.charAt(i)-'a']++;
            charCount[s2.charAt(i)-'a']--;
        }

        for(int count:charCount){
            if(count!=0){
                return  false;
            }
        }

        return  true;
    }
}