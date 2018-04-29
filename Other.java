public class Other extends RentableResource {
   
   protected String title;
   protected String author;
   protected String edition;
   protected String publisher;
   
   public Other(int libraryIdNumberIn, String rentalTimeDurationIn,
                     int reservationCountIn, int availableCountIn, int checkedOutCountIn,
                     String titleIn,
                     String authorIn, String editionIn, String publisherIn) {
      super(libraryIdNumberIn, rentalTimeDurationIn, reservationCountIn,
            availableCountIn, checkedOutCountIn);
      title = titleIn;
      author = authorIn;
      edition = editionIn;
      publisher = publisherIn;
   }
   
   public String toString() {
      return super.toString();
   }
}