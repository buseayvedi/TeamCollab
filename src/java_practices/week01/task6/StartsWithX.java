package java_practices.week01.task6;

public class StartsWithX {
/*
Create a method that accept a String.
If the String starts with x, replace it with a.

Example;

                    Input:
                        xcodex
                    Output:
                        acodex

 */

    public static void main(String[] args) {

        System.out.println(startWithXMelike("xcodex"));
    }

    public static String startWithXMelike(String str){

        if(str.startsWith("x")){
            return "a" + str.substring(1);
        }else{
            return str;
        }

    }
}
