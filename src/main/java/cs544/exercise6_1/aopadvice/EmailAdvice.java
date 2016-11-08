package cs544.exercise6_1.aopadvice;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import cs544.exercise6_1.EmailSender;

@Aspect
public class EmailAdvice {
	@AfterReturning(pointcut = "execution(* cs544.exercise6_1.EmailSender.sendEmail(..))", returning = "retValue")
	public void tracemethod(JoinPoint join, String retValue){
		System.out.println(new Date() + "Method= SendEmail");
		System.out.println("message=" + retValue);
		EmailSender sender = (EmailSender)join.getTarget();
		System.out.println("Outgoing mail service= "+sender.getOutgoingMailServer());
	}

}
