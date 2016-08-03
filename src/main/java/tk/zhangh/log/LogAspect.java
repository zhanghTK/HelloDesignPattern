package tk.zhangh.log;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

/**
 * 日志切面
 * Created by ZhangHao on 2016/7/12.
 */
@Aspect
public class LogAspect {
    private static Logger logger = Logger.getLogger(LogAspect.class);

    @Pointcut("execution(* tk.zhangh.pattern.behavior.chain.*.*(..))")
    private void selectAll() {}

    @Around("selectAll()")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable{
        String className = pjp.getTarget().getClass().getName();
        String methodName = pjp.getSignature().getName();
        String signature = className + "." + methodName;
        Object object = null;
        try {
            logger.info(signature + " begins with " + Arrays.asList(pjp.getArgs()));
            object = pjp.proceed();
        } catch (Throwable throwable) {
            logger.info(signature + " occurs expection : " + throwable);
            throw throwable;
        }
        logger.info(signature + " ends");
        return object;
    }
}
