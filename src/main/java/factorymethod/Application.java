package factorymethod;


interface Product{
    void productMethod();
}

class ProductA implements Product{

    @Override
    public void productMethod() {
        System.out.println("A");
    }
}

class ProductB implements Product{

    @Override
    public void productMethod() {
        System.out.println("B");
    }
}
/**
 * 工厂方法模式：定义一个用于创建对象的接口，让子类决定实例化哪一个类，
 * FactoryMethod 使得一个类的实例化延迟到子类
 * */
public abstract class Application {
    public abstract Product creatProduct();

    public Product getProduct(){

        return creatProduct();
    };

}

class ApplicationA extends Application{

    @Override
    public Product creatProduct() {
        return new ProductA();
    }
}

class ApplicationB extends Application{

    @Override
    public Product creatProduct() {
        return new ProductB();
    }
}

