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

    public static void main(String[] args) {

        System.out.println(swapNamesInEmail("melike_cora@gmail.com"));
        System.out.println(swapNamesInEmail("melikecora@gmail.com"));
        System.out.println(swapNamesInEmailBuse("buseayvedi@gmail.com"));
        System.out.println(swapNamesInEmailBuse("buse_ayvedi@gmail.com"));
//        System.out.println(swapNamesInEmailBuse("buseayvedigmail.com"));

    }

    public static String swapNamesInEmail(String email) {

        String[] arrEmailComponent = email.split("@");

        // if email does not contain "@" return email
        if (arrEmailComponent.length <= 1) {
            return email;
        }

        String[] arrName = arrEmailComponent[0].split("_");

        // if email does not contain "_" return email
        if (arrName.length <= 1) {
            return email;
        }

        // Swap name and concat other parts of email
        return arrName[1] + "_" + arrName[0] + "@" + arrEmailComponent[1];

    }

    public static String swapNamesInEmailBuse(String email){

        if (!(email.contains("@"))){
            throw new RuntimeException("Wrong email format");
        }
        boolean containsUnderScore = email.substring(0, email.indexOf('@')).contains("_");
        if (containsUnderScore){
            String name = email.substring(0, email.indexOf("_"));
            String surname = email.substring(email.indexOf("_")+1, email.indexOf("@"));
            return surname+"_"+name+email.substring(email.indexOf("@"));
        }else {
            return email;
        }

    }

}


