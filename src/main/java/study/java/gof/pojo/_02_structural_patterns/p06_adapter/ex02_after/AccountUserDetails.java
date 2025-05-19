package study.java.gof.pojo._02_structural_patterns.p06_adapter.ex02_after;

import study.java.gof.pojo._02_structural_patterns.p06_adapter.ex01_before.Account;
import study.java.gof.pojo._02_structural_patterns.p06_adapter.ex01_before.security.UserDetails;

public class AccountUserDetails implements UserDetails {

    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return this.account.getName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
