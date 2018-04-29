public class WhiteBoard extends InLibraryUseResource {
   
   private String expoMarkers;
   private String expoErasers;
   
   public WhiteBoard(int libraryIdNumberIn, String rentalTimeDurationIn,
                     int reservationCountIn, int availableCountIn, int checkedOutCountIn, 
                     String returnLabelIn, String expoMarkersIn, String expoErasersIn) {
      super(libraryIdNumberIn, rentalTimeDurationIn, reservationCountIn,
         availableCountIn, checkedOutCountIn, returnLabelIn);
      expoMarkers = expoMarkersIn;
      expoErasers = expoErasersIn;
   }
   
   public String toString() {
      String output = super.toString()
                     + "\nExpo Markers: \t\t" + expoMarkers
                     + "\nExpo Erasers: \t\t" + expoErasers;
      return output;
   }
   
}