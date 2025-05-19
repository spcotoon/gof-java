package study.java.gof.pojo._02_structural_patterns.p06_adapter.ex02_after.ex02_1_another_case;

import lombok.Getter;
import lombok.Setter;
import study.java.gof.pojo._02_structural_patterns.p06_adapter.ex01_before.security.UserDetails;

@Getter
@Setter
public class Account implements UserDetails {
    private String name;
    private String password;
    private String email;

    // Account 가 외부 라이브러리로 받아온 클래스 등이라면 어댑터를 별도로 만들어줘야 하지만,
    // 직접 코드를 수정 할수 있는 클래스라면 별도 어댑터 클래스를 만들지 않고 직접 구현할 수도 있다.
    // 단점은 기존 코드를 변경해야 하지만
    // 장점은 어댑터를 별도로 만들지 않아도 되니 간단하다
    // 단일 책임 원칙은 벗어나지만 실용적으로 타협이 가능한 상황이라면 이렇게 할 수도 있다.

    @Override
    public String getUsername() {
        return this.name;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
