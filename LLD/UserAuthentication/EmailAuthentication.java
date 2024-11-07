package LLD.UserAuthentication;

public class EmailAuthentication implements AuthenticationStrategy{

    @Override
    public boolean authenticate(String username, String password) {
        // Perform email and password authentication
        System.out.println("Authenticating using Email and Password.");
        // (Placeholder) Logic for verifying email and password
        return "user@example.com".equals(username) && "password123".equals(password);
    }
}
