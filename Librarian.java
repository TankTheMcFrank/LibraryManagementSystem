public class Librarian extends User {
   private String specialId;

   public Librarian(String usernameIn, String passwordIn, String nameIn, 
   					String addressIn, String emailAddressIn, 
   					String phoneNumberIn, String specialIdIn) {
      super(usernameIn, passwordIn, nameIn, addressIn, 
         	emailAddressIn, phoneNumberIn);
      specialId = specialIdIn;
   }
   
   public String toString() {
      String output = super.toString()
                  + "User: Librarian";
      return output;
   }
}