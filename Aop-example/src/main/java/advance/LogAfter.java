package advance;

import java.lang.reflect.Method;

import org.aopalliance.aop.Advice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class LogAfter implements AfterReturningAdvice {
	Logger log=LoggerFactory.getLogger(LogAfter.class);


	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		// TODO Auto-generated method stub
	
		Integer i=(Integer) arg0;
		log.debug("execute after completion:"+i.intValue());
	}
	
}
