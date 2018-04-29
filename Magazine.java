public class Magazine extends Other {
  
   public Magazine(int libraryIdNumberIn, String rentalTimeDurationIn,
                     int reservationCountIn, int availableCountIn, int checkedOutCountIn, 
                     String titleIn,
                     String authorIn, String editionIn, String publisherIn) {
      super(libraryIdNumberIn, rentalTimeDurationIn, reservationCountIn,
            availableCountIn, checkedOutCountIn,
            titleIn, authorIn, editionIn, publisherIn);
   }
   
   public String toString() {
      String output = super.toString()
                     + "\nTitle: \t\t\t" + title
                     + "\nAuthor: \t\t\t" + author
                     + "\nEdition: \t\t" + edition
                     + "\nPublisher: \t\t" + publisher;
      return output;
   }
   
}