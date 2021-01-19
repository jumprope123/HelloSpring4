package shin.basic;

import shin.bean.*;

public class HelloSpring4App05 {
    //다섯번째 사례
    // factory 패턴을 이용해서 객체생성을 캡슐화함
    // 한편, 매개변수를 이용해서 생성할 객체를 취사선택함

    // 객체생성을 팩토리 패턴으로 구현해야 함
    // 따라서, 개발자가 신경써야 할 부분이 은연히 추가됨
    // 즉, 비즈니스 로직 코드 작성하는 것도 버거운데
    // 객체 생성관련 클래스로 따로 작성하는 것은 더욱 힘듦

    // 해결 : 객체생성부분은 외부의 힘을 빌림
    // IoC 컨테이너가 객체를 생성하고 그것을 주입 inject 받음

    public static void main(String[] args) {
        HelloSpring4Bean05Factory.create("kor")
        .sayHello("스프링4");

        HelloSpring4Bean05Factory.create("eng")
        .sayHello("Spring4");

        HelloSpring4Bean05Factory.create("jpn")
        .sayHello("スプリング");
    }
}
