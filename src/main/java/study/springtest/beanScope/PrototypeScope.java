package study.springtest.beanScope;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class PrototypeScope {

    private int count = 0;

    @PostConstruct
    void postConstruct() {
        log.info("프로토 타입 빈이 생성되었습니다. {}", this.toString());
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @PreDestroy
    void preDestroy() {
        log.info("프로토 타입 빈이 제거되었습니다. {}", this.toString());
    }
}
