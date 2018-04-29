public class LibraryRentalComputer extends InLibraryUseResource {
   
   private String tempPassword;
   
   public LibraryRentalComputer(int libraryIdNumberIn, String rentalTimeDurationIn,
                     int reservationCountIn, int availableCountIn, int checkedOutCountIn,
                     String returnLabelIn, String tempPasswordIn) {
      super(libraryIdNumberIn, rentalTimeDurationIn, reservationCountIn, 
         availableCountIn, checkedOutCountIn, returnLabelIn);
      tempPassword = tempPasswordIn;
   }
   
   public String toString() {
      String output = super.toString()
                     + "\nTemp Password: \t" + tempPassword;
      return output;
   }
   
}