public class Other extends RentableResource {
   
   protected String title;
   protected String author;
   protected String edition;
   protected String publisher;
   
   public Other(int libraryIdNumberIn, String rentalTimeDurationIn,
                     int reservationCountIn, String titleIn,
                     String authorIn, String editionIn, String publisherIn) {
      super(libraryIdNumberIn, rentalTimeDurationIn, reservationCountIn);
      title = titleIn;
      author = authorIn;
      edition = editionIn;
      publisher = publisherIn;
   }
   
   public String toString() {
      return super.toString();
   }
}