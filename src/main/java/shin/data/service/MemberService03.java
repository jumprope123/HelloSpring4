package shin.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shin.data.dao.MemberDAO03;
import shin.data.vo.MemberVO;

import java.util.List;

@Service("msrv03")
public class MemberService03 {

    @Autowired
    private MemberDAO03 mdao03;

    //회원 정보 생성
    public String newMember(){
        String result = "회원 정보 생성 실패!";

        MemberVO mvo = new MemberVO();
        mvo.setUser("spring4");
        mvo.setPasswd("123456");
        mvo.setName("홍길동");
        mvo.setGrade("Gold");
        mvo.setPoints("1000");
        mvo.setRegdate("2021-01-18 10:55:00");

        if (mdao03.insertMember(mvo) > 0) {
            result = "회원정보 생성 성공!";
        }
        return  result;
    }

    // 회원 정보 수정 (이름 등급 포인트)
    public String modifyMember() {
        String result = "회원정보 수정 실패!";

        // 개인별 정보이므로 스프링에 맡기면 안됨
        MemberVO mvo = new MemberVO();
        mvo.setUser("spring4");
        mvo.setName("일지매");
        mvo.setGrade("Bronze");
        mvo.setPoints("0");

        if (mdao03.updateMember(mvo)>0){
            result = "회원 정보 수정 성공 !";
        }

        return result;
    }

    //회원 정보 삭제 (일지매로 검색해서)
    public String removeMember() {
        String result = "회원 정보 삭제 실패!";

        MemberVO mvo = new MemberVO();
        mvo.setName("일지매");
        String name="일지매";

        if (mdao03.deleteMemeber(name)>0){
            result = "회원 정보 삭제 성공!";
        }
        return result;
    }

    //회원정보 조회(아이디,등급,가입일)
    public String readMember() {
        StringBuilder sb = new StringBuilder();
        String fmt = "%10s %10s %10s\n";

        List<MemberVO> mvos = mdao03.selectMember();
        for (MemberVO m : mvos){
            sb.append(String.format(fmt, m.getUser(),m.getGrade(),m.getRegdate()));
        }

        return sb.toString();
    }

    //회원정보 상세조회(아이디로 검색)
    public String readOneMember() {
        String result = "";
        String fmt = "%10s %10s %10s %10s %10s";

        MemberVO mvo = mdao03.selectOneMember("abc123");
        result = String.format(fmt, mvo.getUser(),mvo.getName(),mvo.getGrade(),mvo.getPoints(),mvo.getRegdate());
        return result;
    }
}
