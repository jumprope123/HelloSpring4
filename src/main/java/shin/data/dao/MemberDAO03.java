package shin.data.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import shin.data.vo.MemberVO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository("mdao03")
public class MemberDAO03 {

    @Autowired
    private SqlSession sqlSession;
    // mybatis를 사용하기 위해
    // sqlSession 객체를 MemberDAO03에 DI함

    public int insertMember(MemberVO mvo) {
      return sqlSession.insert("member.insertMember", mvo);
    }

    public int updateMember(MemberVO mvo) {
        return sqlSession.update("member.updateMember",mvo);
    }

    public int deleteMemeber(String name) {
       return sqlSession.delete("member.deleteMember",name);
    }


    public List<MemberVO> selectMember() {
        return sqlSession.selectList("member.selectList");
    }

    public MemberVO selectOneMember(String userid) {
        return sqlSession.selectOne("member.selectOne" ,userid);
    }

}
