package aop05;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect{
	/*
	* 매개변수로 JoinPoint은 조건에 만족하는 pointcut의 정보를 불러 올 수 있다*/
	@Before("execution(public void aop05.*.*())")
	public void login(JoinPoint joinPoint) {
		System.out.println("AOP 가 적용된 조인포인트에 대한 정보를 추출해 보장~~");
		System.out.println(joinPoint);
		System.out.println(joinPoint.getSignature());
		System.out.println(joinPoint.getTarget());
		System.out.println(joinPoint.getTarget().getClass().getName());
		System.out.println(joinPoint.toLongString());
		System.out.println(joinPoint.toShortString());
		System.out.println(joinPoint.getThis());
		System.out.println(joinPoint.getThis().getClass().getName());
		System.out.println("-------------------------------------------");
		System.out.println("로그인 처리");
	}
	
	@After("execution(public void aop05.*.*())")
	public void logout(JoinPoint joinPoint) {
		System.out.println("로그아웃");
	}
}







