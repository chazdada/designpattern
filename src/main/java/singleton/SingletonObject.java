package singleton;

/**
 * @program: designpattern
 * @description:
 * @author: chazdada
 * @create: 2020-06-07 21:44
 **/
public class SingletonObject {

    private SingletonObject(){

    }

    private static class InnerHolder{
        private static SingletonObject instance = new SingletonObject();
    }

    public SingletonObject getInstance(){
        return InnerHolder.instance;
    }

}
