/**
 *Michael Haugh
 *Project CH4PC8
 *AP CS
 *10-18-18
 */

public class Runners
{
   private String runner1;
   private String runner2;
   private String runner3;
   private double time1;
   private double time2;
   private double time3;
   private String firstPlace;
   private String secondPlace;
   private String thirdPlace;

   public Runners(){ 
   }
   
   public Runners(String r1, String r2, String r3, double t1, double t2, 
           double t3, String f, String s, String t){
    // ^This is the constructor.^
        
    runner1 = r1;
    runner2 = r2;
    runner3 = r3;
    time1 = t1;
    time2 = t2;
    time3 = t3;
    firstPlace = f;
    secondPlace = s;
    thirdPlace = t;
   }
   
   public void setRunner1(String r1)
   {
      runner1 = r1;
   }

   /**
    * The setRunner2 method sets the name of
    * the second runner.
    */

   public void setRunner2(String r2)
   {
      runner2 = r2;
   }

   /**
    * The setRunner3 method sets the name of
    * the third runner.
    */

   public void setRunner3(String r3)
   {
      runner3 = r3;
   }

   /**
    * The setTime1 method sets the time of
    * the first runner.
    */

   public void setTime1(double t1)
   {
      time1 = t1;
   }

   /**
    * The setTime2 method sets the time of
    * the second runner.
    */

   public void setTime2(double t2)
   {
      time2 = t2;
   }

   /**
    * The setTime3 method sets the time of
    * the third runner.
    */

   public void setTime3(double t3)
   {
      time3 = t3;
   }

   /**
    * The getRunner1 method returns the name
    * of the first runner.
    */

   public String getRunner1()
   {
      return runner1;
   }

   /**
    * The getRunner2 method returns the name
    * of the second runner.
    */

   public String getRunner2()
   {
      return runner2;
   }

   /**
    * The getRunner3 method returns the name
    * of the third runner.
    */

   public String getRunner3()
   {
      return runner3;
   }

   /**
    * The getTime1 method returns the time
    * of the first runner.
    */

   public double getTime1()
   {
      return time1;
   }

   /**
    * The getTime2 method returns the time
    * of the second runner.
    */

   public double getTime2()
   {
      return time2;
   }

   /**
    * The getTime3 method returns the time
    * of the third runner.
    */

   public double getTime3()
   {
      return time3;
   }

   /**
	* The getFirstPlace method returns the 
    * name of the first place runner.
    * Note: This method does NOT check for ties!
    */

   public String getFirstPlace()
   {
	if (time1 > time2 && time1 > time3){
            firstPlace = runner1;
        }
        
        else if (time2 > time1 && time2 > time3){
            firstPlace = runner2;
        }
        
        else if (time3 > time2 && time3 > time1){
            firstPlace = runner3;
        }
        return firstPlace;
   }

   /**
    * The getSecondPlace method returns the 
    * name of the second place runner.
    * Note: This method does NOT check for ties!
    */

   public String getSecondPlace()
   {
   	if (time1 > time2 || time1 > time3){
            secondPlace = runner1;
        }
        
        else if (time2 > time1 || time2 > time3){
            secondPlace = runner2;
        }
        
        else if (time3 > time2 || time3 > time1){
            secondPlace = runner3;
        }
       return secondPlace;
   }

   /**
    * The getThirdPlace method returns the 
    * name of the third place runner.
    * Note: This method does NOT check for ties!
    */

   public String getThirdPlace()
   {
       	if (time1 < time2 && time1 < time3){
            thirdPlace = runner1;
        }
        
        else if (time2 < time1 && time2 < time3){
            thirdPlace = runner2;
        }
        
        else if (time3 < time2 && time3 < time1){
            thirdPlace = runner3;
        }
        return thirdPlace;
   }
}
