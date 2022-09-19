package study.springtest.beanLifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ExternalAPI {

//    @PostConstruct
//    void postConstruct() {
//        log.info("초기화 콜백!!!");
//    }

    void execute() {
        log.info("메인 실행 로직!!!");
    }

//    @PreDestroy
//    void preDestroy() {
//        log.info("소멸전 콜백!!!");
//    }

}
