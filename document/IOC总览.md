# 概览

IOC是Spring最核心的部分

## 1什么是Ioc/DI

``` 
所谓控制反转，就是把原先我们代码里面需要实现的对象创建、依赖的代码，反转给容器来帮忙实现。
对象和对象关系怎么表示？
可以用 xml ， properties 文件等语义化配置文件表示。
描述对象关系的文件存放在哪里？
可能是 classpath ， filesystem ，或者是 URL 网络资源， servletContext 等。
```

## 2Spring IOC体系结构

### 2.1 BeanFactory

### 2.2 BeanDefinition

## 3IoC容器的初始化

### 3.1 XmlBeanFactory(屌丝IOC)的整个流程

### 3.2 FileSystemXmlApplicationContext 的IOC容器流程

1. 高富帅IOC解剖

2. 设置资源加载器和资源定位

3. AbstractApplicationContext的refresh函数载入Bean定义过程：

4. AbstractApplicationContext子类的refreshBeanFactory()方法：

5. AbstractRefreshableApplicationContext子类的loadBeanDefinitions方法：

6. AbstractBeanDefinitionReader读取Bean定义资源

7. 资源加载器获取要读入的资源：

8. XmlBeanDefinitionReader加载Bean定义资源

9. DocumentLoader将Bean定义资源转换为Document对象

10. XmlBeanDefinitionReader解析载入的Bean定义资源文件

11. DefaultBeanDefinitionDocumentReader对Bean定义的Document对象解析

12. BeanDefinitionParserDelegate解析Bean定义资源文件中的<Bean>元素

13. BeanDefinitionParserDelegate解析<property>元素

14. 解析<property>元素的子元素

15. 解析<list>子元素

16. 解析过后的BeanDefinition在IoC容器中的注册

17. DefaultListableBeanFactory向IoC容器注册解析后的BeanDefinition

## 4IOC容器的依赖注入

### 4.1 依赖注入发生的时间

### 4.2 AbstractBeanFactory通过getBean向IoC容器获取被管理的Bean

### 4.3 AbstractAutowireCapableBeanFactory创建Bean实例对象

### 4.4 createBeanInstance方法创建Bean的java实例对象

### 4.5 SimpleInstantiationStrategy类使用默认的无参构造方法创建Bean实例化对象

### 4.6 populateBean方法对Bean属性的依赖注入

### 4.7 BeanDefinitionValueResolver解析属性值

### 4.8 BeanWrapperImpl对Bean属性的依赖注入

## 5IoC容器的高级特性