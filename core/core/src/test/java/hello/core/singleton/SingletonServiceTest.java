package hello.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class SingletonServiceTest {

    @Test
    @DisplayName("싱글톤 패턴을 적용한 객체를 사용")
    public void singletonServiceTest(){
        SingletonService singletonService1 = SingletonService.getInstance();
        SingletonService singletonService2 = SingletonService.getInstance();

        System.out.println(singletonService1);
        System.out.println(singletonService2);

        Assertions.assertThat(singletonService1).isSameAs(singletonService2);
        singletonService1.logic();

    }

}
