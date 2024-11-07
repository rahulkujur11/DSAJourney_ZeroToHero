package LLD.UserAuthentication;

public class OTPAuthentication implements AuthenticationStrategy{
    @Override
    public boolean authenticate(String username, String otp) {
        // Perform OTP-based authentication
        System.out.println("Authenticating using OTP.");
        // (Placeholder) Logic for verifying OTP
        return "123456".equals(otp);
    }
}
