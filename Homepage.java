import java.util.*;    //importing util package
class Homepage
{
   Scanner sc=new Scanner(System.in);    //creating object of Scanner class
   int choice;
   String constructor;
   
   void main()    //main method starts
   {
       System.out.println("ASPIRE CLASSES");
       System.out.println("______________");
       do{    //do while starts
       System.out.println("WELCOME! WOULD YOU LIKE TO GIVE A TEST TO CHECK YOUR KNOWLEDGE OF THE SCIENCES :");
       System.out.println("1. Yes");
       System.out.println("2. No (View Fee Structure Directly)");
       System.out.println("3. Exit ");
       System.out.print("Type the number of your option: ");
       choice=sc.nextInt();
       
       switch (choice)    //switch case of the users choice
       {
           case 1: Test t=new Test();
                   t.main();
                   break;
                   
           case 2: Fees f=new Fees();
                   f.main();
                   break;
                   
           case 3: System.out.println("Thank you for visiting.. ");
                   System.exit(0);
                   break;
             
           default: System.out.println("Enter a number from 1-3 only... "); break;   //default case for error
        }    //switch case ends
         }while(choice!=3);    //do while ends
    }     //main method ends
    
    Homepage() //contructor
    {
        choice=0 ;
        constructor=" ";
    }
    
    Homepage(int chosen, String construct)  //constructor overloading
    {
        choice=chosen;
        constructor=construct;
    }
}    //class ends
