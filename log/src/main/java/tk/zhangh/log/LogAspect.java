package tk.zhangh.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * 日志切面
 * Created by ZhangHao on 17/1/3.
 */
@Aspect
public class LogAspect {
    private static Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("execution(public * tk.zhangh.pattern..*.*(..))")
    private void selectAll() {
    }

    @Around("selectAll()")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        String clazzName = pjp.getTarget().getClass().getName();
        String methodName = pjp.getSignature().getName();
        String signature = clazzName + "." + methodName;
        Object result;
        try {
            logger.info("{} begins with {}", signature, Arrays.asList(pjp.getArgs()));
            result = pjp.proceed();
        } catch (Throwable throwable) {
            logger.info("{} occurs exception : {}", signature, throwable);
            throw throwable;
        }
        logger.info("{} ends,result is {}", signature, result);
        return result;
    }
}
