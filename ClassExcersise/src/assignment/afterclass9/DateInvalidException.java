package assignment.afterclass9;

import java.util.Date;

public class DateInvalidException extends RuntimeException{
Date number;
    
DateInvalidException(){
         
    }
DateInvalidException(Date date){
        number = date;
    }
     
    public String toString(){
        if(number !=null){
            return "invalid date entered"+ number +" date must be in future";
        }else{
        return "invalid date. Enter valid date which is in future";
        }
    }
}
