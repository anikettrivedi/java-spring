package com.example.springcore;

import com.example.springcore.methodinjection.CommandManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/*
    - this example illustrates method injection
    - this example also illustrates prototype beans
    - if you dependency-inject a prototype-scoped bean into a singleton-scoped bean, a new prototype bean is instantiated and then dependency-injected into the singleton bean. The prototype instance is the sole instance that is ever supplied to the singleton-scoped bean.
    - suppose you want the singleton-scoped bean to acquire a new instance of the prototype-scoped bean repeatedly at runtime. You cannot dependency-inject a prototype-scoped bean into your singleton bean, because that injection occurs only once, when the Spring container instantiates the singleton bean and resolves and injects its dependencies. If you need a new instance of a prototype bean at runtime more than once, see Method Injection.

    - https://docs.spring.io/spring-framework/docs/5.2.25.RELEASE/spring-framework-reference/core.html#beans-factory-method-injection
    - https://docs.spring.io/spring-framework/docs/5.2.25.RELEASE/spring-framework-reference/core.html#beans-factory-scopes-sing-prot-interaction
*/
public class SpringCoreXmlMethodInjectionApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "methodinjection.xml"
        );

        System.out.printf("%n%n------ starting SpringCoreXmlMethodInjectionApplication ------%n%n");

        System.out.printf("%n%n------ method injection demo using XML bean definitions ------%n%n");

        // command manager is singleton but each command it creates is prototype
        CommandManager commandManager = context.getBean("commandManager", CommandManager.class);

        System.out.printf("%-30s%s%s%n", "command", " = ", commandManager.createCommand());
        System.out.printf("%-30s%s%s%n", "command", " = ", commandManager.createCommand());
        System.out.printf("%-30s%s%s%n", "command", " = ", commandManager.createCommand());

        System.out.printf("%n%n------ bean definition names ------%n%n");
        Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.printf("%n%n------ bean details ------%n%n");
        Arrays.asList(context.getBeanDefinitionNames()).forEach(
            beanName -> {
                System.out.printf("%-30s%s%s%n", "beanName", " = ", beanName);
                System.out.printf("%-30s%s%s%n", "beanType", " = ", context.getType(beanName));
                System.out.printf("%-30s%s%s%n", "aliases", " = ", Arrays.stream(context.getAliases(beanName)).toList());
                System.out.printf("%-30s%s%s%n", "isSingleton", " = ", context.isSingleton(beanName));
                System.out.printf("%n");
            }
        );

    }

}
