public class Desktop extends LibraryRentalComputer {
   
   public Desktop(int libraryIdNumberIn, String rentalTimeDurationIn,
                     int reservationCountIn, int availableCountIn, int checkedOutCountIn, 
                     String returnLabelIn,
                     String tempPasswordIn) {
      super(libraryIdNumberIn, rentalTimeDurationIn, reservationCountIn,
         availableCountIn, checkedOutCountIn, returnLabelIn, tempPasswordIn);
   }
   
   public String toString() {
      return super.toString();
   }
   
}