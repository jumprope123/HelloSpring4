package shin.basic;

import shin.bean.HelloSpring4Bean03;

public class HelloSpring4App03 {
    // 세번째 사례
    // 인삿말을 한국어, 영어, 일본어로 출력하도록 기능 개선
    // 해당 기능을 제각각의 이름으로 호출하는 경우
    // 지나치게 복잡해지고 기능에 따라 이름을 일일히 외워야 하는 불편함이 존재함

    // 인터페이스를 도입해서 기능을 개선해 봄

    public static void main(String[] args) {
        HelloSpring4Bean03 bean = new HelloSpring4Bean03();
        bean.sayHelloKor("스프링4");
        bean.sayHelloEng("Spring4");
        bean.sayHelloJpn("スプリング４");
    }
}
