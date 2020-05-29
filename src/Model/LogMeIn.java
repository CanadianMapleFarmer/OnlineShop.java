package Model;

import java.util.Scanner;


public class LogMeIn {

    
    public static void main(String[] args) throws IllegalAccessException {
    String username ;
    String password;
    String yes_0r_no;
    String scann;
    String passscan;

    Scanner scan = new Scanner(System.in);
    Scanner scanner = new Scanner(System.in);

    Scanner name = new Scanner(System.in);
    System.out.println("Username:");
    username = name.next().toLowerCase();

    Scanner pass = new Scanner(System.in);
    System.out.println("Password:");
    password = pass.next().toLowerCase();


    System.out.println("You are logged in");

    Scanner ask = new Scanner(System.in);
    System.out.println("Do you want to check this or not(yes or no) :");

     yes_0r_no = ask.next().toLowerCase();



    while (true){
        if (yes_0r_no.equals("yes")){
            System.out.println("Username:");
          scann = scan.next().toLowerCase();
          if (scann == username) {
              continue;
          }
        System.out.println("Password:");
        passscan = scanner.next().toLowerCase();
        if (passscan.equals(password)) {
            System.out.println("You are logged in");
            break;

        }if (!password.equals(passscan)) {
            throw new IllegalAccessException();
            }
        }

        if (yes_0r_no.equals("no"))
            break ;



    }


}
    }
    

