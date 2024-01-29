package java_practices.week01.task1;

public class CombineWords {
    /*
    Create a method that can combine two Strings then print the combined version.
    But if the last letter of the first String and the first letter of the second String is the same, print that character once.

    Example;
                Input:
                   String1= one
                   String2 = eight
                Output:
                     oneight
     */
    public static void main(String[] args) {

        System.out.println(combineWordsBuse("one", "eight"));
        System.out.println(combineWordsBuse("java", "python"));

    }
    public static String combineWordsBuse(String str1, String str2){
        if(str1.charAt(str1.length()-1) == str2.charAt(0)){
            return str1+str2.substring(1);
        }else{
            return str1+str2;
        }
    }

    public static String combineWordsMelike(String str1, String str2){

        String result = "";

        if(str1.charAt(str2.length()-1) == str2.charAt(0)){
            result = str1.substring(0,str1.length())+ str2;
        }else{
            result = str1 + str2;
        }

        return result;

    }

}
