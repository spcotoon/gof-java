package study.java.gof.pojo._02_structural_patterns.p06_adapter.ex01_before.security;

public class LoginHandler {
    UserDetailsService userDetailsService;

    public LoginHandler(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    public String login(String username, String password) {
        UserDetails userDetails = userDetailsService.loadUser(username);
        if (userDetails.getPassword().equals(password)) {
            return userDetails.getUsername();
        } else {
            throw new IllegalArgumentException("비번 틀림");
        }
    }
}
