import java.util.Scanner;

public class Library {

   public static void main(String args[]) {
      LibraryManagementSystem system = new LibraryManagementSystem();
      WebInterface web = new WebInterface(system);
   	
      boolean loggedIn = false;
      int selection = -1;
      Scanner input = new Scanner(System.in);
      
      while (selection != 0) { //0 = log out
         System.out.println("\nSelection an option below:");
         System.out.println("\t0.) Exit Program");
         System.out.println("\t1.) Enter Web Interface");
         System.out.print("Selection: ");
         try {
            selection = input.nextInt();
         } catch (Exception e) {
            System.out.println("\nInvalid input.\nTryAgain.");
            input = null;
            input = new Scanner(System.in);
            continue;
         }
         
         if (selection == 0) { //They chose to exit the program
            break;
         } else if (selection == 1) { //They chose to enter the web interface
            System.out.println("\n\nWelcome to the Web Interface!");
            web.baseMenu();
         } else { //Invalid option selected
            System.out.println("\nInvalid option. Please try again.");
            continue;
         }
      }
      
      System.out.println("\nExiting the program...");
      
      /**
       * The following code, which should be commented out, is 
       * deprecated. It remains to serve as a reference until the
       * seperate clientLogIn() and libraryLogIn() methods have
       * been filled out in WebInterface.java
       */
      // while (!loggedIn) {
         // if (web.logIn() == true) {
            // loggedIn = true;
         // } else {
            // System.out.println("\nIncorrect Login Credentials");
         // }
      // }
   //    
      // boolean logOut = false;
      // while (!logOut) {
         // int selection = web.menuOptions();
      //    
         // switch (selection){
            // case 0:
               // logOut = true;
               // break;
            // default:
               // break;
         // }
      // }
   }
}