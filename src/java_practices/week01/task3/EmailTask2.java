package java_practices.week01.task3;

import java.util.Locale;

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
        displayEmailInfoEmir("emir_yazici@gmail.com");
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

    public static void displayEmailInfoEmir(String email){

        String firstname = email.substring(0, email.indexOf("_")),
                lastname = email.substring(firstname.length() + 1, email.indexOf("@")),
                domain = email.substring(email.indexOf("@")+1,email.indexOf(".")),
                flfn = firstname.substring(0,1),// first letter of first name
                flln = lastname.substring(0,1); // first letter of last name


        System.out.println("Firstname = " +flfn.toUpperCase()+ firstname.substring(1));
        System.out.println("Lastname = " +flln.toUpperCase() +lastname.substring(1));
        System.out.println("Domain = " + domain);

    }

}
