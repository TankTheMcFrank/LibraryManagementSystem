import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
   private Database database = new Database();
   private ArrayList<User> users;
   private ArrayList<Resource> resources;
   Scanner input = new Scanner(System.in);
   
   public LibraryManagementSystem() {
      users = database.loadUsers();
      resources = database.loadResources();
      
      //The following lines should only be uncommented
      //for testing purposes
      // for (User u : users) { 
         // System.out.println(u.toString() + "\n");
      // }
   }
   
   
	/* 
	 * Takes in a libraryIdNumber (int) and attempts to add
	 * resource to database
	 */
   public boolean addResource(int libraryIdNumber) {
      return false;
   }

	/* 
	 * Takes in a libraryIdNumber (int) and attempts to remove
	 * resource from database
	 */
   public void deleteResource(int libraryIdNumberIn) {
      for (Resource r : resources) {
         if (r.libraryIdNumber == libraryIdNumberIn) {
            r.decrementResourceCount();
            System.out.println("Avaialable count for this resource "
                              + "has been decremented.");
            if (r.getAvailableCount() + r.getCheckedOutCount() <= 0) {
               resources.remove(r);
               System.out.println("No more of resource "
                        + r.getLibraryIdNumber() + " available. It is removed "
                        + "from the database.");
            }
            return;
         }
      }
      
      //else, id not found
      System.out.println("Resource not found in Database.");
      return;
   }
   
   public boolean createNewUser(String usernameIn, String passwordIn, String nameIn, 
   			String addressIn, String emailAddressIn, String phoneNumberIn, String statusIn,
           String otherIdIn) {
      System.out.println("Select type of account to create:");
      System.out.println("\t1.) Client");
      System.out.println("\t2.) Librarian");
      System.out.print("Selection: ");
      int selection;
      
      try {
         selection = input.nextInt();
         input.nextLine(); //Clear the Scanner's buffer
            
         if (selection == 1) {
            Client newClient = new Client(usernameIn, passwordIn, nameIn,
                                             addressIn, emailAddressIn, phoneNumberIn,
                                             statusIn, otherIdIn);
            users.add(newClient);
            users.toString();
            return true;
         } else { //selecton == 2
            Librarian newLibrarian = new Librarian(usernameIn, passwordIn, nameIn,
                                             addressIn, emailAddressIn, phoneNumberIn,
                                             statusIn, otherIdIn);
            users.add(newLibrarian);
            users.toString();
            return true;
         }
      } catch (Exception e) {
         System.out.println("\nInvalid input.\n");
         input = null;
         input = new Scanner(System.in);
         return false;
      }
   }
   
   public boolean deleteUser(String usernameToDelete) {
      for (User u : users) {
         if (u.getUsername().equalsIgnoreCase(usernameToDelete)) {
            users.remove(u);
            System.out.println("User " + usernameToDelete + " successfully removed.");
            return true;
         }
      }
      
      //User not found
      System.out.println("No User with that Username was found in Database.");
      return false;
   }

	/*
	 * Takes in a username (String) and attempts to suspend
	 * the specified user account
	 */
   public boolean suspendAccount(String username) {
      return false;
   }

	// /*
// 	 * Takes in a username and password (String, String) and
// 	 * attempts to add a new user account
// 	 */
   // public boolean addAccount(String username, String password) {
      // return false;
   // }
// 
// 	/*
// 	 * Takes in a username (String) and attemps to delete the
// 	 * specified user account
// 	 */
   // public boolean deleteAccount(String username) {
      // return false;
   // }

	/*
	 * Takes in a username and libraryIdNumber (String, int) and
	 * attempts to check out the specified resource under the
	 * specified user's account
	 */
   public boolean checkOut(String username, int libraryIdNumber) {
      return false;
   }

	/*
	 * Takes in a username and libraryIdNumber (String, int) and
	 * attempts to check in the specified resource under the
	 * specified user's account
	 */
   public boolean checkIn(String username, int libraryIdNumber) {
      return false;
   }

	/*
	 * Takes in a username and a specialId (String, String) and
	 * attempts to validate the Librarian status of a user
	 */
   public User validateLibrarianAccount(String usernameIn, String passwordIn) {
      for (User u : users) {
         if (u.getUsername().equals(usernameIn)) { //If username is found in Database
            if (u.getPassword().equals(passwordIn) && u instanceof Librarian) {
               System.out.println("\nLibrarian account validated." 
                        + " Logging Librarian in.\n");
               return u;
               
            } else { //Passwords don't match
               break;
            }
         }
         //Else look at the next User
      }
      
      return null;
   }



/*
	 * Takes in a username and a specialId (String, String) and
	 * attempts to validate the Client status of a user
	 */
   public User validateClientAccount(String usernameIn, String passwordIn) {
      for (User u : users) {
         if (u.getUsername().equals(usernameIn)) { //If username is found in Database
            if (u.getPassword().equals(passwordIn) && u instanceof Client) {
               System.out.println("\nClient account validated." 
                        + " Logging Client in.\n");
               return u;
               
            } else { //Passwords don't match
               break;
            }
         }
         //Else look at the next User
      }
      
      return null;
   }
   
   public void makeResourceInquiry(int idIn) {
      for (Resource r : resources) {
         if (r.getLibraryIdNumber() == idIn) {
            System.out.println(r.toString());
            return;
         }
      }
      
      //else
      System.out.println("Library ID Number does not match any known resource.");
   }
   
   public void printData(int idIn) {
      System.out.println("Attempting to send data about desired resource to printer.");
      makeResourceInquiry(idIn);
   }
   
   public void changePassword(User currentUser, String oldPassword, String newPassword) {
      if (!currentUser.getPassword().equals(oldPassword)) {
         System.out.println("Old Passwords do not match.");
         return;
      }
      
      //else, change password
      
      currentUser.setPassword(newPassword);
      System.out.println("Success!");
   }
   
   public void reclaimPassword(String usernameIn, String addressIn) {
      for (User u : users) {
         if (u.getUsername().equals(usernameIn)) { //If username is found in Database
            if (u.getAddress().equals(addressIn)) {
               System.out.println("Match found... emailing User with password: "
                           + u.getPassword() + "\n");
               return;
               
            }
         }
         
         System.out.println("No matching accounts found.");
         //Else look at the next User
      }
   }
      
   public void editUserStatus(String usernameIn) {
      for (User u : users) {
         if (u.getUsername().equalsIgnoreCase(usernameIn)) {
            if (u.getStatus().equals("0")) {
               System.out.println("Status: Good");
            } else { //.equals("1")
               System.out.println("Status: Suspended");
            }
            
            System.out.println("New Status (0 for good, 1 for suspended: ");
            String statusIn = input.nextLine();
            
            u.setStatus(statusIn);
            
            return;
         }
      }
      
      //No user with this username found
      System.out.println("No account for this username has been found.");
      return;
   }
}
































