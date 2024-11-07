package LLD.UserAuthentication;

public class SocialMediaAuthentication implements AuthenticationStrategy {

    @Override
    public boolean authenticate(String username, String token) {
        // Perform authentication via social media token (e.g., Google/Facebook)
        System.out.println("Authenticating using Social Media Token.");
        // (Placeholder) Logic for verifying token with social media provider
        return "validSocialMediaToken".equals(token);
    }

}
