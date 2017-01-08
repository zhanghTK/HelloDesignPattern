# 日志模块

对 `tk.zhangh.pattern` 包下所有方法调用进行日志记录，包括调用方法，调用参数，执行结果，异常情况。

日志方案使用 slf4j + logback 方案，AOP 使用 Spring 提供的相关支持，测试使用 Junit。

Maven 依赖关系：

![日志模块Maven依赖](https://ooo.0o0.ooo/2017/01/08/587226bf67f2a.png)

## 日志切面

日志切面输出日志级别：INFO

切面定义如下：

```java
@Aspect
public class LogAspect {
    private static Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("execution(public * tk.zhangh.pattern..*.*(..))")
    private void selectAll() {}

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
```

## 日志配置

日志配置说明（参见 `logback.xml` 和 `logback-test.xml` ）：

Appender配置：

- STDOUT
- FILE
  - 日志位置：`${project}/log/log-repertory/HelloDesignPattern.log`
  - 日志滚动策略：`TimeBasedRollingPolicy`
  - 日志保存最大数量：356
  - 日志文件最大值：100MB

测试

- 使用日志级别：INFO
- 指定Spring日志级别为：ERROR

正式

- 使用日志级别：WARN

## 测试用例说明

测试用例说明：

创建 `tk.zhangh.pattern.BusinessService`类

符合切面中定义的切点表达式 `@Pointcut("execution(* tk.zhangh.pattern..*.*(..))")`

在测试用例中调用 `BusinessService` 类的方法检查日志是否正常记录

## 第三方使用

1. 在第三方pom中引入依赖

   ```xml
   <dependency>
     <groupId>tk.zhangh.pattern</groupId>
     <artifactId>log</artifactId>
     <version>1.0-SNAPSHOT</version>
   </dependency>
   ```

2. 添加log切面配置

   ```java
   @RunWith(SpringJUnit4ClassRunner.class)
   @ContextConfiguration(classes = {LogAopConf.class})
   public class Test {
   	// ...
   }
   ```

   ​