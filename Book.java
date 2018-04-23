public class Book extends RentableResource {
   private String title;
   private String author;
   private String genre;
   private String publisher;
   private String edition;
   
   public Book(int libraryIdNumberIn, String rentalTimeDurationIn,
            int reservationCountIn, String titleIn, String authorIn,
            String genreIn, String publisherIn, String editionIn) {
      super(libraryIdNumberIn, rentalTimeDurationIn, reservationCountIn);
      title = titleIn;
      author = authorIn;
      genre = genreIn;
      publisher = publisherIn;
      edition = editionIn;
   }
   
   public String toString() {
      String output = super.toString()
                     + "\nTitle: \t\t\t" + title
                     + "\nAuthor: \t\t" + author
                     + "\nGenre: \t\t\t" + genre
                     + "\nPublisher: \t\t" + publisher
                     + "\nEdition: \t\t" + edition;
      return output;
   }
   
}