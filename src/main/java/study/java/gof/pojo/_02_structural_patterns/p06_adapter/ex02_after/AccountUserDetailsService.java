package study.java.gof.pojo._02_structural_patterns.p06_adapter.ex02_after;

import study.java.gof.pojo._02_structural_patterns.p06_adapter.ex01_before.Account;
import study.java.gof.pojo._02_structural_patterns.p06_adapter.ex01_before.AccountService;
import study.java.gof.pojo._02_structural_patterns.p06_adapter.ex01_before.security.UserDetails;
import study.java.gof.pojo._02_structural_patterns.p06_adapter.ex01_before.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {
    /**
     * 어탭터 목적의 AccountUserDetailsService 를 만들어
     * 타겟 인터페이스인 UserDetailsService 를 구현하고,
     * 어댑티에 해당하는 AccountService 를 이곳에서 사용
     */

    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        //accountService 는 UserDetails 를 모르기 때문에 Account 를 반환
        Account account = accountService.findAccountByUsername(username);

        //따라서 Account 를 UserDetails 로 바꿔주기 위해 AccountUserDetailsService 클래스를 만들어 활용. AccountUserDetailsService 또한 어댑터 역할

        return new AccountUserDetails(account);
    }
}
