public class Audio extends Book {
   private String duration;

   public Audio(int libraryIdNumberIn, String rentalTimeDurationIn,
            int reservationCountIn, String titleIn, String authorIn,
            String genreIn, String publisherIn, String editionIn,
            String durationIn) {
      super(libraryIdNumberIn, rentalTimeDurationIn, reservationCountIn,
            titleIn, authorIn, genreIn, publisherIn, editionIn);
      duration = durationIn;
   }
}