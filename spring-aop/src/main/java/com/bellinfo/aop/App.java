package com.bellinfo.aop;

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
BankServiceimpl bsi = new BankServiceimpl();
//advice
Loggerbefore ib = new Loggerbefore();
ProxyFactoryBean pfb = new ProxyFactoryBean();
pfb.setTarget(bsi);
pfb.addAdvice(ib);
BankServiceimpl proxyBankServiceimpl = (BankServiceimpl) pfb.getObject();
proxyBankServiceimpl.transfer("101034","Akhil", 50000);

    }
}
