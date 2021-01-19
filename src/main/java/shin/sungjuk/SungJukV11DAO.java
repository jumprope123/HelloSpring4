package shin.sungjuk;

import java.util.ArrayList;
import java.util.List;

public interface SungJukV11DAO {

    String insertSungJuk(SungJukVO sj) ;

    List<SungJukVO> selectSungJuk();

    SungJukVO selectOneSungJuk(String sjno);

    String updateSungJuk(SungJukVO sj);

    String deleteSungJuk(int sjno);

}
