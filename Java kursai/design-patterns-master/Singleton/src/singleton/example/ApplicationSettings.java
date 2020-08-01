package singleton.example;

public class ApplicationSettings {

    public String getNotificationsEmails() {
        return notificationsEmails;
    }

    public String getSupportEmail() {
        return supportEmail;
    }

    public String getLanguage() {
        return language;
    }

    private static ApplicationSettings instance = null;

    private String notificationsEmails;
    private String supportEmail;
    private String language;

    private ApplicationSettings() {

    }

    public static ApplicationSettings getInstance() {
        if (instance == null) {
            instance = new ApplicationSettings();
            instance.loadConfig("app.config");
        }
        return instance;
    }

    private void loadConfig(String appSettingsFile) {
        System.out.println("Loading settings from: " + appSettingsFile);
        notificationsEmails = "som";
        supportEmail = "aaa@test.test";
        language = "EN";
    }

    @Override
    public String toString() {
        return "ApplicationSettings{" +
                "notificationsEmails='" + notificationsEmails + '\'' +
                ", supportEmail='" + supportEmail + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}