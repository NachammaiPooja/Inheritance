import java.util.Scanner;
class NumberGuess{
   int Rnum;
   int Ran;

   public static void main(String[] args){
   Scanner in=new Scanner(System.in);
   NumberGuess n=new NumberGuess();
   System.out.println("\t\tJAVA NUMBER GUESS");
   int c=0;
   n.Ran=(int)(Math.random()*99+1);
   do{
   c++;
   System.out.println("Key in your guess");
   n.Rnum=in.nextInt();
   //n.Ran=(int)(Math.random()*99+1);
   //System.out.println("random num" +n.Ran);
   if(n.Rnum==n.Ran)
     break;
   else if(n.Rnum>n.Ran)
     System.out.println("Try lower");
   else if(n.Rnum<n.Ran)
     System.out.println("Try higher");}while(n.Rnum!=n.Ran);
   System.out.println("You got it in " +c +" trials!");
  }
}
