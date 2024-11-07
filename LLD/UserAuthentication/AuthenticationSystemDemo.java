package LLD.UserAuthentication;

public class AuthenticationSystemDemo {
    public static void main(String[] args) {
        AuthenticationContext authContext = new AuthenticationContext();

        // Example 1: Authenticate using Email and Password
        authContext.setStrategy(new EmailAuthentication());
        boolean isEmailAuthSuccessful = authContext.authenticateUser("user@example.com", "password123");
        System.out.println("Email Authentication successful: " + isEmailAuthSuccessful);

        // Example 2: Authenticate using Social Media Token
        authContext.setStrategy(new SocialMediaAuthentication());
        boolean isSocialAuthSuccessful = authContext.authenticateUser("user@example.com", "validSocialMediaToken");
        System.out.println("Social Media Authentication successful: " + isSocialAuthSuccessful);

        // Example 3: Authenticate using OTP
        authContext.setStrategy(new OTPAuthentication());
        boolean isOtpAuthSuccessful = authContext.authenticateUser("user@example.com", "123456");
        System.out.println("OTP Authentication successful: " + isOtpAuthSuccessful);
    }
}

