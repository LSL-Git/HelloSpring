# Hello Spring

**SSM 框架学习 (Spring篇)**

一、第一个Spring项目   

*这里就不解释Spring是什么了，简单的说：Spring就是Java的一个轻量级的框架。下面开始正题：*   

**第一步：新建Web Project导入必要的jar包，目前只需导入（spring-core-4.1.6.RELEASE.jar、spring-beans-4.1.6.RELEASE.jar、spring-context-4.1.6.RELEASE.jar、spring-expression-4.1.6.RELEASE.jar）也是必须。**

**第二步：新建类HelloSpring.class**

```
	public class HelloSpring {
	
		private String who = null;
		
		public void print() {
			System.out.println("Hello," + this.getWho() + "!");
		}

		/**
		 * 获取who
		 * @return
		 */
		public String getWho() {
			return who;
		}

		/**
		 * 设置who
		 * @param who
		 */
		public void setWho(String who) {
			this.who = who;
		}
	}
```

**第三步：新建Source Folder资源文件夹’resources‘文件夹命名不固定，再在该文件夹下新建Spring的配置文件applicationContext.xml**
```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
	http://www.springframework.org/schema/beans/spring-beans-3.2.xsd">
	
	<!-- 通过bean元素声明需要Spring创建的实例。该实例的类型通过class属性指定，并通过id属性为该实例指定一个名称，以便在程序中使用 -->
	<!-- 这里class指定上文的HelloSpring类，注意有包名-->
	<bean id="helloSpring" class="HelloSpring">
	
		<!-- property元素用来为实例的属性赋值,此处实际是调用setWho()方法实现赋值操作 -->
		<property name="who">
		
			<!-- 此处将字符串"Spring"赋值给who属性 -->
			<value>Spring</value>
		</property>
	</bean>
</beans>
```
到这里主要代码其实已经完成，接下来就是看看怎么调用了。

**新建一个测试类，我这用的是JUnit 4，怎么建测试类，这里就不详说了，直接上代码了。**
```
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import HelloSpring;

public class HelloSpringTest {

	@Test
	public void HelloSpring() {
		// 通过ClassPathXmlApplicationContext实例化Spring上下文
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 通过ApplicationContext的getBean()方法,根据id来获取bean的实例，这里helloSpring对应配置文件中bean的id
		HelloSpring helloSpring = (HelloSpring) context.getBean("helloSpring");
		// 执行print()方法
		helloSpring.print();
		//打印结果：Hello,Spring!
	}
}
```



@Author 瞌睡虫   
@mybatis-3.2.2   
@Database: mysql 5.7.15   
@Tool: MyEclipse
