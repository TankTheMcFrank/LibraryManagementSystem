public class VHS extends Tape {

   private String director;
   
   public VHS(int libraryIdNumberIn, String rentalTimeDurationIn,
                     int reservationCountIn, String durationIn,
                     String directorIn) {
      super(libraryIdNumberIn, rentalTimeDurationIn, reservationCountIn, durationIn);
      director = directorIn;
   }
   
   public String toString() {
      String output = super.toString()
                     + "\nDirector: \t\t" + director;
      return output;
   }

}