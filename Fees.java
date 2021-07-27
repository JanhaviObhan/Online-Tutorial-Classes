import java.util.*;    //importing util package
class Fees      //start of class
{
   Scanner sc= new Scanner(System.in);    //creating object of Scanner class
   Homepage hp=new Homepage();     //creating object of homepage class
   int choice2, choice3, choice4, choice5, subjects=0;    //declaring global variables
   char subject[]={' ' , ' ' , ' '};    //array
   
   void main()     //start of main method
   {
       System.out.println(" ");	
       do{    //do while 1 starts
       System.out.println("Type 1 to view the fee structure");
       System.out.println("Type 2 to go back to the main menu");
       choice2=sc.nextInt();
       System.out.println(" ");
       
       switch(choice2)    //switch case 1
       {
           case 1:{
           System.out.println("Given below is the basic fee structure(for 6 months):");
           System.out.println("Any ONE subject .... Rs.9, 000/-");
           System.out.println("Any TWO subjects .... Rs.17, 000/-");
           System.out.println("All THREE subjects .... Rs.24, 000/-");
           System.out.println(" ");
           do{     //do while 2 starts
           System.out.println("Type 1 to proceed with the selection of subjects");
           System.out.println(" Type 2 to go back to the main menu");
           choice3=sc.nextInt();
           System.out.println(" ");
           
           switch(choice3)     //switch case 2
           {
               case 1: selection(); break;
               
               case 2: hp.main(); break;
               
               default: System.out.println("Type a number from 1 or 2 only..."); break;    //default case for error
           } 
             }while(choice3!=2 || choice3!=1);      //do while 2 ends
           } break;
           
           case 2: hp.main(); break;
           
           default: System.out.println("Type a number from 1 or 2 only..."); break;      //default case for error
        }
         }while(choice2!=2 || choice2!=1);     // do while 1 ends
    }     //main method ends
        
    void selection()    //selection method
    {
        System.out.println("Enter Y, if you wish to opt for the subject asked of or enter N if you do not want to opt for that subject..");
        System.out.println(" ");
        
        System.out.print("Do you want to opt for PHYSICS: ");
        subject[0]=sc.next().charAt(0);
        System.out.println(" ");
        
        System.out.print("Do you want to opt for CHEMISTRY: ");
        subject[1]=sc.next().charAt(0);
        System.out.println(" ");
        
        System.out.print("Do you want to opt for BIOLOGY: ");
        subject[2]=sc.next().charAt(0);
        System.out.println(" ");
        
        System.out.println("You've selected: ");    //if used to check if the user has chosen the subject or not
        {
            if(subject[0]=='Y' || subject[0]=='y')
            {System.out.println("PHYSICS ");
            subjects++;}
            
            if(subject[1]=='Y' || subject[1]=='y')
            {System.out.println("CHEMISTRY ");
            subjects++;}
            
            if(subject[2]=='Y' || subject[2]=='y')
            {System.out.println("BIOLOGY ");
            subjects++;}
        }
        System.out.println(" ");
        
        if(subjects==1)      //printing total amount
        System.out.println("Your total amount is Rs. 9000"); 
        else if(subjects==2)
        System.out.println("Your total amount is Rs. 17000");
        else if(subjects==3)
        System.out.println("Your total amount is Rs. 24000");
        else if (subjects==0)
        { System.out.println("THANKS FOR VISITING");
          System.exit(0); }
        
        System.out.println("PLEASE SUBMIT YOUR TOTAL AMOUNT TO 'ASPIRE CLASSES LTD.' BY CHEQUE IN A WEEKS' TIMES... THANK YOU FOR CHOOSING ASPIRE CLASSES!!!");
        
        practice();    //trasferring control to practice method
    }    //end of selection method
    
    void practice()     //start of practice method
    {
        System.out.println(" ");
        System.out.println("Here we will be offering you some questions for the subjects you have selected as a practice... ");
        System.out.println("Note your answers down on a piece of paper and compare them with the answers that will be given at the end of the questionnaire... ");
        System.out.println("These are the important questions from the board point of view and practising them with honesty will be highly beneficial... ");
        System.out.println(" ");
        System.out.println("REMEMBER: THIS IS NOT A TEST, JUST A PRACTICE.....");
        System.out.println("ALL THE BEST!! ");
        
        {
        if(subject[0]=='Y'|| subject[0]=='y')   //using if to check if the user has chosen the subject
        physics();
        
        if(subject[1]=='Y'|| subject[1]=='y')
        chemistry();
        
        if(subject[2]=='Y' || subject[2]=='y')
        biology();
        }
    
        System.out.println(" ");
        System.out.println("We hope the practice questions helped you improve and excel in the subject! ");
        System.out.println("If you have any doubts, you can contact us on our email 'aspire.limited@hotmail.com' and we will clear all your queries as soon as possible... ");
        System.out.println("Once again, THANK YOU FOR CHOOSING ASPIRE CLASSES!");
        
        System.exit(0); //ending the project
    }   //end of practice method
    
    void physics()   //method for physics practice
    {
        System.out.println("PHYSICS");
        System.out.println(" ");
        String physicsQ[]={"1. What are the factors on which the foll. characteristics of a musical note depends? (a)Intensity. (b)Timbre." , 
            "2. Define work function of a metal." , 
            "3. On what factor does the position of centre of gravity of a body depend? " , 
            "4. Name the factors affecting the critical angle for the pair of media." , 
            "5. What is an ohmic resistance? "};
        
            for(int i=0;i<5;i++)   //for loop
            {
                System.out.println(physicsQ[i]);
            }
        System.out.println(" ");
        
        do{
        System.out.print("Enter 1 to see the answers... ");
        choice4=sc.nextInt();
        System.out.println(" ");
        
        switch(choice4)
        {
            case 1:
        System.out.println("Answers... ");
        System.out.println(" ");
        System.out.println("1.(a)Intensity depends on amplitude of wave. (b)Timbre depends on wave form. ");
        System.out.println("2. The work function is the minimum amount of energy required to escape out free electrons form the interior of metal to its surface.");
        System.out.println("3. On the distribution of mass in the body.");
        System.out.println("4. (a)Colour of light. (b)Refractive indices of media.");
        System.out.println("5. A resistance for which V\\I is constant for each value of V or I, is called an ohmic resistance. ");
        System.out.println(" ");
        break;
            
           default: System.out.println("Enter 1 only... ");
        } }while(choice4!=1);
        do{
        System.out.print("Enter 1 to proceed to the other subject/end: ");
        choice5=sc.nextInt();
        System.out.println(" ");
        
        switch(choice5)
        {
            case 1: return;
            
            default: System.out.println("Enter 1 only...");
        }}while(choice5!=1);
    }
    
    void chemistry()    //method for chemistry practice
    {
        System.out.println("CHEMISTRY");
        System.out.println(" ");
        String chemistryQ[]={"1. The amount of energy released when an atom in its gaseous state accepts an electron to form an anion is its _______." , 
            "2. Name: (a) A deliquescent salt (b) An insoluble chloride" , 
            "3. State the main components of brass. " , 
            "4. Cold, dil. nitric acid reacts with copper to form ______." , 
            "5. The IUPAC name of acetylene is ______. "};
        
            for(int i=0;i<5;i++)     //for loop
            {
                System.out.println(chemistryQ[i]);
            }
        System.out.println(" ");
        
        do{
        System.out.print("Enter 1 to see the answers... ");
        choice4=sc.nextInt();
        System.out.println(" ");
        
        switch(choice4)
        {
            case 1:
        System.out.println("Answers... ");
        System.out.println(" ");
        System.out.println("1. Electron Affinity");
        System.out.println("2. (a)Copper Nitrate. (b)Silver Chloride.");
        System.out.println("3. Cu[60-80%] and Zn[40-20%]");
        System.out.println("4. Cooper nitrate, water, and nitric oxide.");
        System.out.println("5. Ethyne");
        System.out.println(" ");
        break;
            
           default: System.out.println("Enter 1 only... ");
        } }while(choice4!=1);
        do{
        System.out.print("Enter 1 to proceed to the other subject/end: ");
        choice5=sc.nextInt();
        System.out.println(" ");
        
        switch(choice5)
        {
            case 1: return;
            
            default: System.out.println("Enter 1 only...");
        }}while(choice5!=1);
    }
    
    void biology()    //method for biology practice
    {
        System.out.println("BIOLOGY");
        System.out.println(" ");
        String biologyQ[]={"1. Eye:Vision :: Neutrophils:_______ " , 
            "2. Metaphase, telophase, prophase, anaphase, cytokinesis..... Arrange in order" , 
            "3. What is the significance of the testes being located in the scrotal sac outside the abdomen." , 
            "4. Define photolysis." , 
            "5. Expand the abbreviation: NADP"};
            for(int i=0;i<5;i++)     //for loop
            {
                System.out.println(biologyQ[i]);
            }
        System.out.println(" ");
        
        do{
        System.out.print("Enter 1 to see the answers... ");
        choice4=sc.nextInt();
        System.out.println(" ");
        
        switch(choice4)
        {
            case 1:
        System.out.println("Answers... ");
        System.out.println(" ");
        System.out.println("1. Phagocytises");
        System.out.println("2. Prophase, Metaphase, Anaphase, Telophase, Cytokinesis.");
        System.out.println("3. Testes escape too much body heat (high body temp. does not permit sperm maturation.)");
        System.out.println("4. Breaking down of a compound by light.");
        System.out.println("5. Nicotineamide adenine dinucleotide phosphate.");
        System.out.println(" ");
        break;
            
           default: System.out.println("Enter 1 only... ");
        } }while(choice4!=1);
        do{
        System.out.print("Enter 1 to proceed to the other subject/end: ");
        choice5=sc.nextInt();
        System.out.println(" ");
        
        switch(choice5)
        {
            case 1: return;
            
            default: System.out.println("Enter 1 only...");
        }}while(choice5!=1);
    }
}    //end of class
