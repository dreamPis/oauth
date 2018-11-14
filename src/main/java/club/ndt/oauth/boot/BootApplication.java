package club.ndt.oauth.boot;

import club.ndt.oauth.boot.support.BootSecurityProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("club.ndt.oauth.boot.mapper")
public class BootApplication {




    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }

}
