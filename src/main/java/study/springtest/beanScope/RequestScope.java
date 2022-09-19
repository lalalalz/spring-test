package study.springtest.beanScope;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class RequestScope {


    @PostConstruct
    private void postConstruct() {
        log.info("리퀘스트 스코프 빈 생성되써욤 >_<, {}", this.toString());
    }


    @PreDestroy
    private void preDestroy() {
        log.info("리퀘스트 스코프 빈 소멸될거에용!, {}", this.toString());
    }
}
