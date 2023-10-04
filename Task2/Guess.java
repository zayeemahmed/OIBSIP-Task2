import java.util.*;
import java.io.*;
class Guess
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
        int key=ran.nextInt(100);
        int flag=0;
        int i=1;
        int round=5;
        while(i<=round)
        {
            System.out.println("enter the guess number:");
            int n=sc.nextInt();
            if(n<key)
            {
                System.out.println(n+" is less the guessing number");
            }
            else if(n>key)
            {
                System.out.println(n+" is greater than guessing number");
            }
            else if(n==key)
            {
                System.out.println("guessing number matched in "+i+" attempts");
                flag=1;
                break;
            }
           if(i==round-1)
            {
                
                System.out.println("do you want more rounds:(y|n)");
                String ch=sc.next();
                if(ch.charAt(0)=='y' || ch.charAt(0)=='Y')
                {
                    round+=3;
                }
                else{
                    break;
                }

            }
            
            i++;
        }
        
       
        if(flag==0)
        {
            System.out.println("Well Try! Better luck next Time(.`^`.)");
        }
        else{
            System.out.println("your Score is:");
            switch(i)
            {
                case 1:System.out.println("100"); break;
                case 2:System.out.println("90"); break;
                case 3:System.out.println("70"); break;
                case 4:System.out.println("60"); break;
                case 5:System.out.println("50"); break;
                case 6:System.out.println("40"); break;
                default:System.out.println("10"); break;
            }
        }
    }
}