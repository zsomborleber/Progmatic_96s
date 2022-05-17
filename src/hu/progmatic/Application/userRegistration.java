package hu.progmatic.Application;

public class userRegistration {

    private String username;
    private String password;
    private String confirmPassword;
    private String emailAddres;
    private String confirmEmailAddres;


    public userRegistration(String username) {
        this.username = username;
    }

    public userRegistration(String username, String password, String confirmPassword, String emailAddres, String confirmEmailAddres) {
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.emailAddres = emailAddres;
        this.confirmEmailAddres = confirmEmailAddres;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getEmailAddres() {
        return emailAddres;
    }

    public void setEmailAddres(String emailAddres) {
        this.emailAddres = emailAddres;
    }

    public String getConfirmEmailAddres() {
        return confirmEmailAddres;
    }

    public void setConfirmEmailAddres(String confirmEmailAddres) {
        this.confirmEmailAddres = confirmEmailAddres;
    }
}
