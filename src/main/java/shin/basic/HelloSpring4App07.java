package shin.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import shin.bean.HelloSpring4Bean04;

public class HelloSpring4App07 {
    // 스프링프레임워크를 사용하는 두번째 사례

    // 라이브러리
    // spring-beans
    // spring-core
    // spring-context
    // spring-expression
    // commons-logging

    // BeanFactory에서 제공하는 기능 두가지중 하나인
    // ApplicationContext 사용


    public static void main(String[] args) {

        //스프링 컨테이너의 관리를 받는 객체들이 정의된 설정 파일 읽기
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean06.xml");
        ApplicationContext ctx = new FileSystemXmlApplicationContext("/src/main/java/bean06.xml");

        // 스프링 컨테이너를 통해 지정한 객체를 주입받음
        HelloSpring4Bean04 bean = (HelloSpring4Bean04) ctx.getBean("kor");
        bean.sayHello("스프링4");

        bean = (HelloSpring4Bean04) ctx.getBean("eng");
        bean.sayHello("Spring4");

        bean = (HelloSpring4Bean04) ctx.getBean("jpn");
        bean.sayHello("スプリング");
    }
}
