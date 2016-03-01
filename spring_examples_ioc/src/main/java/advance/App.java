package advance;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App 
{
	public static void main( String[] args )
    {
       //Car car=new Car();
    	//instead of creating object with new try to do with beans
		 Resource resource = new ClassPathResource("beans.xml");
		    BeanFactory factory = new XmlBeanFactory(resource);
		    factory.getBean("c");
		    
       System.out.println("using Application context");
       ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
       context.getBean("p",Plane.class).display();
    }
}
