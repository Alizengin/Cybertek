package variableDeclaration;

public class variableDeclaration {

	public static void main(String[] args) {
		//Question 1
		int count = 1;
		System.out.println(count);
		
		//Question2
		String message = "Hello";
		System.out.println(message);
		
		//Question3
		
		int num = 2;
		double cost = 5.44;
		System.out.println(num +", "+ cost );
		
		//Question4
		String variable = "Monday";
		System.out.println("Today's Word-Of-The-Day is: "+ variable);
		
		//Question 5
		int first, second;
		first =55;
		second = 123;
		System.out.println("First is: "+first +" Second = "+ second);
		
		//Question6
		String name1, name2, name3, name4, name5;
		name1 = "James";
		name2 = "Betty";
		name3 = "Herb";
		name4 = "Bob";
		name5 = "Jill";
		System.out.println(name4+", " + name1+", " +name2+", " + name3+", " + name5);

		//Question7
		int i =9;
		float f= 33.4f;
		System.out.println("i= "+ i +" f= "+f);

		//Question8
		String lan1, lan2;
		lan1 = "Java";
		lan2 = "SQL";
		System.out.println("I will learn \""+lan1+"\" and \""+lan2+"\" at CybertekSchool.");
		
		//Question9
		byte steps = 100;
		short miles = 5000;
		int _count = 1000000;  // i can't use variable name count bcs i used it in first question !!
		long population = 3434455667L; /*We have to put at the end capital L to assign to long 
										Otherwise, the compiler will try to parse the literal as an int
										*/
		
		//Question10
		short _hour, _minute, _second;
		//2. An instructor will set different values to your variables
		_hour = 12;
		_minute=24;
		_second = 33;
		String am = "AM";
		String pm = "PM";
		System.out.println(_hour+":"+_minute+":"+_second+" "+pm);
		
	}

}
