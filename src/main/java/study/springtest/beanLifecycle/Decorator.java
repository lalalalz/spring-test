package study.springtest.beanLifecycle;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Component
@RequiredArgsConstructor
public class Decorator {

    private final ExternalAPI externalAPI;

    @PostConstruct
    private void postConstruct() {
        log.info("소켓 연결하기!!!!!");
    }

    public void execute() {
        externalAPI.execute();
    }

    @PreDestroy
    private void preDestroy() {
        log.info("소켓 제거하기!!!!!");
    }
}
