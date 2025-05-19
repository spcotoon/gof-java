package study.java.gof.pojo._02_structural_patterns.p06_adapter.ex02_after;

import study.java.gof.pojo._02_structural_patterns.p06_adapter.ex01_before.AccountService;
import study.java.gof.pojo._02_structural_patterns.p06_adapter.ex01_before.security.LoginHandler;
import study.java.gof.pojo._02_structural_patterns.p06_adapter.ex01_before.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);

        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("ryu", "ryu");
        System.out.println(login);
    }
}
