public class Laptop extends LibraryRentalComputer {
   
   private boolean chargingCable;
   
   public Laptop(int libraryIdNumberIn, String rentalTimeDurationIn,
                     int reservationCountIn, int availableCountIn, 
                     int checkedOutCountIn, String returnLabelIn,
                     String tempPasswordIn, boolean chargingCableIn) {
      super(libraryIdNumberIn, rentalTimeDurationIn, reservationCountIn,
         availableCountIn, checkedOutCountIn, returnLabelIn, tempPasswordIn);
      chargingCable = chargingCableIn;
   }
   
   public String toString() {
      String output = super.toString()
                     + "\nCharging Cable: \t" + chargingCable;
      return output;
   }
   
}