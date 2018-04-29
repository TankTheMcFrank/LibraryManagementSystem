public class Client extends User {
   private String userId;

   public Client(String usernameIn, String passwordIn, String nameIn, 
   					String addressIn, String emailAddressIn, 
   					String phoneNumberIn, String statusIn, String userIdIn) {
      super(usernameIn, passwordIn, nameIn, addressIn, 
         	emailAddressIn, phoneNumberIn, statusIn);
      userId = userIdIn;
   }
   
   public String toString() {
      String output = super.toString()
                  + "User: Client";
      return output;
   }
}