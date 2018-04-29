public class RentableResource extends Resource {
   
   protected int availableCount;
   protected int checkedOutCount;
   
   public RentableResource(int libraryIdNumberIn, String rentalTimeDurationIn,
                     int reservationCountIn, int availableCountIn, int checkedOutCountIn) {
      super(libraryIdNumberIn, rentalTimeDurationIn, reservationCountIn,
               availableCountIn, checkedOutCountIn);
   }
   
}