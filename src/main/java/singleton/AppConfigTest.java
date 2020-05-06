package singleton;

public class AppConfigTest {
    public static void main(String[] args) {
        AppConfig app = AppConfig.getInstance();
        System.out.println(app.getParameterA());
    }
}
