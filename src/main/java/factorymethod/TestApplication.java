package factorymethod;

public class TestApplication {
    public static void main(String[] args) {
        Product productA =  new ApplicationA().getProduct();
        productA.productMethod();
    }
}
