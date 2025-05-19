package study.java.gof.pojo._02_structural_patterns.p06_adapter.ex02_after.ex02_1_another_case;

import study.java.gof.pojo._02_structural_patterns.p06_adapter.ex01_before.security.UserDetails;
import study.java.gof.pojo._02_structural_patterns.p06_adapter.ex01_before.security.UserDetailsService;

public class AccountService implements UserDetailsService {
    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }

    @Override
    public UserDetails loadUser(String username) {
        return findAccountByUsername(username);
    }
}
