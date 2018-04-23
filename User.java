public abstract class User {
   private String name;
   private String address;
   private String emailAddress;
   private String phoneNumber;
   private String username;
   private String password;

   public User(String usernameIn, String passwordIn, String nameIn, 
   			String addressIn, String emailAddressIn, String phoneNumberIn) {
      username = usernameIn;
      password = passwordIn;
      name = nameIn;
      address = addressIn;
      emailAddress = emailAddressIn;
      phoneNumber = phoneNumberIn;
   }
   
   public String getUsername() {
      return username;
   }
   
   public String getPassword() {
      return password;
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

	/*
	 * Returns 0 if not in database yet
	 * Returns 1 if librarian
	 * Returns 2 if Client in good status
	 * Returns 3 if Client in suspended status
	 */
   public int checkUserAccountStatus() {
      return 0;
   }
   
   public String toString() {
      String output = "Username: " + username + "\n"
                  + "Password: " + password + "\n"
                  + "Name: " + name + "\n"
                  + "Address: " + address + "\n"
                  + "Email Address: " + emailAddress + "\n"
                  + "Phone Number: " + phoneNumber + "\n";
      return output;
   }
   
}