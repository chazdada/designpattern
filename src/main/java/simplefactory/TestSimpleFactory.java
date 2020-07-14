package simplefactory;

/**
 * @program: designpattern
 * @description: 提供一个创建对象实例的功能，而无需关心具体实现
 * 接口是用来封装隔离具体实现的
 * @author: chazdada
 * @create: 2020-07-14 22:23
 **/
public class TestSimpleFactory {
  public static void main(String[] args) {
    Api api = Factory.creatApi();
    api.op("hello impl");
  }
}
