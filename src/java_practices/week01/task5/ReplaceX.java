package java_practices.week01.task5;

public class ReplaceX {
/*
Create a method that accept a String.And replace all the x or X with character a.

Example;
                    Input:
                        xcodeX
                    Output:
                        acodea
 */

    public static void main(String[] args) {

        System.out.println(replaceAllXMelike("xcodeX"));
        System.out.println(replaceAllXMelike("Dxllxs"));


    }

    public static String replaceAllXMelike(String str){

        str = str.replaceAll("x","a");
        str = str.replaceAll("X","a");
        return str;

    }



}
