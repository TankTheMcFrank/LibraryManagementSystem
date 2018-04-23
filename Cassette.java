public class Cassette extends Tape {
   
   private String composer;
   
   public Cassette(int libraryIdNumberIn, String rentalTimeDurationIn,
                     int reservationCountIn, String durationIn,
                     String composerIn) {
      super(libraryIdNumberIn, rentalTimeDurationIn, reservationCountIn, durationIn);
      composer = composerIn;
   }
   
   public String toString() {
      String output = super.toString()
                     + "\nComposer: \t\t" + composer;
      return output;
   }
   
}