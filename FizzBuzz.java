package scr.com.project.fizzbuzz;

public class FizzBuzz {
/*
 * The FizzBuzz Challenge

In Java, write a program that prints the integers from 1 to 100 (inclusive).

However:

* For multiples of 3, print "Fizz" instead of the number.
* For multiples of 5, print "Buzz" instead of the number.
* For multiples of both 3 and 5, print "FizzBuzz" instead of the number.
 * */
	
	public void fizzBuzz(){
		//The for loop will start at 1 and run until it 
		//reaches 100.
		for(int i = 1; i<=100; i++){
		//If the modulus of the number in the loop (i) is
		//equal to zero, it is a multiple of 3 (Fizz), 
		//5 (Buzz), or both (FizzBuzz). If none of these
		//conditions are met, then the actual number (i)
		//is printed.	
			if(i%3 == 0 && i%5==0){
				System.out.println("FizzBuzz");
			}else if(i%3 == 0){
				System.out.println("Fizz");			
			}else if(i%5 == 0){
				System.out.println("Buzz");
			}else{
				System.out.println(i);
			}
			
		}	
		
	}
	
	
	public static void main(String[] args) {
		
		FizzBuzz w = new FizzBuzz();
		w.fizzBuzz();

	}

}
