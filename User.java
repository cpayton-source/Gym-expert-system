public class User{
   String name;//Name of the user
   String sex;//Male or Female
   int age;//16-99
   int height;//Will be in inches
   int weight;//Will be in pounds
   boolean workoutGoal;//True for getting bigger, false for getting smaller
   int active;//How active they are. 1 -> 7 days a week
   public User(){
      this.name = "";
      this.sex = "";
      this.height = 0;
      this.weight = 0;
      this.age = 0;
      this.workoutGoal = false;
      this.active = 0;
      
   }
   //User inputs name
   public void setName(String name){
      this.name = name;
   }
   //User inputs sex
   public void setSex(String sex){
      this.sex = sex;
   }
   //User inputs height
   public void setHeight(int height){
      this.height = height;
   }
   public int getHeight(){
      return this.height;
   }
   //User inputs weight
   public void setWeight(int weight){
      this.weight = weight;
   }
   public int getWeight(){
      return this.weight;
   } 
   //User inputs Age
   public void setAge(int age){
      this.age = age;
   }
   public int getAge(){
      return age;
   }
   //User goal(True == Bulkier, False == Thinner)
   public void setGoal(boolean workoutGoal){
      this.workoutGoal = workoutGoal;
   }
   public boolean getGoal(){
      return workoutGoal;
   }
   public void setActive(int active){
      this.active = active;
   }
   public int getActive(){
      return active;
   }
	   public String output() {
		   String out = "";
	         if(getHeight()>=72){
	             if(getWeight()<160){
	                out+="You are an Ectomorph\n"
	                + "\n\tEctomorphs are long and lean, with very little body fat and muscle."
	                + "\n\tWhen you picture a long-distance runner or fashion model, you’re probably picturing an ectomorph." 
	                + "\n\tThey tend to struggle putting on weight, and they can often eat whatever they want without packing on the pounds immediately."
	                + "\n\nSTRENGTH TRAINING FOR THE ECTOMORPH:"
	                + "\n\tTrain with heavy weights and lots of rest in between sets (2-3 minutes) as well as in between exercises (5 minutes)."
	                + "\n\tOnly train 1-2 body parts per training day to avoid too much caloric expenditure."
	                + "\\tAim for 5-10 reps and 6-8 sets of each exercise."
	                + "\n\tTake plenty of rest in between workouts and never train a muscle group that is sore. And if you’re feeling really sore, try out foam rolling for recovery."
	                + "\nCARDIO TRAINING FOR THE ECTOMORPH:"
	                + "\n\tVery minimal cardio."
	                + "\n\tModerate and low-intensity bike rides and brisk walks (think of them more as relaxing cardio activities to reduce stress";
	                
	                if(getGoal()){
	                   out+="In order to gain muscle, eat eggs, salmon, chicken breast, tuna, and other foods " 
	                   + "\ncontaining high levels of protein."
	                   + "\nDrink two liters of water so that the food processes smoothly throughout your body"
	                   + "\nand you are able to have enough energy stored for a productive workout.";   
	                   if(getAge()>35){
	                      out+="\n I'd suggest lightening the load you eat and workout." 
	                     + "\nTry to lighten the intensity of the workout you intend to do. "
	                     + "\nRegardless of whehter or not you choose to move forward with the plan, humans normally begin to decline in their 20s.";
	                   }
	                }else{
	                   	out+="\nAs you workout using the plan, if you choose to eat less than you will naturally become thinner";
	                   if(getAge()>35){
	                     out+="\n I'd suggest lightening the load workout if you plan to eat less."
	                     + "\nRegardless of whehter or not you choose to move forward with the plan, humans normally begin to decline in their 20s.";
	                  }
	                }
	             }else if(getWeight()<=215 && getWeight()>=160){
	                out+="You are a Mesomorph\n"
	                + "\n\tMesomorphs are athletic, and gain or lose weight very easily."
	                + "\n\tMesomorphs tend to be very flexible, and they often aren’t overweight or underweight." 
	                + "\n\tIn fact, they can gain and lose weight fairly easily without going through dramatic dietary changes or working out every day."
	                + "\nMESOMORPH"
	                + "\nThe Mesomorph is kind of in between the Ectomorph and the Endomorph. \nThey are able to put on muscle easily and genetically are the ideal body type for bodybuilding. \nThey have very strong legs, broad shoulders and a narrower waist. Generally, they also have very low body fat as well."
	                + "\n\nSTRENGTH TRAINING FOR THE MESOMORPH:"
	                + "\n\tThe more varied the training, the better the results."
	                + "\n\tLight, moderate and heavy weight training as well as bodyweight training with the adidas Training app."
	                + "\n\tBasic exercises (squats, lunges, deadlifts, rows, chest press, shoulder press, etc.) with heavy weights, followed by isolation exercises with moderate/light weights."
	                + "\n\tAim for 8-12 reps for most exercises."
	                + "\nWhen it comes to leg training, you can incorporate really heavy weights with around 6 reps and really light or no weights at around 25-30 reps for 3-5 sets."
	                + "\n\tAdd in any other strength training activity that you think is fun and want to try out, like this resistance band workout."
	                + "\nCARDIO TRAINING FOR THE MESOMORPH:"
	                + "\n\t3 days per week of cardio for 15-30 minutes.";
	                
	                if(getGoal()){
	                   out+="In order to gain muscle, eat eggs, salmon, chicken breast, tuna, and other foods " 
	                   + "\ncontaining high levels of protein."
	                   + "\nDrink two liters of water so that the food processes smoothly throughout your body"
	                   + "\nand you are able to have enough energy stored for a productive workout.";   
	                   if(getAge()>35){
	                     out+="\n I'd suggest lightening the load you eat and workout." 
	                     + "\nTry to lighten the intensity of the workout you intend to do. "
	                     + "\nRegardless of whehter or not you choose to move forward with the plan, humans normally begin to decline in their 20s.";
	                   }
	                }else{
	                   out+="\nAs you workout using the plan, if you choose to eat less than you will naturally become thinner";
	                   if(getAge()>35){
	                     out+="\n I'd suggest lightening the load workout if you plan to eat less."
	                     + "\nRegardless of whehter or not you choose to move forward with the plan, humans normally begin to decline in their 20s.";
	                  }
	                }
	             }else{
	                out+="You are an Endomorph\n" 
	                + "\n\tEndomorphs often have lots of body fat and muscle."
	                + "\n\tEndomorphs tend to be taller and wider, and they have a lot of body fat." 
	                + "\n\tThis doesn’t necessarily mean that all endomorphs are overweight, just that they’re more likely to become overweight naturally." 
	                + "\n\tIf you would make a great lineman on a football team or you could play center on a basketball team, you might be an endomorph.";
	               
	                if(getGoal()){
	                   out+="In order to gain muscle, eat eggs, salmon, chicken breast, tuna, and other foods " 
	                   + "\ncontaining high levels of protein."
	                   + "\nDrink two liters of water so that the food processes smoothly throughout your body"
	                   + "\nand you are able to have enough energy stored for a productive workout.";   
	                   if(getAge()>35){
	                     out+="\n I'd suggest lightening the load you eat and workout." 
	                     + "\nTry to lighten the intensity of the workout you intend to do. "
	                     + "\nRegardless of whehter or not you choose to move forward with the plan, humans normally begin to decline in their 20s.";
	                   }
	                }else{
	                   out+="\nAs you workout using the plan, if you choose to eat less than you will naturally become thinner";
	                   if(getAge()>35){
	                     out+="\n I'd suggest lightening the load workout if you plan to eat less."
	                     + "\nRegardless of whehter or not you choose to move forward with the plan, humans normally begin to decline in their 20s.";
	                  }
	                }
	             }
	          }else if(getHeight()>=66 && getHeight()<=71){
	             if(getWeight()<150){
	                out+="You are an Ectomorph\n"
	                + "\n\tEctomorphs are long and lean, with very little body fat and muscle."
	                + "\n\tWhen you picture a long-distance runner or fashion model, you’re probably picturing an ectomorph." 
	                + "\n\nSTRENGTH TRAINING FOR THE ECTOMORPH:"
	                + "\n\tTrain with heavy weights and lots of rest in between sets (2-3 minutes) as well as in between exercises (5 minutes)."
	                + "\n\tOnly train 1-2 body parts per training day to avoid too much caloric expenditure."
	                + "\\tAim for 5-10 reps and 6-8 sets of each exercise."
	                + "\n\tTake plenty of rest in between workouts and never train a muscle group that is sore. And if you’re feeling really sore, try out foam rolling for recovery."
	                + "\nCARDIO TRAINING FOR THE ECTOMORPH:"
	                + "\n\tVery minimal cardio."
	                + "\n\tModerate and low-intensity bike rides and brisk walks (think of them more as relaxing cardio activities to reduce stress";

	                if(getGoal()){
	                   out+="In order to gain muscle, eat eggs, salmon, chicken breast, tuna, and other foods " 
	                   + "\ncontaining high levels of protein."
	                   + "\nDrink two liters of water so that the food processes smoothly throughout your body"
	                   + "\nand you are able to have enough energy stored for a productive workout.";   
	                   if(getAge()>35){
	                     out+="\n I'd suggest lightening the load you eat and workout." 
	                     + "\nTry to lighten the intensity of the workout you intend to do. "
	                     + "\nRegardless of whehter or not you choose to move forward with the plan, humans normally begin to decline in their 20s.";
	                   }
	                }else{
	                   out+="\nAs you workout using the plan, if you choose to eat less than you will naturally become thinner";
	                   if(getAge()>35){
	                     out+="\n I'd suggest lightening the load workout if you plan to eat less."
	                     + "\nRegardless of whehter or not you choose to move forward with the plan, humans normally begin to decline in their 20s.";
	                  }
	                }               
	             }else if(getWeight()<=180 && getWeight()>=150){
	                out+="You are a Mesomorph\n"
	                + "\n\tMesomorphs are athletic, and gain or lose weight very easily."
	                + "\n\tMesomorphs tend to be very flexible, and they often aren’t overweight or underweight."
	                + "\n\tIn fact, they can gain and lose weight fairly easily without going through dramatic dietary changes or working out every day."
	                + "\nMESOMORPH"
	                + "\nThe Mesomorph is kind of in between the Ectomorph and the Endomorph. \nThey are able to put on muscle easily and genetically are the ideal body type for bodybuilding. \nThey have very strong legs, broad shoulders and a narrower waist. Generally, they also have very low body fat as well."
	                + "\n\nSTRENGTH TRAINING FOR THE MESOMORPH:"
	                + "\n\tThe more varied the training, the better the results."
	                + "\n\tLight, moderate and heavy weight training as well as bodyweight training with the adidas Training app."
	                + "\n\tBasic exercises (squats, lunges, deadlifts, rows, chest press, shoulder press, etc.) with heavy weights, followed by isolation exercises with moderate/light weights."
	                + "\n\tAim for 8-12 reps for most exercises."
	                + "\nWhen it comes to leg training, you can incorporate really heavy weights with around 6 reps and really light or no weights at around 25-30 reps for 3-5 sets."
	                + "\n\tAdd in any other strength training activity that you think is fun and want to try out, like this resistance band workout."
	                + "\nCARDIO TRAINING FOR THE MESOMORPH:"
	                + "\n\t3 days per week of cardio for 15-30 minutes.";
	                
	                if(getGoal()){
	                   out+="\nIn order to gain muscle, eat eggs, salmon, chicken breast, tuna, and other foods " 
	                   + "\ncontaining high levels of protein."
	                   + "\nDrink two liters of water so that the food processes smoothly throughout your body"
	                   + "\nand you are able to have enough energy stored for a productive workout.";   
	                   if(getAge()>35){
	                     out+="\n I'd suggest lightening the load you eat and workout." 
	                     + "\nTry to lighten the intensity of the workout you intend to do. "
	                     + "\nRegardless of whehter or not you choose to move forward with the plan, humans normally begin to decline in their 20s.";
	                   }
	                }else{
	                   out+="\nAs you workout using the plan, if you choose to eat less than you will naturally become thinner";
	                   if(getAge()>35){
	                     out+="\n I'd suggest lightening the load workout if you plan to eat less."
	                     + "\nRegardless of whehter or not you choose to move forward with the plan, humans normally begin to decline in their 20s.";
	                  }                
	                }               
	             }else{
	                out+="You are an Endomorph\n" 
	                + "\n\tEndomorphs often have lots of body fat and muscle."
	                + "\n\tEndomorphs tend to be taller and wider, and they have a lot of body fat." 
	                + "\n\tThis doesn’t necessarily mean that all endomorphs are overweight, just that they’re more likely to become overweight naturally." 
	                + "\n\tIf you would make a great lineman on a football team or you could play center on a basketball team, you might be an endomorph";
	                if(getGoal()){
	                   out+="In order to gain muscle, eat eggs, salmon, chicken breast, tuna, and other foods " 
	                   + "\ncontaining high levels of protein."
	                   + "\nDrink two liters of water so that the food processes smoothly throughout your body"
	                   + "\nand you are able to have enough energy stored for a productive workout.";   
	                   if(getAge()>35){
	                     out+="\n I'd suggest lightening the load you eat and workout." 
	                     + "\nTry to lighten the intensity of the workout you intend to do. "
	                     + "\nRegardless of whehter or not you choose to move forward with the plan, humans normally begin to decline in their 20s.";
	                   }
	                }else{
	                   out+="\nAs you workout using the plan, if you choose to eat less than you will naturally become thinner";
	                   if(getAge()>35){
	                     out+="\n I'd suggest lightening the load workout if you plan to eat less."
	                     + "\nRegardless of whehter or not you choose to move forward with the plan, humans normally begin to decline in their 20s.";
	                  }
	                }               
	             }
	          }else{
	             if(getWeight()>=140){
	                out+="You are an Endomorph\n" 
	                + "\n\tEndomorphs often have lots of body fat and muscle."
	                + "\n\tEndomorphs tend to be taller and wider, and they have a lot of body fat." 
	                + "\n\tThis doesn’t necessarily mean that all endomorphs are overweight, just that they’re more likely to become overweight naturally." 
	                + "\n\tIf you would make a great lineman on a football team or you could play center on a basketball team, you might be an endomorph";
	               
	                 if(getGoal()){
	                   out+="\nIn order to gain muscle, eat eggs, salmon, chicken breast, tuna, and other foods " 
	                   + "\ncontaining high levels of protein."
	                   + "\nDrink two liters of water so that the food processes smoothly throughout your body"
	                   + "\nand you are able to have enough energy stored for a productive workout.";   
	                   if(getAge()>35){
	                     out+="\n I'd suggest lightening the load you eat and workout." 
	                     + "\nTry to lighten the intensity of the workout you intend to do. "
	                     + "\nRegardless of whehter or not you choose to move forward with the plan, humans normally begin to decline in their 20s.";
	                   }
	                }else{
	                   out+="\nAs you workout using the plan, if you choose to eat less than you will naturally become thinner";
	                   if(getAge()>35){
	                     out+="\n I'd suggest lightening the load workout if you plan to eat less."
	                     + "\nRegardless of whehter or not you choose to move forward with the plan, humans normally begin to decline in their 20s.";
	                  }
	                }              
	             }else{
	                out+="You are an Ectomorph\n"
	                + "\n\tEctomorphs are long and lean, with very little body fat and muscle."
	                + "\n\tWhen you picture a long-distance runner or fashion model, you’re probably picturing an ectomorph." 
	                + "\n\tThey tend to struggle putting on weight, and they can often eat whatever they want without packing on the pounds immediately."
	                + "\n\nSTRENGTH TRAINING FOR THE ECTOMORPH:"
	                + "\n\tTrain with heavy weights and lots of rest in between sets (2-3 minutes) as well as in between exercises (5 minutes)."
	                + "\n\tOnly train 1-2 body parts per training day to avoid too much caloric expenditure."
	                + "\\tAim for 5-10 reps and 6-8 sets of each exercise."
	                + "\n\tTake plenty of rest in between workouts and never train a muscle group that is sore. And if you’re feeling really sore, try out foam rolling for recovery."
	                + "\nCARDIO TRAINING FOR THE ECTOMORPH:"
	                + "\n\tVery minimal cardio."
	                + "\n\tModerate and low-intensity bike rides and brisk walks (think of them more as relaxing cardio activities to reduce stress";
	               
	                if(getGoal()){
	                   out+="In order to gain muscle, eat eggs, salmon, chicken breast, tuna, and other foods " 
	                   + "\ncontaining high levels of protein."
	                   + "\nDrink two liters of water so that the food processes smoothly throughout your body"
	                   + "\nand you are able to have enough energy stored for a productive workout.";   
	                   if(getAge()>35){
	                     out+="\n I'd suggest lightening the load you eat and workout." 
	                     + "\nTry to lighten the intensity of the workout you intend to do. "
	                     + "\nRegardless of whehter or not you choose to move forward with the plan, humans normally begin to decline in their 20s.";
	                   }
	                }else{
	                   out+="\nAs you workout using the plan, if you choose to eat less than you will naturally become thinner";
	                   if(getAge()>35){
	                     out+="\n I'd suggest lightening the load workout if you plan to eat less."
	                     + "\nRegardless of whehter or not you choose to move forward with the plan, humans normally begin to decline in their 20s.";
	                  }
	                }               
	             }
	          }
	       	return out;	   
	   }
   //toString method
   public String toString(){
      String goal = "";
      if(workoutGoal){
         goal = "Bulkier";
      }else{
         goal = "Thinner";
      }
         return "Name: " + name + ", Sex: " + sex + ", Height: " + height + ", Weight: " + weight + ", Age: " + age + ", Goal: " + goal + ", How active? " + active;
   }
}
