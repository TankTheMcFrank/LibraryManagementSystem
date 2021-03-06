public class CD extends Disk {
   
   private String composer;
   
   public CD(int libraryIdNumberIn, String rentalTimeDurationIn,
                     int reservationCountIn, int availableCountIn, int checkedOutCountIn,
                     String durationIn,
                     String titleIn, String composerIn) {
      super(libraryIdNumberIn, rentalTimeDurationIn,
            reservationCountIn, availableCountIn, checkedOutCountIn, durationIn, titleIn);
      composer = composerIn; 
   }
   
   public String toString() {
      String output = super.toString()
                     + "\nComposer: \t\t" + composer;
      return output;
   }
   
}