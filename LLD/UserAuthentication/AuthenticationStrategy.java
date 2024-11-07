package LLD.UserAuthentication;

public interface AuthenticationStrategy {
    boolean authenticate(String userId, String credential);
}
