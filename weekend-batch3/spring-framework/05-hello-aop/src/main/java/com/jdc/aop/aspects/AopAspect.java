package com.jdc.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.jdc.aop.beans.MasterData;

@Component
@Aspect
public class AopAspect {
	
	@Before(value = "execution(void doBusinessForBefore(..)) and args(str, count)", argNames = "str, count")
	public void doBefore(JoinPoint joinPoint, String str, int count) {
		System.out.println("Before Aspect");
		
		System.out.println("Long String: " + joinPoint.toLongString());
		System.out.println("Short String: " + joinPoint.toShortString());
		System.out.println("To String: " + joinPoint.toString());
		
		System.out.println("Target: " + joinPoint.getTarget());
		System.out.println("Proxy: " + joinPoint.getThis());
		
		System.out.println("Kind: " + joinPoint.getKind());
		System.out.println("Name: " + joinPoint.getSignature().getName());
		System.out.println("String Arg: " + str);
		System.out.println("Int Arg: " + count);
		
	}
	
	@After("execution(void doBusinessForAfter())")
	public void doAfter() {
		System.out.println("After Aspect");
	}
	
	@AfterReturning(
		value = "execution(* doBusinessForAfterReturning(..)) and args(data)", 
		returning = "masterData",
		argNames = "masterData, data")
	public void afterReturning(MasterData masterData, String data) {
		System.out.println("After Returning Aspect");
		System.out.println("String Arg: " + data);
		System.out.println("MasterData Arg: " + masterData);
	}
	
	@AfterThrowing(
		value = "execution(void doBusinessForAfterThrowing())",
		throwing = "ex")
	public void afterThrowing(IllegalArgumentException ex) {
		System.out.println("After Throwing Aspect");
		System.out.println(ex.getMessage());
	}
	
	@Around("execution(void doBusinessForAround())")
	public Object around(ProceedingJoinPoint joinPoint) {
		Object obj;
		try {
			// before
			System.out.println("Before in around");
			
			obj = joinPoint.proceed();
			
			// after
			System.out.println("After in around");
		} catch (Throwable e) {
			// after throwing
			System.out.println("After Throwing in around");
			throw new RuntimeException(e);
		} finally {
			// after returning
			System.out.println("After Returning in around");
		}

		return obj;
	}

}







