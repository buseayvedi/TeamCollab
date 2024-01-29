package java_practices.week01.task4;

public class ReallyNeverMind {
 /*
Create a method that accept a String.If the String ends with "ly", print "really???" ,  otherwise, print "never mind".
 */

    public static void main(String[] args) {

        reallyNeverMindMelike("mely");
        reallyNeverMindMelike("melike");
        reallyNeverMindMelike("m");

        reallyNeverMindEmir("kelly");
        reallyNeverMindEmir("SILLY");
        reallyNeverMindEmir("roberTo");

    }

    public static void reallyNeverMindMelike(String str){

        try{
            String last2Letters = str.substring(str.length()-2);

            if(last2Letters.equals("ly")){
                System.out.println("really???");
            }else{
                System.out.println("never mind");
            }
        // if str length less than 2 it throws exception, then print str itself
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(str);
        }
    }

    public static void reallyNeverMindEmir(String str){

        str = str.trim();

        if(str.toLowerCase().endsWith("ly")){
            System.out.println("really???");
        }else {
            System.out.println("never mind");
        }

    }

}
