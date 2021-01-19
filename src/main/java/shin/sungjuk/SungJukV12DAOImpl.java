package shin.sungjuk;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
@Qualifier("sjdao12")
public class SungJukV12DAOImpl implements SungJukV12DAO {

    @Autowired
    private SqlSession sqlSession;

    // 넘겨받은 성적데이터를 sungjuk테이블에 저장
    public  String insertSungJuk(SungJukVO sj) {
        String result = "성적입력 실패";
     if (sqlSession.insert("sungjuk.insertSungJuk",sj)>0)
         result = "성적 입력 성공";
     return result;
    }

    // 번호,이름,국어,영어,수학,등록일을 조회하고
    // 그 결과들을 ArrayList에 담아서 넘김
    public List<SungJukVO> selectSungJuk() {
      return  sqlSession.selectList("sungjuk.selectSungJuk");
    }

    // 성적번호로 성적데이터를 조회하고
    // 그 결과를 SungJukVO에 담아서 넘김
    public  SungJukVO selectOneSungJuk(String sjno) {
      return sqlSession.selectOne("sungjuk.selectOneSungJuk",sjno);
    }

    // 수정할 성적데이터를 매개변수로 넘겨주면
    // sungjuk테이블에서 해당 데이터를 수정함
    public  String updateSungJuk(SungJukVO sj) {
        String result = "성적 입력 실패";
        if (sqlSession.update("sungjuk.updateSungJuk",sj)>0){
            result = "성적 입력 성공";
        }
        return result;
    }

    // 삭제할 성적번호를 매개변수로 넘겨주면
    // sungjuk테이블에서 해당 데이터를 삭제함
    public  String deleteSungJuk(int sjno) {
        String result = "성적 삭제 실패!";
        if (sqlSession.delete("sungjuk.deleteSungJuk",sjno) > 0){
            result = "성적 삭제 성공!";
        }
        return result;
    }
}
