package java_practices.week01.task3;

public class EmailTask2 {
/*
   Create a method that can print out information about user based on email. Print first name, last name, and domain.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.
   First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

   Example:
               Input:
                   craig_federighi@apple.com

               Output:
                   First name: Craig
                   Last name: Federighi
                   Domain: apple
*/

    public static void main(String[] args) {

        displayEmailInfoMelike("craig_federighi@apple.com");
    }

    public static void displayEmailInfoMelike(String email){

        String firstName = formatName(email.substring(0,email.indexOf('_')));
        String lastName = formatName(email.substring(email.indexOf('_')+1, email.indexOf('@')));
        String domain = email.substring(email.indexOf('@')+1,email.indexOf('.'));

        System.out.println("First name = " + firstName);
        System.out.println("Last name = " + lastName);
        System.out.println("Domain = " + domain);
    }

    public static String formatName(String str){

        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();


    }

}
