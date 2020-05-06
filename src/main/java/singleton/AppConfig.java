package singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 * 单例模式实现读取配置文件
 *
 * */
public class AppConfig {
    private String parameterA;
    private String parameterB;
    private static AppConfig appConfig = new AppConfig();

    public String getParameterA(){
        return parameterA;
    }
    public String getParameterB(){
        return parameterB;
    }

    private AppConfig(){
        readConfig();
    }

    private void readConfig(){
        Properties p = new Properties();
        InputStream in = null;
        try {
            in = AppConfig.class.getResourceAsStream("/AppConfig.properties");
            p.load(in);
            this.parameterA = p.getProperty("paramA");
            this.parameterB = p.getProperty("paramB");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static AppConfig getInstance(){
        return appConfig;
    }
}
