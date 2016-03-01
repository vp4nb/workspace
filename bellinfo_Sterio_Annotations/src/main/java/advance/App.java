package advance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    	Plane p = context.getBean(Plane.class);
    	if(p.getDriver().equals(p.getDriver1()))
    	{
    		System.out.println("same");
    	}
    	else
    	{
    		System.out.println("not same");
    	}
    	System.out.println(p.getEngine());
    	System.out.println(p.getDriver().getQualification());
        System.out.println( "Hello World!" );
    }
}
