public class Tape extends RentableResource {

   private String duration;

   public Tape(int libraryIdNumberIn, String rentalTimeDurationIn,
                     int reservationCountIn, String durationIn) {
      super(libraryIdNumberIn, rentalTimeDurationIn, reservationCountIn);
      duration = durationIn;
   }
   
   public String toString() {
      String output = super.toString()
                     + "\nDuration: \t\t" + duration;
      return output;
   }
   
}