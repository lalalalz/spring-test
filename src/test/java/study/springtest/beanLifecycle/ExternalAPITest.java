package study.springtest.beanLifecycle;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.springtest.Config;
import study.springtest.beanScope.RequestScope;

@Slf4j
class ExternalAPITest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);

    @Test
    void 빈_스코프_웹요청_테스트() {
        RequestScope requestScope = (RequestScope) ac.getBean("requestScope");

        log.info("{}", requestScope);
    }

    @Test
    void 생명주기_콜백_테스트() {

        ExternalAPI externalAPI = (ExternalAPI) ac.getBean("externalAPI");

        externalAPI.execute();

        log.info("스프링 컨테이너 닫아줘!");

        ac.close();

        log.info("스프링 컨테이너 닫았어!");

    }

    @Test
    void 생명주기_콜백_테스트_데코레이터_적용() {

        Decorator decorator = (Decorator) ac.getBean("decorator");

        decorator.execute();

        log.info("스프링 컨테이너 닫아줘!");

        ac.close();

        log.info("스프링 컨테이너 닫았어!");
    }

}