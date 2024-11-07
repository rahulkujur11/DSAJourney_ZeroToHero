package LLD.UserAuthentication;

public class AuthenticationContext {
    private AuthenticationStrategy strategy;

    // Set the chosen authentication strategy at runtime
    public void setStrategy(AuthenticationStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean authenticateUser(String username, String credential) {
        if (strategy == null) {
            throw new IllegalStateException("Authentication strategy is not set.");
        }
        return strategy.authenticate(username, credential);
    }
}
