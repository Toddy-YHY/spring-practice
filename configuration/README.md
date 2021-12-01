# 从指定路径加载配置文件
1. 配置文件地址：`E:\application.properties`
2. 配置文件内容:
    ```properties
    my.foo=bar
    ```
3. 实现`EnvironmentPostProcessor`并创建`FileSystemResource`读取指定路径下的配置文件
4. 在`spring.factories`中指定
```text
org.springframework.boot.env.EnvironmentPostProcessor=com.yhy.spring.practice.configuration.config.MyEnvironmentPostProcessor
```