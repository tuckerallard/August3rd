package ssa.tiy.week1.day3assignment;

public class MethodCalling 
{

	public static void main(String[] args) 
	{
		boolean newMoney = true;


		System.out.println(theBeTo(newMoney));
	}

	public static String theBeTo(boolean newMoney)
	{
		
		String howMuchMoney;
		
		if (newMoney) 
		{
			howMuchMoney = "1 dollar";
			System.out.println("Nice!");
		} else 
		{
			howMuchMoney = "0 dollars";
			System.out.println("Sorry :(");
		}
		return howMuchMoney;
	}
	
	public static String ofAndA(String fruit)
	{
		fruit = "Banana";
		return fruit;
	}
	
	public static char inThatHave(char initial)
	{
		initial = 't';
		return initial;
	}
	
	public String name(String firstName)
	{
		firstName = "Tucker";
		return firstName;
	}
	
	public double money(double moneyInAccount)
	{
		moneyInAccount = 45.23423423d;
		return moneyInAccount;
	}
	
	public int feet(int numOfFeet)
	{
		numOfFeet = 2;
		return numOfFeet;
	}
	
	public String lastName(String momLastName)
	{
		momLastName = "Brown";
		return momLastName;
	}
	
	public char grade(char myGrade)
	{
		myGrade = 'A';
		return myGrade;
	}
	
	public float distance(float jumpDistance)
	{
		jumpDistance = 20.34f;
		return jumpDistance;
	}
	
	public int age(int myAge)
	{
		myAge = 25;
		return myAge;
	}
	
	public String dog(String dogName)
	{
		dogName = "Ghost";
		return dogName;
	}
	
	public char initialz(char lastInitial)
	{
		lastInitial = 'A';
		return lastInitial;
	}
	
	public double tax(double taxPercent)
	{
		taxPercent = .23424d;
		return taxPercent;
	}
	
	public float speed(float bicycleSpeed)
	{
		bicycleSpeed = 23.43f;
		return bicycleSpeed;
	}
	
	public int arms(int numOfArms)
	{
		numOfArms = 2;
		return numOfArms;
	}
	
	public String cat(String catName)
	{
		catName = "Mr.Kitty";
		return catName;
	}
	
	public char score(char myScore)
	{
		myScore = 'B';
		return myScore;
	}
	public double chips(double myChips)
	{
		myChips = 2.3234234d;
		return myChips;
	}
	public float change(float myChange)
	{
		myChange = 3.42f;
		return myChange;
	}
	public int ears(int numOfEars)
	{
		numOfEars = 2;
		return numOfEars;
	}
	public String chair(String chairName)
	{
		chairName = "Office Desk Chair";
		return chairName;
	}
	public char food(char foodGrade)
	{
		foodGrade = 'C';
		return foodGrade;
	}
	public double score(double acrobatScore)
	{
		acrobatScore = 9.3883838d;
		return acrobatScore;
	}
	public float remainer(float mathRemainder)
	{
		mathRemainder = .34f;
		return mathRemainder;
	}
	public int eyes(int numOfEyes)
	{
		numOfEyes = 2;
		return numOfEyes;
	}
	public String alien(String alienName)
	{
		alienName = "Borgok";
		return alienName;
	}
	public char health(char healthStatus)
	{
		healthStatus = 'D';
		return healthStatus;
	}
	public double grades(double gradePointAverage)
	{
		gradePointAverage = 23.23232323d;
		return gradePointAverage;
	}
	public float friends(float myFriends)
	{
		myFriends = 0.00f;
		return myFriends;
	}
	public int fingers(int numOfFingers)
	{
		numOfFingers = 10;
		return numOfFingers;
	}
	
	
	
}
