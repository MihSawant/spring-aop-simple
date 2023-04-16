package service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PizzaAspect {

   private static final Logger log = LoggerFactory.getLogger(PizzaAspect.class.getName());

   @Before("execution(* service.*.*(..))")
   public void welcomeMessage(JoinPoint joinPoint) {
       log.info("Welcome to Pizza Corner");
       log.info("We will soon call for your order...");
   }

}
