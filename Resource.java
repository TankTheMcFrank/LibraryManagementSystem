public class Resource {
   private int libraryIdNumber;
   private String rentalTimeDuration;
   private int reservationCount;
   
   public Resource(int libraryIdNumberIn, String rentalTimeDurationIn,
                     int reservationCountIn) {
      libraryIdNumber = libraryIdNumberIn;
      rentalTimeDuration = rentalTimeDurationIn;
      reservationCount = reservationCountIn;
   }
   
   public String toString() {
      String output = "\nLibrary ID Number: \t" + libraryIdNumber
                  + "\nRental Time Duration: \t" + rentalTimeDuration
                  + "\nReservation Count: \t" + reservationCount;
      return output;
   }
}