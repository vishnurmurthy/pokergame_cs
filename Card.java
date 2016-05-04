public class Card
{
   public String filename;
   public String cardvalue;
   public String face; 
   public Card(String cardvalue, String face)
   {
      this.cardvalue = cardvalue;
      this.face = face;
      filename = cardvalue + "_of_" + face;
   }
   public String getcardvalue()
   {
      return cardvalue;
   }
   public String getface()
   {
      return face;
   }
   public String getfilename()
   {
      return filename;
   }  

}