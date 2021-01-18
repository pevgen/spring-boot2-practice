package ml.pevgen.springboot2practice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@Slf4j
@SpringBootApplication
public class SpringBoot2PracticeApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot2PracticeApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) {
        boolean debug = args.containsOption("mydebug");
        List<String> files = args.getNonOptionArgs();
        log.info("mydebug: [{}]", debug);
        log.info("files: [{}]", files);
    }
}
