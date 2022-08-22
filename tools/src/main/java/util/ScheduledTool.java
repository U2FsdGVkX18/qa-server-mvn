package util;


import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

@Configuration
@EnableScheduling
public class ScheduledTool {

    @Scheduled(cron = "0/5 * * * * ?")
    public void configureTasks() {
        System.out.println(LocalDateTime.now());
    }

}
