public class Client extends User {
   private String userId;

   public Client(String usernameIn, String passwordIn, String nameIn, 
   					String addressIn, String emailAddressIn, 
   					String phoneNumberIn, String statusIn, 
                 String rentalIdIn, int rentalTimeRemainingIn,
                 String userIdIn) {
      super(usernameIn, passwordIn, nameIn, addressIn, 
         	emailAddressIn, phoneNumberIn, statusIn, rentalIdIn, rentalTimeRemainingIn);
      userId = userIdIn;
   }
   
   public String getRentalId() {
      return rentalId;
   }
   
   public int getRentalTimeRemaining() {
      return rentalTimeRemaining;
   }
   
   public String toString() {
      String output = super.toString()
                  + "User: Client\n"
                  + "Rental ID: " + rentalId + "\n"
                  + "Rental Time Remaining: " + rentalTimeRemaining;
      return output;
   }
}