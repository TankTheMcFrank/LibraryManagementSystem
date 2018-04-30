public abstract class User {
   protected String name;
   protected String address;
   protected String emailAddress;
   protected String phoneNumber;
   protected String username;
   protected String password;
   protected String status;
   protected String rentalId;
   protected int rentalTimeRemaining;

   public User(String usernameIn, String passwordIn, String nameIn, 
   			String addressIn, String emailAddressIn, String phoneNumberIn, String statusIn,
            String rentalIdIn, int rentalTimeRemainingIn) {
      username = usernameIn;
      password = passwordIn;
      name = nameIn;
      address = addressIn;
      emailAddress = emailAddressIn;
      phoneNumber = phoneNumberIn;
      status = statusIn;
      rentalId = rentalIdIn;
      rentalTimeRemaining = rentalTimeRemainingIn;
   }
   
   public String getUsername() {
      return username;
   }
   
   public String getPassword() {
      return password;
   }
   
   public void setPassword(String passwordIn) {
      password = passwordIn;
   }
   
   public String getName() {
      return name;
   }
   
   public String getAddress() {
      return address;
   }
   
   public String getEmailAddress() {
      return emailAddress;
   }
   
   public String getPhoneNumber() {
      return phoneNumber;
   }
   
   public String getStatus() {
      return status;
   }
   
   public String getRentalId() {
      return rentalId;
   }
   
   public void setRentalId(String rentalIdIn) {
      rentalId = rentalIdIn;
   }
   
   public int getRentalTimeRemaining() {
      return rentalTimeRemaining;
   }
   
   public void setRentalTimeRemaining(int rentalTimeRemainingIn) {
      rentalTimeRemaining = rentalTimeRemainingIn;
   }
   
   public void setStatus(String statusIn) {
      if (!(statusIn.equals("0") || statusIn.equals("1"))) {
         System.out.println("Invalid input for status; User Status is left unchanged.");
         return;
      }
      
      status = statusIn;
   }

	// /*
// 	 * Returns 0 if not in database yet
// 	 * Returns 1 if librarian
// 	 * Returns 2 if Client in good status
// 	 * Returns 3 if Client in suspended status
// 	 */
   // public int checkUserAccountStatus() {
      // return 0;
   // }
   
   public String toString() {
      String output = "Username: " + username + "\n"
                  + "Password: " + password + "\n"
                  + "Name: " + name + "\n"
                  + "Address: " + address + "\n"
                  + "Email Address: " + emailAddress + "\n"
                  + "Phone Number: " + phoneNumber + "\n";
      if (status.equals("0")) {
         output += "Status: Good\n";
      } else { //status == 1
         output += "Status: Suspended\n";
      }
      return output;
   }
   
}