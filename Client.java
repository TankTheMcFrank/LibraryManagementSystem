public class Client extends User {
   private String userId;

   public Client(String usernameIn, String passwordIn, String nameIn, 
   					String addressIn, String emailAddressIn, 
   					String phoneNumberIn, String userIdIn) {
      super(usernameIn, passwordIn, nameIn, addressIn, 
         	emailAddressIn, phoneNumberIn);
      userId = userIdIn;
   }
   
   public String toString() {
      String output = super.toString()
                  + "User: Client";
      return output;
   }
}