package beginning;

/*
 * This code is to determine whether or not you should sleep in.
 * If it's a vacation day, you can sleep in.
 * If it's a weekday and it's not a vacation, you cannot sleep in.
 * If it's the weekend you can sleep in.
 */

public class SleepIn {

	public static boolean sleepIn(boolean weekday, boolean vacation) {
		  
		  if(vacation){
		    return true;
		  }
		  else if(weekday){
		    return false; 
		  }
		  else{
		    return true;
		  }
		  
		}
	
	public static void awake(boolean answer) {
		
		if(answer){
			System.out.println("You can sleep in! Sweet dreams! :)\n");
		}else{
			System.out.println("Sorry buddy, but you gotta wake up. :/\n");
		}
		
	}
	
	
	public static void main(String[]args){
		System.out.println("It's a weekday and you're on vacation. Can you sleep in?");
		awake(sleepIn(true,true));
		System.out.println("It's not a weekday and you're on vacation. Can you sleep in?");
		awake(sleepIn(false,true));
		System.out.println("It's a weekday and you're not vacation. Can you sleep in?");
		awake(sleepIn(true,false));
		System.out.println("It's not a weekday and you're not on vacation. Can you sleep in?");
		awake(sleepIn(false,false));
	}

	
}



