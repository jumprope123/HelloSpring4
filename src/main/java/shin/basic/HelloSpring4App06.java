package shin.basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import shin.bean.HelloSpring4Bean04;
import shin.bean.HelloSpring4Bean05Factory;

import java.security.cert.X509Certificate;

public class HelloSpring4App06 {
    // 스프링프레임워크를 사용하는 첫번째 사례
    // 이전 예제에서는 factory 패턴을 이용해서
    // 객체를 생성하는 코드를 작성했었음
    // 하지만, 스프링프레임워크를 사용하면 이러한 과정은 x

    // 스프링 프레임워크
    // DI, IoC, AOP를 적용한 콘솔/GUI/웹 응용 프로그램 개발에
    // 사용하는 오픈소스 프레임워크
    // 복잡한 절차를 요구하고 비용이 많이 드는 EJB(엔터프라이즈 자바빈즈(Enterprise JavaBeans; EJB)는 기업환경의 시스템을 구현하기 위한 서버측 컴포넌트 모델이다.)에 비해
    // 사용이 간단하고, 무료 서블릿(서버에서 웹페이지 등을 동적으로 생성하거나 데이터 처리를 수행하기 위해 자바(Java)로 작성된 프로그램을 말한다.) 컨테이너에도 무난히 실행됨

    // 스프링 프레임워크를 이용한 개발의 필수요건은
    // 인터페이스 기반 설계임!

    // 라이브러리
    // spring-beans
    // spring-core
    // commons-logging

    // 실행원리
    // 예제에서 보듯 객체 생성시 new 연산자를 사용하지 않고
    // 스프링이 대신 객체를 생성하고 프로그램에서는 DI를 통해 사용함
    // 1. bean.xml에 스프링 컨테이너가 미리 생성해 둬야 할 객체와 이름을 정의해 둠
    // 2. 프로그램이 시작되면 bean06.xml에 작성한 객체정보를 스프링 컨테이너가 읽어서 객체를 만들어 둠
    // 3. beanFactory에서 getBean메서드로 해당 객체를 가져와서 HelloSpring4Bean04 타입의 변수에 주입함
    // 4. 주입된 변수를 통해 sayHello 메서드를 호출하면 인삿말이 출력됨

    //스프링 컨테이너란? (알아서 정리하기)
    //-> 객체를 생성하고, 엮어주고, 이들의 전체 생명주기를 관리하는 그릇
    // 스프링 프레임워크에서 제공하는 2가지(알아서 정리하기)
    // BeanFactory -> DI에 대한 가장 기본적인 기능을 제공하는 단순한 컨테이너
    // ApplicationContext ->빈팩토리를 확장해 프로퍼티 파일에 텍스트 메시지를 읽고 해당 이벤트 리스너에 대한
    // 애플리케이션 이벤트 발행 같은 애플리케이션 프레임워크 서비스를 제공하는 컨테이너



    public static void main(String[] args) {

        //스프링 컨테이너의 관리를 받는 객체들이 정의된 설정 파일 읽기
        BeanFactory bf = new XmlBeanFactory(
                new FileSystemResource("src/main/java/bean06.xml")
        );

        // 스프링 컨테이너를 통해 지정한 객체를 주입받음
        HelloSpring4Bean04 bean = (HelloSpring4Bean04) bf.getBean("kor");
        bean.sayHello("스프링4");

        bean = (HelloSpring4Bean04) bf.getBean("eng");
        bean.sayHello("Spring4");

        bean = (HelloSpring4Bean04) bf.getBean("jpn");
        bean.sayHello("スプリング");
    }
}
