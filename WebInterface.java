import java.util.Scanner;

public class WebInterface {
   Scanner input = new Scanner(System.in);
   LibraryManagementSystem system;
   EventHandler handler;
   User currentUser = null;

   public WebInterface(LibraryManagementSystem systemIn) {
      system = systemIn;
      handler = new EventHandler(systemIn);
   }
   
   public void baseMenu() {
      int selection = -1;
      
      while (selection != 0) {
         System.out.println("Select an option below:");
         System.out.println("\t0.) Exit Web Interface");
         System.out.println("\t1.) Client Log In");
         System.out.println("\t2.) Librarian Log In");
         System.out.println("\t3.) Reclaim Password");
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
               LogInBtn.clicked();
               handler.checkLoginCredentials();
               if (!clientLogIn()) {
                  System.out.println("Invalid login.\n");
                  break;
               }
               
               menuOptionsClient();
               break;
            case 2:
               LogInBtn.clicked();
               handler.checkLoginCredentials();
               if (!librarianLogIn()) {
                  System.out.println("Invalid login.\n");
                  break;
               }
               
               menuOptionsLibrarian();
               break;
               
            case 3:
               System.out.print("Enter username: ");
               String usernameIn = input.nextLine();
               System.out.println("Security Question:");
               System.out.println("Enter your address as stored in the database: ");
               String answerIn = input.nextLine();
               system.reclaimPassword(usernameIn, answerIn);
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
         System.out.println("\t3.) Make Resource Inquiry");
         System.out.println("\t4.) Change Password");
         System.out.println("\t5.) Check Current User Status");
         System.out.println("\t0.) Log Out");
         System.out.print("Selection: ");
      
         try {
            selection = input.nextInt();
            input.nextLine(); //Clear buffer
         
            switch (selection) {
               case 1:
                  System.out.println("\nThis is where you'll be able to check out a resource.");
                  break;
               
               case 2:
                  System.out.println("\nThis is where you'll be able to check in a resource.");
                  break;
                  
               case 3:
                  System.out.print("Please Enter Library ID number: ");
                  system.makeResourceInquiry(input.nextInt());
                  break;
                  
               case 4:
                  System.out.print("Old Password: ");
                  String oldPassword = input.nextLine();
                  System.out.print("New Password: ");
                  String newPassword = input.nextLine();
                  System.out.print("Confirm New Password: ");
                  String confirmNewPassword = input.nextLine();
                  if (newPassword.equals(confirmNewPassword)) {
                     system.changePassword(currentUser, oldPassword, newPassword);
                  } else {
                     System.out.println("New passwords do not match.");
                  }
                  break;
                  
               case 5:
                  if (currentUser.getStatus().equals("0")) {
                     System.out.println("Status: Good\n");
                  } else { //.equals("1")
                     System.out.println("Status: Suspended\n");
                  }
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
         System.out.println("\t3.) Make Resource Inquiry");
         System.out.println("\t4.) Create User Account");
         System.out.println("\t5.) Delete User Account");
         System.out.println("\t6.) Add Resource");
         System.out.println("\t7.) Delete Resource");
         System.out.println("\t8.) Print Data about Resource");
         System.out.println("\t9.) Change Password");
         System.out.println("\t10.) Check Current User Status");
         System.out.println("\t11.) Edit User Status");
         System.out.println("\t0.) Log Out");
         System.out.print("Selection: ");
      
         try {
            selection = input.nextInt();
            input.nextLine(); //Clear buffer
         
            switch (selection) {
               case 1:
                  System.out.println("\nThis is where you'll be able to check out a resource.");
                  break;
               
               case 2:
                  System.out.println("\nThis is where you'll be able to check in a resource.");
                  break;
                  
               case 3:
                  System.out.print("Please Enter Library ID number: ");
                  system.makeResourceInquiry(input.nextInt());
                  break;
                  
               case 4:
                  //input.nextLine(); //clear buffer
                  System.out.print("Username: ");
                  String usernameIn = input.nextLine();
                  System.out.print("Password: ");
                  String passwordIn = input.nextLine();
                  System.out.print("Name: ");
                  String nameIn = input.nextLine();
                  System.out.print("Address: ");
                  String addressIn = input.nextLine();
                  System.out.print("Email Address: ");
                  String emailAddressIn = input.nextLine();
                  System.out.print("Phone Number: ");
                  String phoneNumberIn = input.nextLine();
                  System.out.print("Status (0 or 1): ");
                  String statusIn = input.nextLine();
                  System.out.print("ID: ");
                  String otherIdIn = input.nextLine();
                  
                  system.createNewUser(usernameIn, passwordIn, nameIn,
                                             addressIn, emailAddressIn, phoneNumberIn,
                                             statusIn, otherIdIn);
                  break;                            
                 
               case 5:
                  System.out.print("Username of User to be deleted: ");
                  String username = input.nextLine();
                  
                  system.deleteUser(username);
                  
                  break;
                  
               case 6:
                  //Add Resource
                  break;
                  
               case 7:
                  System.out.print("Please enter the Library ID Number of the "
                                    + "resource you wish to delete: ");
                  int id = input.nextInt();
                  input.nextLine(); //Clear buffer
                  system.deleteResource(id);
                  break;
                  
               case 8:
                  System.out.print("Please Enter Library ID number to Print: ");
                  system.printData(input.nextInt());
                  break;
                  
               case 9:
                  System.out.print("Old Password: ");
                  String oldPassword = input.nextLine();
                  System.out.print("New Password: ");
                  String newPassword = input.nextLine();
                  System.out.print("Confirm New Password: ");
                  String confirmNewPassword = input.nextLine();
                  if (newPassword.equals(confirmNewPassword)) {
                     system.changePassword(currentUser, oldPassword, newPassword);
                  } else {
                     System.out.println("New passwords do not match.");
                  }
                  break;
                  
               case 10:
                  if (currentUser.getStatus().equals("0")) {
                     System.out.println("Status: Good\n");
                  } else { //.equals("1")
                     System.out.println("Status: Suspended\n");
                  }
                  break;
            
               case 11:
                  System.out.print("Specify Username to change status of: ");
                  String userIn = input.nextLine();
                  system.editUserStatus(userIn);
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