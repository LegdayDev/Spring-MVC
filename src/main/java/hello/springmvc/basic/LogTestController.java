package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogTestController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";

        System.out.println("name = " + name); // println로 로그를 남기면 서버과부하가 일어난다.

        // trace, debug는 개발서버에서 적용하는게 좋다
        log.trace(" trace log={}",name);
        log.debug(" debug log={}", name);
        // info level 로 설정하면 info, warn, error 로그만 남는(운영서버에서만 적용)
        log.info(" info log={}", name);
        log.warn(" warn log={}", name);
        log.error(" error log={}", name);


        return "ok";
    }
}
