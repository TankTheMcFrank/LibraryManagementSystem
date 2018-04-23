public class InLibraryUseResource extends Resource {
   private String returnLabel;
   
   public InLibraryUseResource(int libraryIdNumberIn, String rentalTimeDurationIn,
                     int reservationCountIn, String returnLabelIn) {
      super(libraryIdNumberIn, rentalTimeDurationIn, reservationCountIn);
      returnLabel = returnLabelIn;
   }
   
   public String toString() {
      return super.toString();
   }
}