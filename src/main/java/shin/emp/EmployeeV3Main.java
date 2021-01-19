package shin.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class EmployeeV3Main {
    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("employee.xml");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(EmpDiConfig.class);
        ctx.refresh();

        EmployeeV3Service empv3sv = (EmployeeV3ServiceImpl) ctx.getBean("empv3sv");


        while (true) {
            Scanner scan = new Scanner(System.in);
            empv3sv.showMenu();
            String input = scan.nextLine();
            switch (input){
                case "1" : empv3sv.newEmployee();break;
                case "2" : empv3sv.readEmployee();break;
                case "3" : empv3sv.readOneEmployee();break;
                case "4" : empv3sv.modifyEmployee();break;
                case "5" : empv3sv.deleteEmployee();break;
                case "0" : System.exit(0);
                default:
                    System.out.println("잘못 입력하셨습니다");
            }

        }
    }
}
