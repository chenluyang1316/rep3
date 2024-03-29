package page;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "page.mapper")
public class PageApp {
    public static void main(String[] args) {
        SpringApplication.run(PageApp.class);
    }
}
