package interview_codes.arrays;

public class FromOneTwoHundred {

    public static void main(String[] args) {

        int one = "A".length();
        int hundred = "AAAAAAAAAA".length();
        hundred *= hundred;

        while (hundred>=one){
            System.out.print(one + " ");
            one++;
        }


    }
}
