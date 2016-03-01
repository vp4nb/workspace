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
    	ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
    	Car c =context.getBean("c", Car.class);
        System.out.println(c.getEngine().getEngineName());
        
    }
}
