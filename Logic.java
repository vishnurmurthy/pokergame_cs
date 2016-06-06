public class Logic
{
   Shoe usershoe;
   public Logic (Shoe user)
   {
      usershoe = user;
   }
   public Shoe[] sort(Shoe[] s)
   {
      Shoe x;
      Shoe y;
      for (int passes = 0; passes < s.length; passes++)
      {
         x = s[findMax(s, passes)];
         y = s[s.length-passes - 1];
         s[findMax(s, passes)] = y;
         s[s.length-passes - 1] = x;
      }
      Shoe[] t = s;
      int counter = 0;
      for (int i = s.length - 1; i >= 0; i++)
      {
         t[counter] = s[i];
         counter++;
      }
      return t;
   }
   public int findMax(Shoe[] s, int passes)
   {
      int position = 0;
      Shoe number = s[0];
      for (int i = 0; i < s.length - passes - 1; i++)
      {
         if (usershoe.compareTo(number)<usershoe.compareTo(s[i]))
         {
            position = i;
            number = s[i];
         }
      }
      return position;
   }
}