package study.springtest.beanScope;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@RequiredArgsConstructor
@Controller
public class TestController {

    //    private final RequestScope requestScopeProvider;
    private final PrototypeScope prototypeScope;
    private final RequestScope requestScope;

    @ResponseBody
    @GetMapping("/request-scope")
    public String requestScope() {

        log.info("=============요청이 들어왔습니다!=============");

        return prototypeScope.toString();
    }
}
