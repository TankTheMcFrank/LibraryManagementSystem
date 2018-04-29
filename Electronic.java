public class Electronic extends Book {
   public Electronic(int libraryIdNumberIn, String rentalTimeDurationIn,
            int reservationCountIn, int availableCountIn, int checkedOutCountIn, 
            String titleIn, String authorIn,
            String genreIn, String publisherIn, String editionIn) {
      super(libraryIdNumberIn, rentalTimeDurationIn, reservationCountIn,
            availableCountIn, checkedOutCountIn,
            titleIn, authorIn, genreIn, publisherIn, editionIn);
   }
}