package USTBatchNo3.di_constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("conapplication.xml");
    	//roles r=context.getBean("Role1",roles.class);
    	//r.display();
    	
    	roles r1=context.getBean("name",roles.class);
    	r1.display();
    }
}