import java.util.*;    //importing util package
class Test     //start of class
{
   Scanner sc=new Scanner(System.in);    //creating objet of scanner class
   int choice1, p=0, c=0, b=0;     //declaring global variables
   	
   void main()    //main method
   {
       System.out.println("You've chosen to give the Sciences Test..");
       System.out.println("There will be three sections to this test, with  5 questions testing your knowledge on each section. The respective sections will be Physics, Chemistry and Biology.");
       System.out.println("These will be MCQ type questions and you are expected to type down the option alphabet of your choice right after every question.");
       System.out.println("Based on the results of the tests, you can decide whether to opt for that section or not.. ");
       do {    //do while starts
       System.out.println("Type 1 to start the test or");
       System.out.println(" Type 2 to go back to the main menu: ");
       choice1=sc.nextInt();

       switch (choice1)    //switch of users choice
       {
           case 1: exam();
                   break;
                   
           case 2: Homepage ho=new Homepage();
                   ho.main(); break;
           
           default: System.out.println("Enter a number from 1 or 2 only.."); break;
       }
          }while(choice1!=2 || choice1!=1);    //do while ends
   }    //end of main method
   
   void exam()    //exam method
   {
       System.out.println(" ");
       System.out.println("LETS GET STARTED!!!");
       System.out.println(" ");
       
       System.out.println("SECTION 1: PHYSICS");
       System.out.println(" ");
       
       System.out.println("(i)Derive and write the value of one horsepower (HP) in kilowatts."); 
       System.out.println("    (a)746kW  (b)0.746kW  (c)764kW  (d)746000kW    ");
       {System.out.print("PHYSICS: Answer (i) : ");
       char ans=sc.next().charAt(0);
       if(ans=='a')     //if used to check the answer
          p++;}
          
       System.out.println("(ii)In which of the foll. will the weight of the pulley not affect it's M.A.?");
       System.out.println("    (a)Block and Tackle System  (b)Several movable and one fixed pulley  (c)Single fixed pulley  (d)Single movable pulley    ");
       {System.out.print("PHYSICS: Answer (ii) : ");
       char ans=sc.next().charAt(0);
       if(ans=='c')
          p++;}
          
       System.out.println("(iii)How is the refractive index of the material of lens related to its focal length ? ");
       System.out.println("    (a)Directly (b)Inversely  (c)Variable  (d)Not related    ");
        {System.out.print("PHYSICS: Answer (iii) : ");
       char ans=sc.next().charAt(0);
       if(ans=='a')
          p++;}
          
       System.out.println("(iv)A bulb marked 12V and 24W operates on a 12 volt battery for 20 minutes. Calculate the energy consumed by it.");
       System.out.println("    (a)180J  (b)480J  (c)240J  (d)None of these    ");
       {System.out.print("PHYSICS: Answer (iv) : ");
       char ans=sc.next().charAt(0);
       if(ans=='a')
          p++;}
          
       System.out.println("(v)Which of the foll. devices does not work on the principle of electromagnetic induction ?");
       System.out.println("    (a)AC Generator  (b)DC motor  (c)Transformer  (d)All of these    ");
       {System.out.print("PHYSICS: Answer (v) : ");
       char ans=sc.next().charAt(0);
       if(ans=='b')
          p++;}
          
       System.out.print("MARKS IN PHYSICS:" + p);
       System.out.println(" ");
       
       System.out.println("SECTION 1: CHEMISTRY");
       System.out.println(" ");
       
       System.out.println("(i)______ decreases across a period. "); 
       System.out.println("    (a)Atomic size  (b)Non-metallic character  (c)Nuclear charge  (d)Ionization potential    ");
       {System.out.print("CHEMISTRY: Answer (i) : ");
       char ans=sc.next().charAt(0);
       if(ans=='a')
          c++;}
          
       System.out.println("(ii)Name the compound used as an antacid. ");
       System.out.println("    (a)Boric acid  (b)Calcium Hydroxide  (c)Magnesium Hydroxide  (d)Oxalic acid    ");
       {System.out.print("CHEMISTRY: Answer (ii) : ");
       char ans=sc.next().charAt(0);
       if(ans=='c')
          c++;}
          
       System.out.println("(iii)Calculate the no. of moles of 'X' atoms in 93g. of 'X' [X=31] ");
       System.out.println("    (a)3 moles  (b)1.5 moles  (c)5 moles  (d)None of these   ");
       {System.out.print("CHEMISTRY: Answer (iii) : ");
       char ans=sc.next().charAt(0);
       if(ans=='a')
          c++;}
          
       System.out.println("(iv)Apart for Cu and Zn, which of the foll. in used in the alloy 'German silver' ? ");
       System.out.println("    (a)Sn  (b)Ag  (c)Ni  (d)Pb    ");
       {System.out.print("CHEMISTRY: Answer (iv) : ");
       char ans=sc.next().charAt(0);
       if(ans=='c')
          c++;}
          
       System.out.println("(v)Esterification is the reaction specific for when ethanol is added to ______. ");
       System.out.println("    (a)Ethyl Acetate  (b)Ethanoic Acid  (c)Sodium Ethoxide  (d)Calcium carbide    ");
       {System.out.print("CHEMISTRY: Answer (v) : ");
       char ans=sc.next().charAt(0);
       if(ans=='b')
          c++;}
          
       System.out.print("MARKS IN CHEMISTRY:" + c);
       System.out.println(" ");
       
       System.out.println("SECTION 1: BIOLOGY");
       System.out.println(" ");
       
       System.out.println("(i)The dihybrid ratios in the F2 generation are:"); 
       System.out.println("    (a)1:2:2:1  (b)9:3:3:1  (c)1:3:3:9  (d)4:5:1    ");
       {System.out.print("BIOLOGY: Answer (i) : ");
       char ans=sc.next().charAt(0);
       if(ans=='b')
          b++;}
          
       System.out.println("(ii)The no. of water molecules to complete the photosynthesis reaction is: ");
       System.out.println("    (a)six  (b)twelve  (c)eighteen  (d)twenty-four    ");
       {System.out.print("BIOLOGY: Answer (ii) : ");
       char ans=sc.next().charAt(0);
       if(ans=='b')
          b++;}
          
       System.out.println("(iii)The valve present b/w the right atrium and ventricle is: ");
       System.out.println("    (a)tricuspid valve  (b)bicuspid valve  (c)semi-lunar valve  (d)mitral valve    ");
        {System.out.print("BIOLOGY: Answer (iii) : ");
       char ans=sc.next().charAt(0);
       if(ans=='a')
          b++;}
          
       System.out.println("(iv)When pregnancy does not occur, the life of corpus luteum is about: ");
       System.out.println("    (a)4 days  (b)10 days  (c)14 days  (d)28 days    ");
       {System.out.print("BIOLOGY: Answer (iv) : ");
       char ans=sc.next().charAt(0);
       if(ans=='c')
          b++;}
          
       System.out.println("(v)Disinfectants can be applied on skin. True or false? ");
       System.out.println("    (a)True  (b)False  (c)Depends on concentration  (d)none of these    ");
       {System.out.print("BIOLOGY: Answer (v) : ");
       char ans=sc.next().charAt(0);
       if(ans=='b')
          b++;}
          
       System.out.print("MARKS IN BIOLOGY: " + b);
       System.out.println(" ");
       
       System.out.println("If your score is less than or equal to 3 ----- Not good in subject (classes recommended)");
       System.out.println("If your score is more than 3 ----- Good in subject");
       
       Fees f=new Fees();     //creating object of fees class
       f.main();     //transferring control to main method of fees class
    }    //end of exam method
}     //end of class
