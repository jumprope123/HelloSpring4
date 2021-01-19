package shin.emp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("shin.emp")
public class EmpDiConfig {
    @Bean
    public EmployeeV3DAO empv3dao() {
        return new EmployeeV3DAOImpl();
    }
}
