package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPoinCuts {

    @Pointcut("execution(* get*())")
    public void allGetMethods(){}
}
