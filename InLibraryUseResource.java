public class InLibraryUseResource extends Resource {
   private String returnLabel;
   
   public InLibraryUseResource(int libraryIdNumberIn, String rentalTimeDurationIn,
                     int reservationCountIn, int availableCountIn, 
                     int checkedOutCountIn, String returnLabelIn) {
      super(libraryIdNumberIn, rentalTimeDurationIn, reservationCountIn, availableCountIn, checkedOutCountIn);
      returnLabel = returnLabelIn;
   }
   
   public String toString() {
      return super.toString();
   }
}