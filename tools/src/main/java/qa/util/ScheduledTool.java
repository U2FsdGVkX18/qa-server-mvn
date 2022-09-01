package qa.util;


import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

@Configuration
@EnableScheduling
public class ScheduledTool {

    //    @Async
    @Scheduled(cron = "0/5 * * * * ?")
    public void configureTasks() {
        System.out.println(LocalDateTime.now() + "-5s_task1-" + Thread.currentThread().getId());
        try {
            System.out.println("休眠...");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    //    @Async
    @Scheduled(cron = "0/5 * * * * ?")
    public void configureTasks1() {
        System.out.println(LocalDateTime.now() + "-5s_task2-" + Thread.currentThread().getId());
    }
    
}
