# 概览

```
Spring 中最重要的就是IOC容器，Spring框架的IoC容器的全面讲解之后，将覆盖了Spring的面向方面编程（AOP）技术
Spring Framework有自己的AOP框架，它在概念上易于理解，并且成功地解决了Java企业编程中AOP要求的80％最佳点。
还提供了Spring与AspectJ集成的覆盖范围（目前最丰富的-当然也是Java企业领域中最成熟的AOP实现）
```

## 1 IOC容器

### 1.1 介绍Spring的IOC和Beans

```
IOC也叫做DI，这是一个过程，首先通过构造函数参数、工厂方法的参数或属性来设置依赖关系，然后在初始化bean的时候注入这些依赖。这个过程就是控制的反转。
在Spring中，org.springframework.bean 和 org.springframework.context 包用于实现Spring的IOC。
BeanFactory接口是实现IOC的最基本接口，ApplicationContext是BeanFactory的子接口，子接口实现了以下功能:
1. 整合AOP特性更加容易
2. 国际化的消息资源处理
3. 事件订阅
4. 特定于应用程序层的上下文，例如WebApplicationContext，用于Web应用程序。
简单说就是BeanFactory提供了IOC的基本功能定义，ApplicationContext添加了更多企业级的特性。ApplicationContext是BeanFactory的完整超集，在本章中仅针对ApplicationContext的示例。有关BeanFactory的操作请参见其专题。
Bean及其之间的依赖关系反映在容器使用的配置元数据中。
```

### 1.2 容器概览

```
org.springframework.context.ApplicationContext接口通过元数据的读取完成Beans的实例化、组装、配置等操作。
配置元数据可以通过xml、Java注解和Java代码实现。
有些注入实现类是由Spring实现，比如ClassPathXmlApplicationContext、FileSystemXmlApplicationContext。XML是传统的配置方法，当前可选择Java注解或者编码实现。
在大多数应用程序方案中，不需要显式用户代码来实例化Spring IoC容器的一个或多个实例。
下图显示了Spring如何工作的高级视图。 您的应用程序类与配置元数据相结合，以便在创建和初始化ApplicationContext之后，您拥有一个完全配置且可执行的系统或应用程序。
```
![container_image](imgs/container-magic.png)

#### 1.2.1 配置元数据

```
上一节已经知道,Spring IOC容器处理配置的元数据。这些配置元数据告诉Spring如何去初始、配置和合并Bean。
传统的配置文件使用xml进行配置，我们的文档将使用xml为基准，如果使用其他的配置方式也可以
1. 基于Java 注解: spring2.5开始支持
2. Java编码方式的配置，主要基于@Configuration, @Bean, @Import, @DependsOn annotations. 这几个注解实现

```