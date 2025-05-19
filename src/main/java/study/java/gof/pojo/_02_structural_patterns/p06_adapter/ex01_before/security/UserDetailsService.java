package study.java.gof.pojo._02_structural_patterns.p06_adapter.ex01_before.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
