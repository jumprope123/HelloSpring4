package shin.bean.anno;

import org.springframework.stereotype.Component;
import shin.bean.HelloSpring4Bean04;

@Component("eng")
public class HelloSpring4Bean04Eng implements HelloSpring4Bean04 {
    @Override
    public void sayHello(String msg) {
        System.out.println("Hello, "+msg);
    }
}
