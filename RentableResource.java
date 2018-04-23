public class RentableResource extends Resource {
   
   public RentableResource(int libraryIdNumberIn, String rentalTimeDurationIn,
                     int reservationCountIn) {
      super(libraryIdNumberIn, rentalTimeDurationIn, reservationCountIn);
   }
   
   public String toString() {
      return super.toString();
   }
   
}