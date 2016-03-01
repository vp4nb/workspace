package advance;

import java.lang.reflect.Method;

import org.aopalliance.aop.Advice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;

public class LogBefore implements MethodBeforeAdvice {
	Logger log=LoggerFactory.getLogger(LogBefore.class);

	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		// TODO Auto-generated method stub
		log.debug("******inside Logger********");
		
	}
	
}
