import com.zhr.springhello.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    /**
     * ioc在创建实例化对象的时候，使用的是工厂模式：class.forname().newinstance来创建对象，
     * 因此该类必须要有无参构造。
     * 结论：
     * 根据类型来获取bean的时候，在满足唯一bean的前提下，
     * 其实只看：对象 instanceof指定类型，的返货结果
     * 只要返回true就可以认定为和类型匹配，能获取到。
     * 即通过bean的类型，bean所继承的类的类型，bean所实现的接口的类型都可以获取到bean。
     * */

    public static void main(String[] args) {
        // 获取ioc容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Ioc中的bean对象
        /**
         * 获取bean的三种方式
         * */
        // 1.根据bean id获取
//        Student student = (Student) ioc.getBean("student");
//        System.out.println(student);
        // 2. 根据类名来获取 (要求ioc容器中有且只有一个类型匹配的bean)
        // 若没有任何一个类型匹配的bean，会抛出异常
//        Student bean = ioc.getBean(Student.class);
//        System.out.println(bean);
        // 3.根据bean的id和类型获取
//        Student student = ioc.getBean("student", Student.class);
//        System.out.println(student);
        //
        Student student = ioc.getBean("studentone", Student.class);
        System.out.println(student);
    }

}
