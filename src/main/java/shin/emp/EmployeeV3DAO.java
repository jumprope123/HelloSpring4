package shin.emp;


import java.util.ArrayList;

public interface EmployeeV3DAO {

     String insertEmp(EmployeeVO empvo);

     ArrayList<EmployeeVO> readEMP() ;

     EmployeeVO readOneEMP(int inputid) ;

     String deleteSQL(int empid);

     String modifySQL(EmployeeVO ev);

}
