package br.com.danepic.cleanarch.gateways.entrypoints.jobs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CustomerJob {

    @Scheduled(fixedDelay = 10000L)
    public void someExecute() {
        log.info("Job Status: RUNNING");
    }
}
