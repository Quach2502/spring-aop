package quach;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExampleAspect {
	@AfterThrowing(pointcut = "execution(* quach.Application.*(..))", throwing = "e")
	public void logException(Exception e) throws Throwable {
		System.out.println("****TestingLogException() " + e);
		System.out.println("Done");

	}
}
