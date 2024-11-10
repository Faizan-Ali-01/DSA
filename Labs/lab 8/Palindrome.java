class Palindrome
{
   static boolean palindromeCheck(String sen,int left,int right)
   {
      if(left>=right)
      {
         return true;
      }
      else if(sen.charAt(left) != sen.charAt(right))
      {
         return false;
      }
      return palindromeCheck(sen,left+1,right-1);
   }
   public static void main(String[] args)
   {
      String sen="racecar";
      System.out.println("Is the given value Palindrome? "+palindromeCheck(sen,0,sen.length()-1));
   }
}