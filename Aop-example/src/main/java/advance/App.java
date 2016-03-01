package advance;

import org.springframework.aop.framework.ProxyFactoryBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//target
    	BankServiceImpl bsi= new BankServiceImpl();
    	
    	//advice
    	LogBefore lb=new LogBefore();
    	//Advice
    	LogAfter lf=new LogAfter();
    	ProxyFactoryBean pfb=new ProxyFactoryBean();
    	pfb.setTarget(bsi);
    	pfb.addAdvice(lb);
    	pfb.addAdvice(lf);
    	BankServiceImpl proxyBsi=(BankServiceImpl) pfb.getObject();
    	proxyBsi.transfer("101111", "212222", 100);
    	
    	
        //System.out.println( "Hello World!" );
    }
}
