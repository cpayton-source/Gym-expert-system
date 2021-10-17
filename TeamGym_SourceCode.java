import java.util.Scanner;
import java.io.*;
public class TeamGym_SourceCode{
   /*
      MINI GYM EXPERT SYSTEM
      Ask the user a series of questions about their body type
      At the end, depending on where the scale is, the system displays a message suggesting a workout plan and your body type.
   */
         
   public static void main(String[] args) throws IOException{
   
      //Ask the user if they would like to enter in their information
      System.out.println("WELCOME TO GYMES\n" 
      + "\n\nProgrammers: Cameron Payton and Alexander Roper"
      + "\n\nExperts: Lunden Souza, Danny Gordon, and Grant Tinsley"
      + "\n\nCredentials of Experts: " 
      
      + "\n\tDanny Gordon is a certified personal trainer by the American College of Sports Medicine. Danny is also the owner of the Body Studio for Fitness." 
      + "\n\tLunden Souza is a fitness and lifestyle transformation coach. She focuses on helping clients develop and sustain a healthy lifestyle."
      + "\n\tGrant Tinsley PHD is a physiology professor at Texas Tech University");
      Scanner keyboard = new Scanner(System.in);
      FileWriter writer = new FileWriter("UserData.txt");      
      String answer = "";
      System.out.println("Would you like to enter in your information? Answer Y for yes or N for No");
      answer = keyboard.nextLine();
      
      //This makes sure that the user is able to enter in their information as many times as they like
      do{
         //This keeps track of user information as they go through the input phase
         User userInfo = new User();
   
         //Every time the user inputs an a piece of information, the scales are altered.
         //The scales will be used to decide on heavy/light cardio and heavy/light lifting

         //User inputs name
         System.out.println("What is your name?");
         userInfo.setName(keyboard.nextLine());
         
         //User inputs sex   
         String input = "";   
         System.out.println("Are you male or female");
         input = keyboard.nextLine();
         
         //Makes sure the user only enters either male or female
         while(!input.equalsIgnoreCase("male") && !input.equalsIgnoreCase("female")){
            System.out.println("Invalid sex. Must be male or female. Please enter again:");
            input = keyboard.nextLine();
         }
         userInfo.setSex(input);
         
         //User inputs height
         int high;
         System.out.println("Please enter height in inches. 1 ft == 12 in");
         high = keyboard.nextInt();
         
         //58 inches is the average dwarf height. The height cap is 84 inches of 7 feet
         while(high<58 || high >84){
            System.out.println("Invalid height. Must be between 58 and 84. Please enter again:");
            high = keyboard.nextInt();
         }
         userInfo.setHeight(high);
         
         //User inputs weight
         int weight;
         System.out.println("Please enter your weight in pounds");
         weight = keyboard.nextInt();
         
         //Makes sure the weight input is not too small or big
         while(weight<80 || weight>400){
            System.out.println("Invalid weight. Must be between 80 and 400");
            weight = keyboard.nextInt();
         }
         userInfo.setWeight(weight);
         
         //User inputs age
         int age;
         System.out.println("How old are you?");
         age = keyboard.nextInt();
         
         //Makes sure age is not too young or old
         while(age<16 || age>70){
            System.out.println("Invalid age. Must be between 16 and 70");
            age = keyboard.nextInt();
         }
         userInfo.setAge(age);
         //Clear Buffer
         keyboard.nextLine();
         //User enters goal
         String goa;
         System.out.println("Would you like to get bulkier or thinner");
         goa = keyboard.nextLine();
         while(!goa.equalsIgnoreCase("Bulkier") && !goa.equalsIgnoreCase("Thinner")){
            System.out.println("Invalid goal. must be either bulkier or thinner");
            goa = keyboard.nextLine();
         }
         if(goa.toLowerCase().equals("bulkier")){
            userInfo.setGoal(true);  
         }else{
            userInfo.setGoal(false);
         }
         
         //User inputs active level
         int activity;
         System.out.println("How active would you like to be?");
         activity = keyboard.nextInt();
         while(activity<1 || activity>7){
            System.out.println("Invalid activity. Must be between 1 and 7 days week. Please enter again");
            activity = keyboard.nextInt();
         }
         //Clear Buffer
         keyboard.nextLine();
         userInfo.setActive(activity);
         //Output suggestion based on scale
      System.out.println(userInfo.output());
     
         //Write to the text file to keep data
         writer.write(userInfo.toString() + "\n");
         System.out.println();
   
         //Prompt user to enter info again
         System.out.println("Would you like to enter in your information again? Answer Y for yes or N for No");
         answer = keyboard.nextLine();
      }while(answer.equalsIgnoreCase("Y"));
      //If they don't want to enter in any more info, thank them for using the system
      writer.close();
      System.out.println("Thank you for using the System!");
   }
}