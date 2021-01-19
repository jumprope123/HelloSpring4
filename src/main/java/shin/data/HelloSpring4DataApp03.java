package shin.data;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import shin.data.service.MemberService;
import shin.data.service.MemberService03;

public class HelloSpring4DataApp03 {
    // myBatis를 이용한 프로젝트
    // spring JDBC API를 좀 더 편하게 사용하기 위해
    // 개발된 퍼시스턴스 계층 프레임워크
    // 자바 객체와 SQL문 사이의 자동 Mapping 기능을 지원

    // 코드 생산성을 증대 : JDBC관련 코드를 60%정도 줄여줌
    // hibernate나 JPA보다 익히기 쉬움 (러닝커브가 낮음)

    //myBatis 주요 컴퍼넌트
    //sqlMapConfig.xml : 디비 접속정보등 환경설정 파일
    //SqlSessionFactoryBuilder :설정파일을 통해 myBatis 객체 생성
    //SqlSessionFactory : sqlSession 객체 생성
    //SqlSession : SQL 실행 또는 트랜젝션 관리 명령 실행
    //Mapping 파일 : SQL문과 OR Mapping 설정

    //myBatis.org

    // 회원 정보를 다루는 프로그램 : CRUD
    // App01 -> MemeberService -> MemberDAO
    //                (MemberVO)


    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring4data03.xml");

        MemberService03 msrv = (MemberService03) ctx.getBean("msrv03");
        //회원정보 생성
        System.out.println(msrv.newMember());

        // 회원정보 조회(아이디, 등급, 가입일)
        System.out.println(msrv.readMember());
        // 회원정보 상세 조회 (아이디로 검색, 모든컬럼 출력)
        System.out.println(msrv.readOneMember());
        // 회원정보 수정
        System.out.println(msrv.modifyMember());
        // 회원정보 삭제
        System.out.println(msrv.removeMember());
    }
}
