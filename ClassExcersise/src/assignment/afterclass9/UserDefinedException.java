package assignment.afterclass9;

import java.util.Date;
import java.util.Scanner;

public class UserDefinedException {
 
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
        try{
        System.out.println("Enter your card number");
        String number = scan.next();
        
        method1(number);
        }catch(CardInvalidException cie){
            System.out.println(cie);
        }
        
        try{
        	System.out.println("Enter your cvv number");
            int cvv=scan.nextInt();
            method2(cvv);
        }
        catch(CvvInvalidException cvie)
        {
        	System.out.println(cvie);
        }
        try{
        	System.out.println("Enter card Expiry date like yyyy/mm/dd");
            String str=scan.next();
            Date date=new Date(str);
            method3(date);
        }
        catch(DateInvalidException cvie)
        {
        	System.out.println(cvie);
        }
        
 
    }
    static int intLength(int num)
    {
    	int count=0;
    	while(num>0)
    	{
    		num=num/10;
    		count++;
    	}
    	return count;
    }
     
    static void method1(String number) throws CardInvalidException{
        if(number.length() == 16){
            System.out.println("You card number is perfect");
        }else {
            throw new CardInvalidException(number);
        }
         
    }
    
    static void method2(int number) throws CvvInvalidException{
        if(intLength(number) == 3){
            System.out.println("You cvv number is perfect");
        }else {
            throw new CvvInvalidException(number);
        }
         
    }
 
    static void method3(Date date) throws DateInvalidException{
    	Date d=new Date();
    	
    	
        if(d.before(date)){
            System.out.println("You date is perfect");
        }else {
            throw new DateInvalidException(date);
        }
         
    }
}
