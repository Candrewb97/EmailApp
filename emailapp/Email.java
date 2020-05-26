package src.emailapp;
import java.util.Scanner;

public class Email {
    private String firstName, lastName, password, department, alternateEmail, email, companySuffix = "aeycompany.com";
    private int mailboxCapacity = 500, defaultPasswordLength = 10, depChoice;

    //constructor to receive first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        //call the ask for dept method
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //call random password method
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password );

        //combine elements to generte email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + depChoice + companySuffix;
        System.out.println("Your email is: " + email);
    }

    //ask for the department
    private String setDepartment() {
        System.out.print("DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {return "";
        }
    }


    //generate a random password
    private String randomPassword(int length) {
        String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%=&;,.@ ";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
           int rand = (int) (Math.random() * passwordSet.length());
        }
        return new String(password);
    }

    //set the mailbox capacity
    public void setMailboxCapacity ( int capacity){
        this.mailboxCapacity = capacity;
    }

    //set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    //change the password
    public void changePassword(String password){
        this.password = password; 
    
        }

       //Getters 
    public int getMailboxCapacity () { 
        return mailboxCapacity; 
        }   
    public String getAlternateEmail() {
        return alternateEmail;
        }
    public String getPassword(){
        return password;
        }

    public String showInfo(){
        return "Display Name:" + firstName + " " + lastName + 
                "\nCompany Email: " + email +
                "\nMailbox Capacity:" + mailboxCapacity + "mb";
    }
}