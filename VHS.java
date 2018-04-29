public class VHS extends Tape {

   private String director;
   
   public VHS(int libraryIdNumberIn, String rentalTimeDurationIn,
                     int reservationCountIn, int availableCountIn, int checkedOutCountIn,
                     String durationIn, String directorIn) {
      super(libraryIdNumberIn, rentalTimeDurationIn, reservationCountIn, 
               availableCountIn, checkedOutCountIn,durationIn);
      director = directorIn;
   }
   
   public String toString() {
      String output = super.toString()
                     + "\nDirector: \t\t" + director;
      return output;
   }

}