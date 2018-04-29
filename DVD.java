public class DVD extends Disk {

   private String director;
   
   public DVD(int libraryIdNumberIn, String rentalTimeDurationIn,
                     int reservationCountIn, int availableCountIn, int checkedOutCountIn,
                     String durationIn,
                     String titleIn, String directorIn) {
      super(libraryIdNumberIn, rentalTimeDurationIn,
            reservationCountIn, availableCountIn, checkedOutCountIn, durationIn, titleIn);
      director = directorIn; 
   }
   
   public String toString() {
      String output = super.toString()
                     + "\nDirector: \t\t" + director;
      return output;
   }

}