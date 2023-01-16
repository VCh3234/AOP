package vlad.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(-1)
public class ExceptionHandlerAspect {
    @Before("vlad.aspects.Pointcats.allGetMethods()")
    private void allGetMethodsExceptionHandlerAdvice() {
        System.out.println("--allMethodsExceptionHandlerAdvice");
    }
}
