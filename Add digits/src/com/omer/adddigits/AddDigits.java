package com.omer.adddigits;

public class AddDigits {

	public static void main(String[] args) {
		AddDigits addDigits = new AddDigits();
		System.out.println("Sumo of digits using while loop: " + addDigits.addDigits(789));
		System.out.println("Sumo of digits using non recursive: " + addDigits.dr(789));
	}
	
	/**
	 * Find sum of digits using loops.
	 * @param num
	 * @return
	 */
    public int addDigits(int num) {
        int digit =0 ;
        int sum = 0;
        
        do {
            sum = 0;           
            //Add all the digits in num variable
            while (num / 10 != 0) {
            	digit = num % 10;
            	num = num /10;
            	sum += digit;
            }         
            sum += num;
            num = sum;
        } while(sum/10 != 0);         
            
        return sum;
    }
    
    /**
     * Finding the sum of digits using digital root formula.
     * @param num
     * @return
     */
    public int dr(int num) {
    	return num - 9*(int)(Math.floor((num-1)/9));
	}
}

