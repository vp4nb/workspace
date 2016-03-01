package com.bellinfo.aop;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;

public class Loggerbefore implements MethodBeforeAdvice {
	
Logger log = LoggerFactory.getLogger(Loggerbefore.class);

public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
	// TODO Auto-generated method stub
	log.debug("****I'm inside Loggerbefore*****");
}
}