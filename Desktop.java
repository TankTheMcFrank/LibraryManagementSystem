public class Desktop extends LibraryRentalComputer {
   
   public Desktop(int libraryIdNumberIn, String rentalTimeDurationIn,
                     int reservationCountIn, String returnLabelIn,
                     String tempPasswordIn) {
      super(libraryIdNumberIn, rentalTimeDurationIn, reservationCountIn,
         returnLabelIn, tempPasswordIn);
   }
   
   public String toString() {
      return super.toString();
   }
   
}