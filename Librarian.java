public class Librarian extends User {
   private String specialId;

   public Librarian(String usernameIn, String passwordIn, String nameIn, 
   					String addressIn, String emailAddressIn, 
   					String phoneNumberIn, String statusIn, String rentalIdIn, int rentalTimeRemainingIn,
                  String specialIdIn) {
      super(usernameIn, passwordIn, nameIn, addressIn, 
         	emailAddressIn, phoneNumberIn, statusIn, rentalIdIn, rentalTimeRemainingIn);
      specialId = specialIdIn;
   }
   
   public String toString() {
      String output = super.toString()
                  + "User: Librarian\n"
                  + "Rental ID: " + rentalId + "\n"
                  + "Rental Time Remaining: " + rentalTimeRemaining;
      return output;
   }
}