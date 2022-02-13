import java.util.*;
public class HealthCare
{
    public static double weight;
    public static int gender;
    public static double height;
    public static int age;
    public static int UserTag = ((int)(Math.random()*(999999-100000+1)+100000));
    public static void Start()
    {
        System.out.println("        _   _            _ _   _      ____");
        System.out.println("       | | | | ___  __ _| | |_| |__  / ___|__ _ _ __ ___");
        System.out.println("       | |_| |/ _ \\/ _` | | __| '_ \\| |   / _` | '__/ _ \\ ");
        System.out.println("       |  _  |  __/ (_| | | |_| | | | |__| (_| | | |  __/");
        System.out.println("       |_| |_|\\___|\\__,_|_|\\__|_| |_|\\____\\__,_|_|  \\___|");
        System.out.println("");
        System.out.println("                 _____                      _");
        System.out.println("                | ____|_  ___ __   ___ _ __| |_");
        System.out.println("                |  _| \\ \\/ / '_ \\ / _ \\ '__| __|");
        System.out.println("                | |___ >  <| |_) |  __/ |  | |_");
        System.out.println("                |_____/_/\\_\\ .__/ \\___|_|   \\__|");
        System.out.println("                           |_|");
        System.out.println("Welcome to Your Personal HealthCare Expert!!!");
        System.out.println("*_1. This program is not an actual calculator but a mere prediction of one's health status based on inputted diet information*");
        System.out.println("*_2. It is advised to enter all values accurately to get the best results.*");
        System.out.println("*_3. This program is developed from information from the web. Every output is a resultant of the information available on the web.");
        System.out.println("*_4. The program is open-source and can be found on https://github.com/Simpliciti/HealthCareExpert.git");    
        System.out.println("Enter the following details accurately. Some of these details will be used by the functions of the program. \nAccurate details will result in the best results.");
        Welcome();
    }
    private static void Welcome() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please input your Age: ");
        age = sc.nextInt();
        System.out.println("Please input your Gender: \n1.Male \n2.Female ");
        System.out.print("HcExpert@User_"+UserTag+">>>");
        gender = sc.nextInt();
        if(gender ==1)
        gender=1;
        else if(gender==2)
        gender =2;
        else{
        System.out.println("Enter your gender correctly! ");
        Welcome();
        }
        System.out.print("Please input your Weight(in kg): ");
        weight = sc.nextInt();
        System.out.print("Please input your Height (in cms): ");
        height = sc.nextInt();
        WelcomePrompt.WelcomePrompt();
    }
}
class WelcomePrompt extends HealthCare
{
    public static void WelcomePrompt() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nIn order to start, Enter the no. of operation and press the Enter key: \n1.Life Expectancy Calculator(Beta)");
        System.out.println("2.Cholesterol Risk Meter \n3.Diabetic Risk Meter \n4.Body-Mass Index Calculator \n0.Exit");
        System.out.print("HcExpert@User_"+UserTag+">>>");
        int choice = sc.nextInt();
        if (choice==0){
            System.out.print("Are you sure you want to continue (Y/N)?: ");
            char c2 = sc.next().charAt(0);
            if(c2=='Y' || c2=='y')
            System.exit(0);
            else if(c2=='N' || c2=='n')
            WelcomePrompt();
            else{
                System.out.println("Redirecting back to homepage... \n\n");
                
                WelcomePrompt();
            }
        }
        else if(choice == 1)
        {
            System.out.println();
            Life_Exp.LifeExpectancy();
        }
        else if(choice == 2)
        {
            System.out.println();
            Cholesterol.cholesterol(); 
        }
        else if(choice == 3)
        {
            System.out.println();
            _Sugar.Sugar(); 
        }
        else if(choice == 4)
        {
            System.out.println();
            BMI.bmindex(); 
        }
        else{
            System.out.println("ERROR! Enter correct operation.");
            WelcomePrompt();
        }
    }
}
class BMI extends HealthCare
{
    public static float bmi = (float)((weight/(height*height))*10000);
    public static void bmindex() 
    {
        System.out.println("Your Body-Mass-Index is: "+bmi+".\nBody Mass Index plays a vital role in calculating any kind of health risk.");
        System.out.print("Getting the result...");
        int i;double mn=1;
        double f=1000000000;
        for(i=5;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {mn=1;
            f=50000000;
            while(mn<=f)
            {
                mn+=1;
            }
            System.out.print(".");
            }
            System.out.println();
        }
        if(bmi >=18.5 && bmi<=24.9)
        {
            System.out.println("Your BMI is normal and you currently have: Minimal health risks..");
        }
        else if(bmi<18.5)
        {
            System.out.println("Your BMI states you are underweight and you currently have: Minimal health risks..");
        }
        else if(bmi>24.9 && bmi<=29.9)
        {
            System.out.println("Your BMI states you are overweight and you have: Increased health risks.");
        }
        else if(bmi>30.0 && bmi<=34.9)
        {
            System.out.println("Your BMI states you are obese and you currently have: Very high health risks.");
        }
        else if(bmi>35.0)
        {
            System.out.println("Your BMI states you are severly obese and you currently have: Extremely high health risks.");
        }
        EndPrompt.End_XD();
    }
}

class Cholesterol extends HealthCare
{
    public static void cholesterol() 
    {
        Scanner sc = new Scanner(System.in);
        HealthCare hce = new HealthCare();
        System.out.print("Enter average daily CARBOHYDRATE intake(in grams): ");
        int carbs = sc.nextInt();
        System.out.print("Enter average daily PROTEINS intake(in grams): ");
        int proteins = sc.nextInt();
        System.out.print("Enter average daily FAT intake(in grams): ");
        int fats = sc.nextInt();
        int i;double mn=1;
        double f=1000000000;
        for(i=5;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {mn=1;
            f=50000000;
            while(mn<=f)
            {
                mn+=1;
            }
            System.out.print(".");
            }
            System.out.println();
        }
        if (carbs <= 325 && carbs >= 225)
        {
            System.out.println("\u2713 TEST 1=> Normal Carbohydrate diet. Average Intake.");
        }
        else if(carbs<225)
        {
            System.out.println("\u2713 TEST 1=> Low carbohydrate diet. \n**Tip to move towards a healthy diet:  Increase carbohydrate intake by: "+(225-carbs)+"g");
        }
        else if(carbs>325)
        {
            System.out.println("\u2713 TEST 1=> High carbohydrate diet.\n**Tip to move towards a healthy diet:  Decrease carbohydrate intake by: "+(carbs-325)+"g");
        }
        double avgproteins = hce.weight*0.8;
        mn=1;
        f=30000000;
        while(mn<=f)
        {
           mn+=1;
        }
        if(proteins >=(avgproteins-10) && proteins <= (avgproteins +10))
        {
            System.out.println("\u2713 TEST 2\u2713=> Normal protein diet. Average Intake.");
        }
        else if(proteins<(avgproteins-10))
        {
            System.out.println("\u2713 TEST 2=> Low protein diet.**Tip to move towards a healthy diet:  Increase intake by: "+((avgproteins-10)-proteins)+"g");
        }
        else if(proteins>(avgproteins+10))
        {
            System.out.println("\u2713 TEST 2=> High protein diet.**Tip to move towards a healthy diet:  Decrease intake by: "+(proteins-(avgproteins+10))+"g");
        }
        mn=1;
        f=30000000;
        while(mn<=f)
        {
           mn+=1;
        }
        if (fats <=77 && fats >= 44)
        {
            System.out.println("\u2713 TEST 3\u2713=> Average Fat Intake...");
        }
        else if(fats<44)
        {
            System.out.println("\u2713 TEST 3=> Low fat diet.**Tip to move towards a healthy diet:  Increase fat intake by: "+(44-fats)+"g");
        }
        else if(fats>77)
        {
            System.out.println("\u2713 TEST 3=> High fat diet.**Tip to move towards a healthy diet:  Decrease fat intake by: "+(fats-77)+"g");
        }
        mn=1;
        f=30000000;
        while(mn<=f)
        {
           mn+=1;
        }
        System.out.print("Computing results: [");
        for (i=1;i<=100;i++)
        {
            System.out.print("=");
            mn=1;
            f=10000000;
            while(mn<=f)
            {
                mn+=1;
            }
        }
        System.out.print("]______[100%]");
        System.out.println();
        if(carbs >= 225 && carbs <=325)
        {if(fats >=44 && fats <=77)
         {
          if(proteins <= (avgproteins+10) && proteins >= (avgproteins-10) )
          System.out.println("/u2713 Congratulations! You have been diagnosed with minimal cholesterol risks.");
          else if(proteins < (avgproteins+10) )
          System.out.println("/u2713 Congratulations! You have been diagnosed with minimal cholesterol risks.");
          else
          System.out.println("Results: You have been diagnosed with increased cholesterol risks. Kindly improve your diet.");
         }
         else if(fats < 44)
         {if(proteins <= (avgproteins+10) && proteins >= (avgproteins-10) )
          System.out.println("/u2713 Congratulations! You have been diagnosed with minimal cholesterol risks.");
          else if(proteins < (avgproteins-10) )
          System.out.println("/u2713 Congratulations! You have been diagnosed with minimal cholesterol risks.");
          else
          System.out.println("Results: You have been diagnosed with increased cholesterol risks. Kindly improve your diet.");
         }
         else
         {if(proteins <= (avgproteins+10) && proteins >= (avgproteins-10) )
          System.out.println("Results: You have been diagnosed with high cholesterol risks. Kindly improve your diet quality.");
          else if(proteins < (avgproteins-10) )
          System.out.println("Results: You have been diagnosed with high cholesterol risks. Kindly improve your diet quality.");
          else
          System.out.println("/u2713 Congratulations! You have been diagnosed with minimal cholesterol risks.");
         }
        }
        else if(carbs < 225)
        {
         if(fats >=44 && fats <=77)
         {if(proteins <= (avgproteins+10) && proteins >= (avgproteins-10) )
          System.out.println("/u2713 Congratulations! You have been diagnosed with minimal cholesterol risks.");
          else if(proteins < (avgproteins-10) )
          System.out.println("/u2713 Congratulations! You have been diagnosed with minimal cholesterol risks.");
          else
          System.out.println("Results: You have been diagnosed with increased cholesterol risks. Kindly improve your diet.");
         }
         else if(fats < 44)
         {if(proteins <= (avgproteins+10) && proteins >= (avgproteins-10) )
          System.out.println("/u2713 Congratulations! You have been diagnosed with minimal cholesterol risks.");
          else if(proteins < (avgproteins-10) )
          System.out.println("/u2713 Congratulations! You have been diagnosed with minimal cholesterol risks.");
          else
          System.out.println("Results: You have been diagnosed with increased cholesterol risks. Kindly improve your diet.");
         }
         else
         {if(proteins <= (avgproteins+10) && proteins >= (avgproteins-10) )
          System.out.println("Results: You have been diagnosed with high cholesterol risks. Kindly improve your diet quality.");
          else if(proteins < (avgproteins-10) )
          System.out.println("Results: You have been diagnosed with high cholesterol risks. Kindly improve your diet quality.");
          else
          System.out.println("Results: You have been diagnosed with high cholesterol risks. Kindly improve your diet quality.");
         }
        }
        else
        {
         if(fats >=44 && fats <=77)
         {if(proteins <= (avgproteins+10) && proteins >= (avgproteins-10) )
          System.out.println("Results: You have been diagnosed with increased cholesterol risks. Kindly improve your diet.");
          else if(proteins < (avgproteins-10) )
          System.out.println("Results: You have been diagnosed with increased cholesterol risks. Kindly improve your diet.");
          else
          System.out.println("Results: You have been diagnosed with increased cholesterol risks. Kindly improve your diet.");
         }
         else if(fats < 44)
         {if(proteins <= (avgproteins+10) && proteins >= (avgproteins-10) )
          System.out.println("/u2713 Congratulations! You have been diagnosed with minimal cholesterol risks., But you are advised to check your Sugar levels");
          else if(proteins < (avgproteins-10) )
          System.out.println("Results: You have been diagnosed with increased cholesterol risks. Kindly improve your diet.");
          else
          System.out.println("Results: You have been diagnosed with increased cholesterol risks. Kindly improve your diet.");
         }
         else
         {if(proteins <= (avgproteins+10) && proteins >= (avgproteins-10) )
          System.out.println("Results: You have been diagnosed with high cholesterol risks. Kindly improve your diet quality.");
          else if(proteins < (avgproteins-10) )
          System.out.println("Results: You have been diagnosed with Extremely High cholesterol risks. Kindly get checked by a physician.");
          else
          System.out.println("Results: You have been diagnosed with Extremely High cholesterol risks. Kindly get checked by a physician.");
         }
        }
        System.out.println("**_ This feature is based off of information from the web. Estimations of high accuracy are required for this feature to give correct results. The results will be false if the estimation varies for more than 8-10 grams.");
        System.out.println();
        EndPrompt.End_XD();
    }
}
class _Sugar extends HealthCare
{
    public static void Sugar() 
    {
        Scanner cs=new Scanner(System.in);
        System.out.print("Enter your daily average Sugar-containing food intake(in grams): " );
        double sug = cs.nextDouble();
        System.out.println("In what form do you consume the most sugar on a weekly basis? \nChoose one of the options:");
        System.out.print("1.Sweets \n2.Chocolates \n3.Cakes and Pastries \n4.Drinks, like Milkshakes \nHcExpert@User_"+UserTag+">>> ");
        int c3=cs.nextInt();
        BMI bodymass = new BMI();
        System.out.print("Getting the results...");
        int i;double mn=1;
        double f=1000000000;
        for(i=5;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {mn=1;
            f=50000000;
            while(mn<=f)
            {
                mn+=1;
            }
            System.out.print(".");
            }
            System.out.println();
        }
        if(gender==1)
        {
          if(bodymass.bmi >=18.5 && bodymass.bmi<=24.9)
        {
            if(c3==1)
            {
                 sug=sug*50/100;
                 if (sug <=42 && sug >= 35)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug < 35)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:");
                    System.out.println("Increase Sugar intake by: "+" "+(35-sug)+"g");
                }
                else if(sug>42)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-42)+"g");
                }
            }
            else if(c3==2)
            {
                 sug=sug*76/100;
                 if (sug <=42 && sug >= 35)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<35)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(35-sug)+"g");
                }
                else if(sug>42)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-42)+"g");
                }
            }
            else if(c3==3)
            {
                 sug=sug*57/100;
                 if (sug <=42 && sug >= 35)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<35)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(35-sug)+"g");
                }
                else if(sug>42)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-42)+"g");
                }
            }
            else if(c3==4)
            {
                 sug=sug*27/100;
                 if (sug <=42 && sug >= 35)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<35)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(35-sug)+"g");
                }
                else if(sug>42)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-42)+"g");
                }
            }
            else
            {
                System.out.println("ERROR! Enter correct details.");
                Sugar();
            }
        }
        else if(bodymass.bmi<18.5)
        {
            if(c3==1)
            {
                 sug=sug*50/100;
                 if (sug <=38 && sug >= 32)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<32)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(32-sug)+"g");
                }
                else if(sug>38)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-38)+"g");
                }
            }
            else if(c3==2)
            {
                 sug=sug*76/100;
                 if (sug <=38 && sug >= 32)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<32)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(32-sug)+"g");
                }
                else if(sug>38)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-38)+"g");
                }
            }
            else if(c3==3)
            {
                 sug=sug*57/100;
                 if (sug <=38 && sug >= 32)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<32)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(32-sug)+"g");
                }
                else if(sug>38)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-38)+"g");
                }
            }
            else if(c3==4)
            {
                 sug=sug*27/100;
                 if (sug <=38 && sug >= 32)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<32)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(32-sug)+"g");
                }
                else if(sug>38)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-38)+"g");
                }
            }
            else
            {
                System.out.println("ERROR! Enter correct details.");
                Sugar();
            }
        }
        else if(bodymass.bmi>24.9 && bodymass.bmi<=29.9)
        {
             if(c3==1)
            {
                 sug=sug*50/100;
                 if (sug <=34 && sug >= 29)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<29)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(29-sug)+"g");
                }
                else if(sug>34)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-34)+"g");
                }
            }
            else if(c3==2)
            {
                 sug=sug*76/100;
                                 if (sug <=34 && sug >= 29)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<29)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(29-sug)+"g");
                }
                else if(sug>34)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-34)+"g");
                }
            }
            else if(c3==3)
            {
                 sug=sug*57/100;
                                  if (sug <=34 && sug >= 27)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<27)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(27-sug)+"g");
                }
                else if(sug>34)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-34)+"g");
                }
            }
            else if(c3==4)
            {
                 sug=sug*27/100;
                                 if (sug <=34 && sug >= 27)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<27)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(27-sug)+"g");
                }
                else if(sug>34)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-34)+"g");
                }
            }
            else
            {
                System.out.println("ERROR! Enter correct details.");
                Sugar();
            }
        }
        else if(bodymass.bmi>30.0 && bodymass.bmi<=34.9)
        {
             if(c3==1)
            {
                 sug=sug*50/100;
                 if (sug <=30 && sug >= 23)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<23)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(23-sug)+"g");
                }
                else if(sug>30)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-30)+"g");
                }
            }
            else if(c3==2)
            {
                 sug=sug*76/100;
                 if (sug <=30 && sug >= 23)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<23)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(23-sug)+"g");
                }
                else if(sug>30)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-30)+"g");
                }
            }
            else if(c3==3)
            {
                 sug=sug*57/100;
                  if (sug <=30 && sug >= 23)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<23)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(23-sug)+"g");
                }
                else if(sug>30)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-30)+"g");
                }
            }
            else if(c3==4)
            {
                 sug=sug*27/100;
                 if (sug <=30 && sug >= 23)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<23)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(23-sug)+"g");
                }
                else if(sug>30)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-30)+"g");
                }
            }
            else
            {
                System.out.println("ERROR! Enter correct details.");
                Sugar();
            }
        }
        else if(bodymass.bmi>35.0)
        {
             if(c3==1)
            {
                 sug=sug*50/100;
                 if (sug <=22 && sug >= 17)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<17)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(17-sug)+"g");
                }
                else if(sug>22)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-22)+"g");
                }
            }
            else if(c3==2)
            {
                 sug=sug*76/100;
                 if (sug <=22 && sug >= 17)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<17)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(17-sug)+"g");
                }
                else if(sug>22)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-22)+"g");
                }
            }
            else if(c3==3)
            {
                 sug=sug*57/100;
                 if (sug <=22 && sug >= 17)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<17)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(17-sug)+"g");
                }
                else if(sug>22)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-22)+"g");
                }
            }
            else if(c3==4)
            {
                 sug=sug*27/100;
                  if (sug <=22 && sug >= 17)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<17)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(17-sug)+"g");
                }
                else if(sug>22)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-22)+"g");
                }
            }
            else
            {
                System.out.println("ERROR! Enter correct details.");
                Sugar();
            }
        }
        }
        else if(gender ==2)
        {
            if(bodymass.bmi >=18.5 && bodymass.bmi<=24.9)
        {
            if(c3==1)
            {
                 sug=sug*50/100;
                 if (sug <=29 && sug >= 22)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<22)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(22-sug)+"g");
                }
                else if(sug>29)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-29)+"g");
                }
            }
            else if(c3==2)
            {
                 sug=sug*76/100;
                 if (sug <=29 && sug >= 22)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<22)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(22-sug)+"g");
                }
                else if(sug>29)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-29)+"g");
                }
            }
            else if(c3==3)
            {
                 sug=sug*57/100;
                  if (sug <=29 && sug >= 22)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<22)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(22-sug)+"g");
                }
                else if(sug>29)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-29)+"g");
                }
            }
            else if(c3==4)
            {
                 sug=sug*27/100;
                 if (sug <=29 && sug >= 22)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<22)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(22-sug)+"g");
                }
                else if(sug>29)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-29)+"g");
                }
            }
            else
            {
                System.out.println("ERROR! Enter correct details.");
                Sugar();
            }
        }
        else if(bodymass.bmi<18.5)
        {
            if(c3==1)
            {
                 sug=sug*50/100;
                if (sug <=32 && sug >= 23)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<23)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(23-sug)+"g");
                }
                else if(sug>32)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-32)+"g");
                }
            }
            else if(c3==2)
            {
                 sug=sug*76/100;
                 if (sug <=32 && sug >= 23)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<23)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(23-sug)+"g");
                }
                else if(sug>32)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-32)+"g");
                }
            }
            else if(c3==3)
            {
                 sug=sug*57/100;
                 if (sug <=32 && sug >= 23)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<23)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(23-sug)+"g");
                }
                else if(sug>32)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-32)+"g");
                }
            }
            else if(c3==4)
            {
                 sug=sug*27/100;
                 if (sug <=32 && sug >= 23)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<23)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(23-sug)+"g");
                }
                else if(sug>32)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-32)+"g");
                }
            }
            else
            {
                System.out.println("ERROR! Enter correct details.");
                Sugar();
            }
        }
        else if(bodymass.bmi>24.9 && bodymass.bmi<=29.9)
        {
             if(c3==1)
            {
                 sug=sug*50/100;
                 if (sug <=27 && sug >= 20)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<20)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(20-sug)+"g");
                }
                else if(sug>27)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-27)+"g");
                }
            }
            else if(c3==2)
            {
                 sug=sug*76/100;
                 if (sug <=27 && sug >= 20)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<20)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(20-sug)+"g");
                }
                else if(sug>27)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-27)+"g");
                }
            }
            else if(c3==3)
            {
                 sug=sug*57/100;
                 if (sug <=27 && sug >= 20)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<20)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(20-sug)+"g");
                }
                else if(sug>27)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-27)+"g");
                }
            }
            else if(c3==4)
            {
                 sug=sug*27/100;
                 if (sug <=27 && sug >= 20)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<20)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(20-sug)+"g");
                }
                else if(sug>27)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-27)+"g");
                }
            }
            else
            {
                System.out.println("ERROR! Enter correct details.");
                Sugar();
            }
        }
        else if(bodymass.bmi>30.0 && bodymass.bmi<=34.9)
        {
             if(c3==1)
            {
                 sug=sug*50/100;
                 if (sug <=24 && sug >= 17)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<17)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(17-sug)+"g");
                }
                else if(sug>24)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-24)+"g");
                }
            }
            else if(c3==2)
            {
                 sug=sug*76/100;
                 if (sug <=24 && sug >= 17)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<17)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(17-sug)+"g");
                }
                else if(sug>24)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-24)+"g");
                }
            }
            else if(c3==3)
            {
                 sug=sug*57/100;
                 if (sug <=24 && sug >= 17)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<17)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(17-sug)+"g");
                }
                else if(sug>24)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-24)+"g");
                }
            }
            else if(c3==4)
            {
                 sug=sug*27/100;
                 if (sug <=24 && sug >= 17)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<17)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(17-sug)+"g");
                }
                else if(sug>24)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-24)+"g");
                }
            }
            else
            {
                System.out.println("ERROR! Enter correct details.");
                Sugar();
            }
        }
        else if(bodymass.bmi>35.0)
        {
             if(c3==1)
            {
                 sug=sug*50/100;
                 if (sug <=22 && sug >= 13)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<13)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(13-sug)+"g");
                }
                else if(sug>22)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-22)+"g");
                }
            }
            else if(c3==2)
            {
                 sug=sug*76/100;
                 if (sug <=22 && sug >= 13)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<13)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(13-sug)+"g");
                }
                else if(sug>22)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-22)+"g");
                }
            }
            else if(c3==3)
            {
                 sug=sug*57/100;
                 if (sug <=22 && sug >= 13)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<13)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(13-sug)+"g");
                }
                else if(sug>22)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-22)+"g");
                }
            }
            else if(c3==4)
            {
                 sug=sug*27/100;
                 if (sug <=22 && sug >= 13)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Average Sugar Intake.  Congratulations! You have minimal diabetic risk.");
                }
                else if(sug<13)
                {
                    System.out.println("\u2713 SUGAR TEST >>> Low Sugar Diet. You currently have minimal diabetic risks. \n**Tip to move towards a healthy diet:  \nIncrease Sugar intake by: "+" "+(13-sug)+"g");
                }
                else if(sug>22)
                {
                    System.out.println("\u2713 SUGAR TEST >>> High sugar diet.**Tip to move towards a healthy diet:  \nDecrease Sugar intake by: "+" "+(sug-22)+"g");
                }
            }
            else
            {
                System.out.println("ERROR! Enter correct details.");
                Sugar();
            }
        }
    }
    System.out.println();
    EndPrompt.End_XD();
    }
}
class Life_Exp extends HealthCare
{
    public static double avglifeexp = 69.6;
    public static void LifeExpectancy() 
    {
        System.out.println("This feature is currently in its Developing Phase. Be one of the first to try it out.");
        System.out.println("Answer the following questions accurately to get the best results. Good Luck.");  
        //BMI BLOCK
        BMI bodymass = new BMI();
        if(bodymass.bmi >=18.5 && bodymass.bmi<=24.9)
        {
            avglifeexp += 0;
        }
        else if(bodymass.bmi<18.5)
        {
            avglifeexp +=2;
        }
        else if(bodymass.bmi>24.9 && bodymass.bmi<=29.9)
        {
            avglifeexp -= 2;
        }
        else if(bodymass.bmi>30.0)
        {
            avglifeexp -= 4;
        }
        System.out.println("Loading First Question...");
        System.out.println();
        int i=1;
        long f=1000000000;
        while(i<=f)
        {
            i+=1;
        }
        Que1.Question1();
    }
}
class Que1 extends Life_Exp
{
    public static void Question1() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Family's medical background can help extensively in pinpointing potential related risks and potential issues. \nWhich of these best describes your family history?");
        System.out.println("\n1. Family member lived up to the age of 70 years with no heart-related problems before age 55.");
        System.out.println("2. Heart-related issues of a family member before age 55.");
        System.out.println("3. Don't know.");
        System.out.println();
        System.out.print("HcExpert@User_"+UserTag+">>>");
        int cfirst = sc.nextInt();
        if(cfirst==1)
        avglifeexp = avglifeexp+2;
        else if(cfirst==2)
        avglifeexp = avglifeexp-2;
        else if(cfirst==3)
        avglifeexp = avglifeexp+0;
        else
        {
        System.out.println("Enter correct option!");
        Question1();
        }
        System.out.println("Loading Second Question...");
        System.out.println();
        int i=1;
        long f=1000000000;
        while(i<=f)
        {
            i+=1;
        }
        Que2.Question2();
    }
}
class Que2 extends Life_Exp
{
    public static void Question2() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Blood Pressure plays a vital role in life expectancy. Although high blood pressure and hypertension is a common problem, A good medical routine can control blood pressure.");
        System.out.println("Which of these best describes you?");
        System.out.println();
        System.out.println("1. Blood Pressure is checked with normal reading.");
        System.out.println("2. High blood pressure, on medication and under control.");
        System.out.println("3. High blood pressure, not under control.");
        System.out.println("4. Don't know Blood Pressure.");
        System.out.println();
        System.out.print("HcExpert@User_"+UserTag+">>>");
        int csecond = sc.nextInt();
        if(csecond==1)
        avglifeexp = avglifeexp+3;
        else if(csecond==2)
        avglifeexp = avglifeexp+2;
        else if(csecond==3)
        avglifeexp = avglifeexp-3;
        else if(csecond == 4)
        avglifeexp -=2;
        else
        {
        System.out.println("Enter correct option!");
        Question2();
        }
        System.out.println("Loading Third Question...");
        System.out.println();
        int i=1;
        long f=1000000000;
        while(i<=f)
        {
            i+=1;
        }
        Que3.Question3();
    }
}
class Que3 extends Life_Exp
{
    public static void Question3() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Stress is the body's response to physical, mental, or emotional pressure. Stress causes chemical changes in the body that can raise blood pressure, heart rate, and blood sugar levels.");
        System.out.println("Relax and choose which one of these is the closest to your views?");
        System.out.println();
        System.out.println("1. Stress is a positive influence.");
        System.out.println("2. I've had my shares of ups and downs");
        System.out.println("3. Stress is a overwhelming influence.");
        System.out.println();
        System.out.print("HcExpert@User_"+UserTag+">>>");
        int cthird = sc.nextInt();
        if(cthird==1)
        avglifeexp = avglifeexp+1;
        else if(cthird==2)
        avglifeexp = avglifeexp+0;
        else if(cthird==3)
        avglifeexp = avglifeexp-1;
        else
        {
        System.out.println("Enter correct option!");
        Question3();
        }
        System.out.println("Loading Fourth Question...");
        System.out.println();
        int i=1;
        long f=1000000000;
        while(i<=f)
        {
            i+=1;
        }
        Que4.Question4();
    }
}
class Que4 extends Life_Exp
{
    public static void Question4() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Physical activity is another key to long life. An active lifestyle aids in good mental health, protection from chronic diseases and reduced risk of heart diseases.");
        System.out.println("What describes your physical routine?");
        System.out.println();
        System.out.println("1. Daily vigorous physical exercises for at least 20 minutes.");
        System.out.println("2. Go for a walk for around 30 minutes 4 times a week.");
        System.out.println("3. Somewhat active.");
        System.out.println("4. Not active at all.");
        System.out.println();
        System.out.print("HcExpert@User_"+UserTag+">>>");
        int cfourth = sc.nextInt();
        if(cfourth==1)
        avglifeexp = avglifeexp+3;
        else if(cfourth==2)
        avglifeexp = avglifeexp+2;
        else if(cfourth==3)
        avglifeexp = avglifeexp+0;
        else if(cfourth ==4)
        avglifeexp = avglifeexp - 3;
        else
        {
        System.out.println("Enter correct option!");
        Question4();
        }
        System.out.println("Loading Fifth Question...");
        System.out.println();
        int i=1;
        long f=1000000000;
        while(i<=f)
        {
            i+=1;
        }
        Que5.Question5();
    }
}
class Que5 extends Life_Exp
{
    public static void Question5() 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("A good diet has all the advantages of a active lifestyle with good functioning of the digestive system, strengthening of bones,muscles and immunity, making diet a factor to determine life expectancy.");
        System.out.println("While meat and oil contribute to cholesterol and heart disease, vegetables, fruits and cereals don't contain cholesterol or saturated fats, and have cancer and heart disease-fighting nutrients.");
        System.out.println("Don't feel embarrassed and answer which one of these best determines your eating habits?");
        System.out.println();
        System.out.println("1. Eat more than 5 portions of fruits and vegetables.");
        System.out.println("2. Average amount of fruits and vegetables and minimal amount of oily and spicy fast foods.");
        System.out.println("3. Eat fast or processed on a daily basis and minimal amount of fruits and vegetables.");System.out.println();
        System.out.print("HcExpert@User_"+UserTag+">>>");
        int cfifth = sc.nextInt();
        if(cfifth==1)
        avglifeexp = avglifeexp+3;
        else if(cfifth==2)
        avglifeexp = avglifeexp+0;
        else if(cfifth==3)
        avglifeexp = avglifeexp-2;
        else
        {
        System.out.println("Enter correct option!");
        Question5();
        }
        System.out.println("Loading Sixth Question...");
        System.out.println();
        int i=1;
        long f=1000000000;
        while(i<=f)
        {
            i+=1;
        }
        Que6.Question6();
    }
}
class Que6 extends Life_Exp
{
    public static void Question6() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Road accidents are a common cause of death in India. Deaths by road accidents are increasing by about 5% every year.");
        System.out.println("Which of these best describes your driving OR travel history?");
        System.out.println();
        System.out.println("1. No Accidents/ Violations in past 3 years.");
        System.out.println("2. 1 - 3 Accidents/ Violations in past 3 years.");
        System.out.println("3. 4 or more Accidents/ Violations in past 3 years.");
        System.out.println("4. Convicted of driving for being intoxicated.");
        System.out.println("5. Convicted more than 1 times of driving for being intoxicated.");
        System.out.println("6. Don't drive or travel much.");
        System.out.println();
        System.out.print("HcExpert@User_"+UserTag+">>>");
        int csixth = sc.nextInt();
        if(csixth==1)
        avglifeexp = avglifeexp+1;
        else if(csixth==2)
        avglifeexp = avglifeexp+0;
        else if(csixth==3)
        avglifeexp = avglifeexp-4;
        else if(csixth == 4)
        {
            if(age < 18)
            {
                System.out.println("You aren't even grown up enough to consume intoxicants. Calling the police...");
            }
            else
            avglifeexp = avglifeexp-6;
        }
        else if(csixth == 5)
        {
            if(age < 18)
            {
                System.out.println("You aren't even grown up enough to consume intoxicants. Calling the police...");
            }
            else
            avglifeexp = avglifeexp-12;
        }
        else if(csixth == 6)
        avglifeexp = avglifeexp+2;
        else
        {
        System.out.println("Enter correct option!");
        Question6();
        }
        System.out.println("Loading Seventh Question...");
        System.out.println();
        int i=1;
        long f=1000000000;
        while(i<=f)
        {
            i+=1;
        }
        Que7.Question7();
    }
}
class Que7 extends Life_Exp
{
    public static void Question7() 
    {
        if(age > 18)
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Drinking too much alcohol causes auto accidents, cancers, and liver disease. Watch how much you drink, and don't drink and drive. ");
            System.out.println("With that, answer which of these describes your alcohol-consumption routine");
            System.out.println();
            System.out.println("1. Don't drink or never more than 1-2 drinks per day.");
            System.out.println("2. 3-4 drinks for more than 2 times a week.");
            System.out.println("3. 5 or more drinks at one time for more than twice a month.");
            System.out.println();
            System.out.print("HcExpert@User_"+UserTag+">>>");
            int cseventh = sc.nextInt();
        if(cseventh==1)
        avglifeexp = avglifeexp+1;
        else if(cseventh == 2)
        {
            if(age < 18)
            {
                System.out.println("You aren't even grown up enough to consume intoxicants. Calling the police...");
            }
            else
            avglifeexp = avglifeexp-3;
        }
        else if(cseventh == 3)
        {
            if(age < 18)
            {
                System.out.println("You aren't even grown up enough to consume intoxicants. Calling the police...");
            }
            else
            avglifeexp = avglifeexp-6;
        }
        else
        {
        System.out.println("Enter correct option!");
        Question7();
        }
        System.out.println("Loading Eighth Question...");
        System.out.println();
        int i=1;
        long f=1000000000;
        while(i<=f)
        {
            i+=1;
        }
        Que8.Question8();
        }
    }
}
class Que8 extends Life_Exp
{
    public static void Question8() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Smoking accounts for more than 1.35 million deaths in the Indian subcontinent. As soon as you quit smoking, your risk of lung cancer and heart disease begins to drop.");
        System.out.println("Select the one best defining your smoke intake.");
        System.out.println();
        System.out.println("1. Never smoked.");
        System.out.println("2. Quit more than 2 years ago.");
        System.out.println("3. Quit less than 2 years ago.");
        System.out.println("4. Smoke less than 2 packs per day.");
        System.out.println("5. Smoke more than 2 packs per day.");
        System.out.println();
        System.out.print("HcExpert@User_"+UserTag+">>>");
        int ceighth = sc.nextInt();
        if(ceighth==1)
        avglifeexp = avglifeexp+2;
        else if(ceighth==2)
        {
            if(age < 18)
            {
                System.out.println("You aren't even grown up enough to smoke. Calling the police...");
            }
            avglifeexp = avglifeexp+1;
        }   
        else if(ceighth==3)
        {
            if(age < 18)
            {
                System.out.println("You aren't even grown up enough to smoke. Calling the police...");
            }
            avglifeexp = avglifeexp-1;
        }
        else if(ceighth == 4)
        {
            if(age < 18)
            {
                System.out.println("You aren't even grown up enough to smoke. Calling the police...");
            }
            else
            avglifeexp = avglifeexp-4;
        }
        else if(ceighth == 5)
        {
            if(age < 18)
            {
                System.out.println("You aren't even grown up enough to smoke. Calling the police...");
            }
            else
            avglifeexp = avglifeexp-8;
        }
    
        else
        {
        System.out.println("Enter correct option!");
        Question8();
        }
        System.out.println("Loading Ninth Question...");
        System.out.println();
        int i=1;
        long f=1000000000;
        while(i<=f)
        {
            i+=1;
        }
        Que9.Question9();
    }
}
class Que9 extends Life_Exp
{
    public static void Question9() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Preventive measures come before the cure. Waiting for problems to occur instead of proactively managing your health may be detrimental to your longevity.");
        System.out.println("Which one of these best describes your doctor visits.");
        System.out.println();
        System.out.println("1. Regularly schedule checkups at the physician");
        System.out.println("2. Go to the doctor only when i feel ill.");
        System.out.println("3. Visit a doctor in cases of severe inconvenience/ Not visit a doctor at all.");
        System.out.println();
        System.out.print("HcExpert@User_"+UserTag+">>>");
        int cninth= sc.nextInt();
        if(cninth==1)
        avglifeexp = avglifeexp+1;
        else if(cninth==2)
        avglifeexp = avglifeexp+0;
        else if(cninth==3)
        avglifeexp = avglifeexp-2;
        else
        {
        System.out.println("Enter correct option!");
        Question9();
        }
        System.out.println("Loading Last Question...");System.out.println();System.out.println();
        int i=1;
        long f=1000000000;
        while(i<=f)
        {
            i+=1;
        }
        Que10.Question10();
    }
}
class Que10 extends Life_Exp
{
    public static void Question10() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\"Life is either a daring adventure or nothing at all.\" \n                                                      ~Helen Keller");
        System.out.println("Last Question! Choose which one of these best describes your views about... life.");
        System.out.println();
        System.out.println("1. Life is supernatural. It is magnificent how something unpredictable happens every moment.");
        System.out.println("2. A meaningful life is possible in a purely physical world devoid of finite and infinite spiritual realities.");
        System.out.println("3. Life can be robustly meaningful even if there is no God, after-life, or transcendent realm.");
        System.out.println("4. All values are baseless and that nothing can be known or communicated.");
        System.out.println();
        System.out.print("HcExpert@User_"+UserTag+">>>");
        System.out.println();System.out.println();
        int ctenth= sc.nextInt();
        System.out.println();
        int i;double mn=1;
        double f=1000000000;
        while(mn<=f)
        {
                mn+=1;
        }
        if(ctenth==1)
        {
            avglifeexp = avglifeexp+2;
        }
        else if(ctenth==2)
        {
            avglifeexp = avglifeexp+0;
        }
        else if(ctenth==3)
        {
            avglifeexp = avglifeexp+1;
        }
        else if(ctenth==4)
        {
            avglifeexp= avglifeexp+0;
        }
        else
        {
        System.out.println("Enter correct option!");
        Question10();
        }
        System.out.println();
        Result.LifeEnd();
    }
}
class Result extends Que10
{
    public static void LifeEnd() 
    {
        System.out.println("Getting the results...");
        int i;double mn=1;
        double f=1000000000;
        for(i=5;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {mn=1;
            f=50000000;
            while(mn<=f)
            {
                mn+=1;
            }
            System.out.print(".");
            }
            System.out.println();
        }
        System.out.println("\nYour final Life Expectancy is "+avglifeexp+" years.");
        if(avglifeexp <60)
        System.out.println("The calculated lifespan is just an estimated result on the basis of information found on the web. The developers wish you a long and happy life ahead of you.");
        else
        System.out.println("Make sure to rate the program a 5 stars when you are on your death-bed.");
        System.out.println();
        EndPrompt.End_XD();
    }
}
class EndPrompt extends HealthCare
{
    public static void End_XD() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice: \n1.Go back to homepage. \n0.Exit");
        System.out.println();
        System.out.print("HcExpert@User_"+UserTag+">>>");
        int ch1000000 = sc.nextInt();
        if(ch1000000 == 1)
        {
            System.out.println("Redirecting...");
            int i;double mn=1;
            double f=100000000;
            while(mn<=f)
            {
                mn+=1;
            }
            WelcomePrompt.WelcomePrompt();
        }
        else if(ch1000000 == 0)
        Ending.End();
        else
        {
            System.out.println("Enter correct choice!");
            EndPrompt.End_XD();
        }
    }
}
class Ending extends HealthCare
{
    public static void End()
    {
        int i;double mn=1;
        double f=1000000000;
        System.out.println();
        System.out.println("*_1. This program is not an actual calculator but a mere prediction of one's health status based on inputted diet information*");
        System.out.println("*_3. This program is developed from information from the web. Every output is a resultant of the information available on the web.")
        System.out.println();
        while(mn<=f)
        {
                mn+=1;
        }
        System.out.println("Don't take any negative results seriously. The devs wish you a long and prosperous life ahead of you.");
        System.out.println("CREDITS: \n       Kunwar Utkarsh \n       Raunak Raj Gupta \n       Pragyan Singh \n       Yashraj Singh");
        while(mn<=f)
        {
                mn+=1;
        }
        System.out.println();
        System.out.println("~Program Terminated~");
        System.exit(0);
    }
}
