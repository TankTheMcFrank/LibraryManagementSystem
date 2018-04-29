public class Disk extends RentableResource {
   
   private String duration;
   private String title;
   
   public Disk(int libraryIdNumberIn, String rentalTimeDurationIn,
                     int reservationCountIn, int availableCountIn, int checkedOutCountIn,
                     String durationIn,
                     String titleIn) {
      super(libraryIdNumberIn, rentalTimeDurationIn, reservationCountIn, 
               availableCountIn, checkedOutCountIn);
      duration = durationIn;
      title = titleIn;
   }
   
   public String toString() {
      String output = super.toString()
                     + "\nTitle: \t\t\t" + title
                     + "\nDuration: \t\t" + duration;
      return output;
   }
   
}