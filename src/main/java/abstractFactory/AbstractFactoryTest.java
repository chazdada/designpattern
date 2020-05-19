package abstractFactory;

/**
 * @program: designpattern
 * @description: 抽象工厂模式:提供一个创建一系列相关或互相依赖对象的接口，而无需指定他们具体的类
 * @author: chazdada
 * @create: 2020-05-19 20:16
 **/
public class AbstractFactoryTest {
    public static void main(String[] args) {
        IDatabaseUtils iDatabaseUtils = new MysqlIDatabaseUtils();
        Connection connect = iDatabaseUtils.getConnect();
        connect.connect();
        Commend commend = iDatabaseUtils.getCommend();
        commend.sendCommend();
    }
}

interface Connection{
    void connect();
}

interface Commend{
    void sendCommend();
}

interface IDatabaseUtils{
    Connection getConnect();
    Commend getCommend();
}

class MysqlConnection implements Connection{

    @Override
    public void connect() {
        System.out.println("mysql connection");
    }
}

class MysqlCommend implements Commend{

    @Override
    public void sendCommend() {
        System.out.println("mysql send commend");
    }
}

class MysqlIDatabaseUtils implements IDatabaseUtils{

    @Override
    public Connection getConnect() {
        return new MysqlConnection();
    }

    @Override
    public Commend getCommend() {
        return new MysqlCommend();
    }
}

