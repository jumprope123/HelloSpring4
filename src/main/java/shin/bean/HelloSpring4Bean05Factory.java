package shin.bean;

public class HelloSpring4Bean05Factory {

    // 인삿말을 출력하는 객체를 생성하는 create 메서드 정의
    // type이라는 매개변수를 통해 출력할 인삿말의 유형을 선택함
    public static HelloSpring4Bean04 create(String type) {
        HelloSpring4Bean04 bean = null;

        if (type.equalsIgnoreCase("kor"))
            bean = new HelloSpring4Bean04Kor();
        else if (type.equalsIgnoreCase("eng"))
            bean = new HelloSpring4Bean04Eng();
        else if (type.equalsIgnoreCase("jpn"))
            bean = new HelloSpring4Bean04Jpn();

        return bean;
    }
}
