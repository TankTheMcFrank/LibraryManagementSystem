import java.util.Scanner;

public class EventHandler {
   private LibraryManagementSystem system;
   static Scanner input = new Scanner(System.in);
   
   public EventHandler(LibraryManagementSystem systemIn) {
      system = systemIn;
   }
   
   public static void checkLoginCredentials() {
      System.out.println("Check Log In Credentials.\n");
   }
}