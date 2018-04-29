public class Resource {
   protected int libraryIdNumber;
   protected String rentalTimeDuration;
   protected int reservationCount;
   protected int availableCount;
   protected int checkedOutCount;
   
   public Resource(int libraryIdNumberIn, String rentalTimeDurationIn,
                     int reservationCountIn, int availableCountIn, int checkedOutCountIn) {
      libraryIdNumber = libraryIdNumberIn;
      rentalTimeDuration = rentalTimeDurationIn;
      reservationCount = reservationCountIn;
      availableCount = availableCountIn;
      checkedOutCount = checkedOutCountIn;
   }
   
   public String toString() {
      String output = "\nLibrary ID Number: \t" + libraryIdNumber
                  + "\nRental Time Duration: \t" + rentalTimeDuration
                  + "\nReservation Count: \t\t" + reservationCount
                  + "\nAvailable Count: \t\t\t" + availableCount
                  + "\nChecked Out Count: \t\t" + checkedOutCount;
      return output;
   }
   
   public int getLibraryIdNumber() {
      return libraryIdNumber;
   }
   
   public void decrementResourceCount() {
      availableCount -= 1;
   }
   
   public int getAvailableCount() {
      return availableCount;
   }
   
   public int getCheckedOutCount() {
      return checkedOutCount;
   }
}