package hello.springmvc.basic;

import lombok.Data;

/**
 * lombok 이 제공하는 @Data 어노테이션
 * 자동으로 getter,setter,toString,EqualAndHashCode, RequiredArgsConstructor 를 적용
 */
@Data //
public class HelloData {
    private String username;
    private int age;
}
