import java.util.Scanner;

public class WebInterface {
   Scanner input = new Scanner(System.in);
   LibraryManagementSystem system;
   User currentUser = null;

   public WebInterface(LibraryManagementSystem systemIn) {
      system = systemIn;
   }
   
   public void baseMenu() {
      int selection = -1;
      
      while (selection != 0) {
         System.out.println("Select an option below:");
         System.out.println("\t0.) Exit Web Interface");
         System.out.println("\t1.) Client Log In");
         System.out.println("\t2.) Librarian Log In");
         System.out.print("Selection: ");
      
         try {
            selection = input.nextInt();
            input.nextLine(); //Clear the Scanner's buffer
         } catch (Exception e) {
            System.out.println("\nInvalid input. Please try again.\n");
            input = null;
            input = new Scanner(System.in);
            continue;
         }
      
         switch (selection) {
            case 0:
               break;
            case 1:
               if (!clientLogIn()) {
                  System.out.println("Invalid login.\n");
                  break;
               }
               
               menuOptionsClient();
               break;
            case 2:
               if (!librarianLogIn()) {
                  System.out.println("Invalid login.\n");
                  break;
               }
               
               menuOptionsLibrarian();
               break;
            default:
               System.out.println("\nInvalid option. Please try again.\n");
               break;
         }
      
      }
   }  

   public boolean clientLogIn() {
      System.out.print("\nPlease enter your username: ");
      String usernameIn = input.nextLine();
      System.out.print("\nPlease enter your password: ");
      String passwordIn = input.nextLine();
      
      currentUser = system.validateClientAccount(usernameIn, passwordIn);
      
      if (currentUser != null) {
         System.out.println(currentUser.toString() + "\n");
         return true;
      } else {
         System.out.println("Client Does Not Exist.");
         return false;
      }
   }
   
   public boolean librarianLogIn() {
      System.out.print("\nPlease enter your username: ");
      String usernameIn = input.nextLine();
      System.out.print("\nPlease enter your password: ");
      String passwordIn = input.nextLine();
      
      currentUser = system.validateLibrarianAccount(usernameIn, passwordIn);
      
      if (currentUser != null) {
         System.out.println(currentUser.toString());
         return true;
      } else {
         System.out.println("Librarian Does Not Exist.");
         return false;
      }
   }

   // public boolean logIn() {
      // System.out.print("\nPlease enter your username: ");
      // String usernameIn = input.nextLine();
      // System.out.print("\nPlease enter your password: ");
      // String passwordIn = input.nextLine();
   //    
      // currentUser = system.validateAccount(usernameIn, passwordIn);
   //    
      // if (currentUser != null) {
         // System.out.println(currentUser.toString());
         // return true;
      // } else {
         // System.out.println("User Does Not Exist.");
         // return false;
      // }
   // }
   
   // public int menuOptions() {
      // if (currentUser instanceof Librarian) {
         // return menuOptionsLibrarian();
      // } else { //currentUser instanceof Client
         // return menuOptionsClient();
      // }
   // }
   
   private int menuOptionsClient() {
      int selection = -1;
      
      while (selection != 0) {
         System.out.println("\nSelect one of the options listed below: ");
         System.out.println("\t1.) Check Out Resource");
         System.out.println("\t2.) Check In Resource");
         System.out.println("\t0.) Log Out");
         System.out.print("Selection: ");
      
         try {
            selection = input.nextInt();
         
            switch (selection) {
               case 1:
                  System.out.println("\nThis is where you'll be able to check out a resource.");
                  break;
               
               case 2:
                  System.out.println("\nThis is where you'll be able to check in a resource.");
                  break;
               
               case 0:
                  System.out.println("\nLogging out...");
                  break;
               
               default:
                  System.out.println("\nInvalid input...");
            }
         } catch (Exception e) {
            System.out.println("Invalid Input.\n");
            input = null;
            input = new Scanner(System.in);
            continue;
         }
      }
      
      return 0;
   }
   
   private int menuOptionsLibrarian() {
      int selection = -1;
      
      while (selection != 0) {
         System.out.println("\nSelect one of the options listed below: ");
         System.out.println("\t1.) Check Out Resource");
         System.out.println("\t2.) Check In Resource");
         System.out.println("\t0.) Log Out");
         System.out.print("Selection: ");
      
         try {
            selection = input.nextInt();
         
            switch (selection) {
               case 1:
                  System.out.println("\nThis is where you'll be able to check out a resource.");
                  break;
               
               case 2:
                  System.out.println("\nThis is where you'll be able to check in a resource.");
                  break;
               
               case 0:
                  System.out.println("\nLogging out...");
                  break;
               
               default:
                  System.out.println("\nInvalid input...");
            }
         } catch (Exception e) {
            System.out.println("Invalid Input.\n");
            input = null;
            input = new Scanner(System.in);
            continue;
         }
      }         
      return selection;
   } 
}