package me.asher.objects;

import lombok.extern.slf4j.Slf4j;
import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;

@Slf4j
@Controller
@EnableJpaAuditing
@SpringBootApplication
public class ObjectsApplication {

    private static final String SWAGGER_URI = "<a href=\"swagger-ui.html\">OAS 3.0</a></br>";

    public static void main(String[] args) {
        SpringApplication.run(ObjectsApplication.class, args);
    }

    /**
     * Start internal H2 server so we can query the DB from IDE
     *
     * @return H2 Server instance
     * @throws SQLException SQLException
     */
    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server h2Server() throws SQLException {
        return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9092");
    }

    @GetMapping("/")
    @ResponseBody
    public String home() {
        log.debug("home call");
        return SWAGGER_URI;
    }
}
