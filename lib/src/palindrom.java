import java.util.Scanner;

public class palindrom {

 public static void main(String[] args)
 {
  int x;
  int r,sum=0;
  int temp;

  Scanner console = new Scanner(System.in);

  System.out.print("Enter number:  ");
  x = console.nextInt();

  temp=x;
  while(x>0){
   r=x%10;
   sum=(sum*10)+r;
   x=x/10;
  }
  if(temp==sum)
   System.out.println("Is a palindrome number ");
  else
   System.out.println("Is not palindrome number");
 }




}
