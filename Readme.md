SpringBoot:

@SpringBootApplication: To run the container of the spring boot.

ApplicationContext: is the interface that provides the configuration for the application. It is used to get the bean from the application context. The getBean method is used to get the bean from the application context. The getBean method takes the class type as an argument and returns the bean of that type. In this case, we are getting the bean of type Demo.

getbean: is used to get the bean from the application context

@Conponent: is a Spring annotation is used to indicate that a class is a Spring component. It is a generic stereotype for any Spring-managed component.

@Primary: If multiple components are present error is thrown
in this case the primary is used to provide first preferance to
the underlying component.

@Autowired: Autowired annotation is used to automatically inject the dependent beans into a class. It can be used on constructors, methods, and fields.
Simple: used for setter function for field injection and method injection

@Qualifier: it specifies which bean should be selected when there are multiple candidates present. Primary kep should be present otherwise an error is thrown!
