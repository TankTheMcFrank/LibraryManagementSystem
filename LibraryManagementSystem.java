import java.util.ArrayList;

public class LibraryManagementSystem {
   private Database database = new Database();
   private ArrayList<User> users;
   
   public LibraryManagementSystem() {
      users = database.loadUsers();
      
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
   public boolean deleteResource(int libraryIdNumber) {
      return false;
   }

	/*
	 * Takes in a username (String) and attempts to suspend
	 * the specified user account
	 */
   public boolean suspendAccount(String username) {
      return false;
   }

	/*
	 * Takes in a username and password (String, String) and
	 * attempts to add a new user account
	 */
   public boolean addAccount(String username, String password) {
      return false;
   }

	/*
	 * Takes in a username (String) and attemps to delete the
	 * specified user account
	 */
   public boolean deleteAccount(String username) {
      return false;
   }

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
}
































