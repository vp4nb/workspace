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
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("auto-wire.xml");
    	context.getBean("plane", Plane.class).getEngine().display();
        System.out.println( "Hello World!" );
    }
}
