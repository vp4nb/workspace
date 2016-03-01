package assignment.afterclass9;

public class CvvInvalidException extends RuntimeException{

	int number;
    
	CvvInvalidException(){
         
    }
	CvvInvalidException(int cvvNumber){
        number = cvvNumber;
    }
     
    public String toString(){
        if(number !=0){
            return "invalid cvv number entered"+ number +" cvv number must be of size 3";
        }else{
        return "invalid cvv number. Enter valid cvv Number of size 3";
        }
    }
}
