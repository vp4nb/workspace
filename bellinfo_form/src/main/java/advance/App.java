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
    	ApplicationContext context=new ClassPathXmlApplicationContext("prop-config.xml");
    	//context.getBean("loader", ProperKeyLoader.class).loadConnection();
    	context.getBean("propLoader", PropertyLoaderWithProp.class).loadConnection();
    	context.getBean("utilPropLoader", PropertyLoaderWithProp.class).loadConnection();
        System.out.println( "Hello World!" );
    }
}
