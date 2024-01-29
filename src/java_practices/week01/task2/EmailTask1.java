package java_practices.week01.task2;

public class EmailTask1 {
/*

    Create a method that can swap first name with last name in the email (Separated by an underscore).
    Assume that email address is constructed by person's first name and followed by an underscore and last name.
    If the email doesn't contain an underscore print the given input email.

    Example;

            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
 */

    public static String swapNamesInEmail(String email){

        String [] arrEmailComponent = email.split("@");

        if(arrEmailComponent.length <= 1){
            return email;
        }

        String [] arrName = arrEmailComponent[0].split("_");

        if(arrName.length <= 1){
            return email;
        }

        return arrName[1] + "_" + arrName[0] + "@" + arrEmailComponent[1];

    }

}


