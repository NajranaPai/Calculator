/* Calculator Program Prepared by:Pai Najranabanu Yakub*/
import java.util.Scanner;
 
final class Calculator {
    /* Global variable declaration */
    static double n1,n2,d,d1,answer; 
    static int choice; // used for operation that you have to perform
    static long l1,l2; // used for  to long because inbuilt math function take arguments either integer or long
    static char c;
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) { 
       do{
        System.out.print("\n\t 1: Addition");
        System.out.print("\n\t 2: Subtraction");
        System.out.print("\n\t 3: Multiple");
        System.out.print("\n\t 4: Division");
        System.out.print("\n\t 5: Square root");
        System.out.print("\n\t 6: Percentage");
        System.out.print("\n Please Select any one option:");
        choice=sc.nextInt();
        Taking_Inputs();
         // typecasting from double to long because Math method can only take integer/Long arguments..
         l1=(long)n1; 
         l2=(long)n2;

        switch(choice)
        {
            case 1:
                answer=addition();
                System.out.print("\n\t " + n1 +" + "+n2+" = " +answer);
                break;
            case 2:
                subtraction();
                break;
            case 3:
                multipication();
                break;
            case 4:
                division();
                break;
            case 5:
                answer=Math.sqrt(n1);
                System.out.print("\n\t Square root of " + n1 + ":->" + answer);
                break;
            case 6:
                answer=n1/100;
                System.out.print("\n\t Percentage of " + n1 + ":->" + answer);
                break;
            default :
                System.out.print("\n\t Please select 1 to 6 for operation:");
                
                break;
          } 
          System.out.print("\n Do you Want to Continue?Y/N  ");
          c=sc.next().charAt(0);
        }
        while(c=='Y'|| c=='y');      
    }
    public static void Taking_Inputs() // Taking Value from user
    {
        if(choice!=6 && choice!=5)
        {
         System.out.print("\t Enter Number 1:");
         n1=sc.nextDouble();
         System.out.print("\n\t Enter Number 2:");
         n2=sc.nextDouble();
        }
        else
        {
         System.out.print("\n\t Enter Number:");
         n1=sc.nextDouble();
        }
         
    }
    private static Double addition() //private access modifier with return double type : Addition 
    {
         /*typecasting from double to long because Math.addExact(l1,l2) method can only take integer/Long arguments 
          l1=(long)n1; 
          l2=(long)n2;*/
          long sum= Math.addExact(l1,l2);  /* local Variable declaration  and adding value with default function of math*/
          d=n1-l1;
          answer=sum+d;
          d1=n2-l2;
          answer=answer+d1; 
        
          /*if(d==0)
           {
            System.out.print("\n\t " + l1);
           }
           else{
               System.out.print("\n\t " + n1);
           }
           if(d1==0)
           {
            System.out.print("  +  " + l2);
           }
           else{
            System.out.print("  +  " + n2); 
           }
           l1=(long)answer;
           d=answer-l1;
           if(d==0)
           {
            System.out.print(" =  " + l1);
           }
           else{
               System.out.print(" =  " + answer);
           }*/

           return answer;

          //System.out.print("\n\t " + n1 +" + "+n2+" = " +answer);
          

    }
    private static void subtraction() //private access modifier with no return type (void)
    {
        answer= Math.subtractExact(l1,l2);  // implicit type conversion
        //System.out.print("\n\t " + n1 +" - "+n2+" = " +answer);
        d=n1-l1;
        d1=n2-l2;
        answer=answer+(d-d1);
        System.out.print("\n\t " + n1 +" - "+n2+" = " +answer);
    }
    public static void multipication() //public access modifier with no return type (void)
    {
        answer=Math.multiplyExact(l1, l2);  // implicit type conversion
        d=n1-l1;
        answer=answer+(l2* d);
         //System.out.print(answer);
        d1=n2-l2;
        answer=answer + (l1*d1);
        answer=answer + (d*d1);
        System.out.print("\n\t " + n1 +" * "+n2+" = " +answer);
    }
    static void division() // with no access modifier with no return type (void)
    {
     answer=n1/n2 ; // direct division
     System.out.print("\n\t " + n1 +" / "+n2+" = " +answer);
    }
    
}


