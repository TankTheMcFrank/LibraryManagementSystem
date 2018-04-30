import java.io.IOException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Database {
	
   public Database() {
      loadUsers();
      loadResources();
   }

   public ArrayList<User> loadUsers() {
      try {
         Scanner fileInput = new Scanner(new File("users.txt"));
         Scanner nextLine;
         String nextData;
         ArrayList<User> users = new ArrayList<User>();
      
         while (fileInput.hasNext()) {
            nextLine = new Scanner(fileInput.nextLine());
            nextLine.useDelimiter(",");
         
            String username = nextLine.next();
            String password = nextLine.next();
            String name = nextLine.next();
            String address = nextLine.next();
            String emailAddress = nextLine.next();
            String phoneNumber = nextLine.next();
            String status = nextLine.next();
            String rentalId = nextLine.next();
            int remainingTime = nextLine.nextInt();
            String Id = nextLine.next();
         
            if (Id.equals("0")) { //Client
               users.add(new Client(username, password, name, address,
                        emailAddress, phoneNumber, status, rentalId, remainingTime, Id));
            }
            else { //Id.equals("1") ((Librarian))
               users.add(new Librarian(username, password, name, address,
                        emailAddress, phoneNumber, status, rentalId, remainingTime, Id));
            }
         }
      
         fileInput.close();
         return users;
      } 
      catch (IOException e) {
         System.out.println("Error loading users from Database");
      }
      return null;
   }
   
   public ArrayList<Resource> loadResources() {
      try {
         Scanner fileInput = new Scanner(new File("resources.txt"));
         Scanner nextLine;
         String nextData;
         ArrayList<Resource> resources = new ArrayList<Resource>();
      
         while (fileInput.hasNext()) {
            nextLine = new Scanner(fileInput.nextLine());
            nextLine.useDelimiter(",");
            Resource res;
            String classOfResource = nextLine.next();
            switch (classOfResource) {
               case "HardCopy":
                  res = createHardCopy(nextLine);
                  if (res != null) {
                     resources.add(res);
                  }
                  break;
                  
               case "SoftCopy":
                  res = createSoftCopy(nextLine);
                  if (res != null) {
                     resources.add(res);
                  }
                  break;
                  
               case "Audio":
                  res = createAudio(nextLine);
                  if (res != null) {
                     resources.add(res);
                  }
                  break;
               
               case "Electronic":
                  res = createElectronic(nextLine);
                  if (res != null) {
                     resources.add(res);
                  }
                  break;
                  
               case "Cassette":
                  res = createCassette(nextLine);
                  if (res != null) {
                     resources.add(res);
                  }
                  break;
               
               case "VHS":
                  res = createVHS(nextLine);
                  if (res != null) {
                     resources.add(res);
                  }
                  break;
                  
               case "CD":
                  res = createCD(nextLine);
                  if (res != null) {
                     resources.add(res);
                  }
                  break;
                  
               case "DVD":
                  res = createDVD(nextLine);
                  if (res != null) {
                     resources.add(res);
                  }
                  break;
                  
               case "Newspaper":
                  res = createNewspaper(nextLine);
                  if (res != null) {
                     resources.add(res);
                  }
                  break;
                  
               case "Magazine":
                  res = createMagazine(nextLine);
                  if (res != null) {
                     resources.add(res);
                  }
                  break;
                  
               case "WhiteBoard":
                  res = createWhiteBoard(nextLine);
                  if (res != null) {
                     resources.add(res);
                  }
                  break;
                  
               case "Laptop":
                  res = createLaptop(nextLine);
                  if (res != null) {
                     resources.add(res);
                  }
                  break;
                  
               case "Desktop":
                  res = createDesktop(nextLine);
                  if (res != null) {
                     resources.add(res);
                  }
                  break;
               
               default:
                  System.out.println(classOfResource + "Unknown resource"
                              + " found in database.");
            }
         }
      
         fileInput.close();
         
         //Output all the resources and their information
         // for (Resource r : resources) {
            // System.out.println(r.toString() + "\n\n");
         // }
         
         return resources;
      } 
      catch (IOException e) {
         System.out.println("Error loading resources from Database");
      }
      return null;
   }
   
   /*
    * createHardCopy finishes scanning in a HardCopy object
    * from resources.txt
    */
   public HardCopy createHardCopy(Scanner input) {
      try {
         int libraryIdNumber = input.nextInt();
         String rentalTimeDuration = input.next();
         int reservationCount = input.nextInt();
         int availableCount = input.nextInt();
         int checkedOutCount = input.nextInt();
         String title = input.next();
         String author = input.next();
         String genre = input.next();
         String publisher = input.next();
         String edition = input.next();
         return new HardCopy(libraryIdNumber, rentalTimeDuration, reservationCount,
               availableCount, checkedOutCount, title, author, genre, publisher, edition);
      } 
      catch (Exception e) {
         System.out.println("Error reading in HardCopy Book from Database.");
      }
      return null;
   }
   
   /*
    * createSoftCopy finishes scanning in a SoftCopy object
    * from resources.txt
    */
   public SoftCopy createSoftCopy(Scanner input) {
      try {
         int libraryIdNumber = input.nextInt();
         String rentalTimeDuration = input.next();
         int reservationCount = input.nextInt();
         int availableCount = input.nextInt();
         int checkedOutCount = input.nextInt();
         String title = input.next();
         String author = input.next();
         String genre = input.next();
         String publisher = input.next();
         String edition = input.next();
         return new SoftCopy(libraryIdNumber, rentalTimeDuration, reservationCount,
               availableCount, checkedOutCount, title, author, genre, publisher, edition);
      } 
      catch (Exception e) {
         System.out.println("Error reading in SoftCopy Book from Database.");
      }
      return null;
   }
   
   /*
    * createAudio finishes scanning in a Audio object
    * from resources.txt
    */
   public Audio createAudio(Scanner input) {
      try {
         int libraryIdNumber = input.nextInt();
         String rentalTimeDuration = input.next();
         int reservationCount = input.nextInt();
         int availableCount = input.nextInt();
         int checkedOutCount = input.nextInt();
         String title = input.next();
         String author = input.next();
         String genre = input.next();
         String publisher = input.next();
         String edition = input.next();
         String duration = input.next();
         return new Audio(libraryIdNumber, rentalTimeDuration, reservationCount,
               availableCount, checkedOutCount, title, author, genre, publisher, edition, duration);
      } 
      catch (Exception e) {
         System.out.println("Error reading in Audio Book from Database.");
      }
      return null;
   }
   
   /*
    * createElectronic finishes scanning in an Electronic object
    * from resources.txt
    */
   public Electronic createElectronic(Scanner input) {
      try {
         int libraryIdNumber = input.nextInt();
         String rentalTimeDuration = input.next();
         int reservationCount = input.nextInt();
         int availableCount = input.nextInt();
         int checkedOutCount = input.nextInt();
         String title = input.next();
         String author = input.next();
         String genre = input.next();
         String publisher = input.next();
         String edition = input.next();
         return new Electronic(libraryIdNumber, rentalTimeDuration, reservationCount,
               availableCount, checkedOutCount, title, author, genre, publisher, edition);
      } 
      catch (Exception e) {
         System.out.println("Error reading in Electronic Book from Database.");
      }
      return null;
   }
   
   /*
    * createCassette finishes scanning in an Cassette object
    * from resources.txt
    */
   public Cassette createCassette(Scanner input) {
      try {
         int libraryIdNumber = input.nextInt();
         String rentalTimeDuration = input.next();
         int reservationCount = input.nextInt();
         int availableCount = input.nextInt();
         int checkedOutCount = input.nextInt();
         String duration = input.next();
         String composer = input.next();
         return new Cassette(libraryIdNumber, rentalTimeDuration, reservationCount, 
                  availableCount, checkedOutCount, duration, composer);
      } 
      catch (Exception e) {
         System.out.println("Error reading in Cassette Tape from Database.");
      }
      return null;
   }
   
   /*
    * createVHS finishes scanning in an VHS object
    * from resources.txt
    */
   public VHS createVHS(Scanner input) {
      try {
         int libraryIdNumber = input.nextInt();
         String rentalTimeDuration = input.next();
         int reservationCount = input.nextInt();
         int availableCount = input.nextInt();
         int checkedOutCount = input.nextInt();
         String duration = input.next();
         String director = input.next();
         return new VHS(libraryIdNumber, rentalTimeDuration, reservationCount, 
                  availableCount, checkedOutCount, duration, director);
      } 
      catch (Exception e) {
         System.out.println("Error reading in Cassette Tape from Database.");
      }
      return null;
   }
   
   /*
    * createCD finishes scanning in an CD object
    * from resources.txt
    */
   public CD createCD(Scanner input) {
      try {
         int libraryIdNumber = input.nextInt();
         String rentalTimeDuration = input.next();
         int reservationCount = input.nextInt();
         int availableCount = input.nextInt();
         int checkedOutCount = input.nextInt();
         String duration = input.next();
         String title = input.next();
         String composer = input.next();
         return new CD(libraryIdNumber, rentalTimeDuration, reservationCount,
                  availableCount, checkedOutCount, duration, title, composer);
      } 
      catch (Exception e) {
         System.out.println("Error reading in Cassette Tape from Database.");
      }
      return null;
   }
   
   /*
    * createDVD finishes scanning in an DVD object
    * from resources.txt
    */
   public DVD createDVD(Scanner input) {
      try {
         int libraryIdNumber = input.nextInt();
         String rentalTimeDuration = input.next();
         int reservationCount = input.nextInt();
         int availableCount = input.nextInt();
         int checkedOutCount = input.nextInt();
         String duration = input.next();
         String title = input.next();
         String director = input.next();
         return new DVD(libraryIdNumber, rentalTimeDuration, reservationCount,
                  availableCount, checkedOutCount, duration, title, director);
      } 
      catch (Exception e) {
         System.out.println("Error reading in Cassette Tape from Database.");
      }
      return null;
   }

   /*
    * createNewspaper finishes scanning in a Newspaper object
    * from resources.txt
    */
   public Newspaper createNewspaper(Scanner input) {
      try {
         int libraryIdNumber = input.nextInt();
         String rentalTimeDuration = input.next();
         int reservationCount = input.nextInt();
         int availableCount = input.nextInt();
         int checkedOutCount = input.nextInt();
         String title = input.next();
         String author = input.next();
         String edition = input.next();
         String publisher = input.next();
         return new Newspaper(libraryIdNumber, rentalTimeDuration, reservationCount, 
                              availableCount, checkedOutCount, title, author, edition, publisher);
      } 
      catch (Exception e) {
         System.out.println("Error reading in Newspaper from Database.");
      }
      return null;
   }
   
   /*
    * createMagazine finishes scanning in a Magazine object
    * from resources.txt
    */
   public Magazine createMagazine(Scanner input) {
      try {
         int libraryIdNumber = input.nextInt();
         String rentalTimeDuration = input.next();
         int reservationCount = input.nextInt();
         int availableCount = input.nextInt();
         int checkedOutCount = input.nextInt();
         String title = input.next();
         String author = input.next();
         String edition = input.next();
         String publisher = input.next();
         return new Magazine(libraryIdNumber, rentalTimeDuration, reservationCount, 
                              availableCount, checkedOutCount, title, author, edition, publisher);
      } 
      catch (Exception e) {
         System.out.println("Error reading in Magazine from Database.");
      }
      return null;
   }
   
   /*
    * createWhiteboard finishes scanning in a WhiteBoard object
    * from resources.txt
    */
   public WhiteBoard createWhiteBoard(Scanner input) {
      try {
         int libraryIdNumber = input.nextInt();
         String rentalTimeDuration = input.next();
         int reservationCount = input.nextInt();
         int availableCount = input.nextInt();
         int checkedOutCount = input.nextInt();
         String returnLabel = input.next();
         String expoMarkers = input.next();
         String expoErasers = input.next();
         return new WhiteBoard(libraryIdNumber, rentalTimeDuration, reservationCount, 
                              availableCount, checkedOutCount, returnLabel, expoMarkers, expoErasers);
      } 
      catch (Exception e) {
         System.out.println("Error reading in Whiteboard from Database.");
      }
      return null;
   }
   
   /*
    * createLaptop finishes scanning in a Laptop object
    * from resources.txt
    */
   public Laptop createLaptop(Scanner input) {
      try {
         int libraryIdNumber = input.nextInt();
         String rentalTimeDuration = input.next();
         int reservationCount = input.nextInt();
         int availableCount = input.nextInt();
         int checkedOutCount = input.nextInt();
         String returnLabel = input.next();
         String tempPassword = input.next();
         int chargingCableOrNo = input.nextInt();
         boolean chargingCable;
         if (chargingCableOrNo == 0) {
            chargingCable = false;
         } else {
            chargingCable = true;
         }
         return new Laptop(libraryIdNumber, rentalTimeDuration, reservationCount, 
                              availableCount, checkedOutCount, returnLabel, tempPassword, chargingCable);
      } 
      catch (Exception e) {
         System.out.println("Error reading in Laptop from Database.");
      }
      return null;
   }
   
   /*
    * createDesktop finishes scanning in a Desktop object
    * from resources.txt
    */
   public Desktop createDesktop(Scanner input) {
      try {
         int libraryIdNumber = input.nextInt();
         String rentalTimeDuration = input.next();
         int reservationCount = input.nextInt();
         int availableCount = input.nextInt();
         int checkedOutCount = input.nextInt();
         String returnLabel = input.next();
         String tempPassword = input.next();
         return new Desktop(libraryIdNumber, rentalTimeDuration, reservationCount, 
                              availableCount, checkedOutCount, returnLabel, tempPassword);
      } 
      catch (Exception e) {
         System.out.println("Error reading in Desktop from Database.");
      }
      return null;
   }

}