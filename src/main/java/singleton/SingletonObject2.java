package singleton;

/**
 * @program: designpattern
 * @description:
 * @author: chazdada
 * @create: 2020-06-07 21:46
 **/
public class SingletonObject2 {

    private SingletonObject2(){

    }

    private enum Inner{
        INSTANCE;
        private SingletonObject2 instance;

        Inner(){
            instance = new SingletonObject2();
        }

        public  SingletonObject2 getInstance(){
            return instance;
        }
    }

    public SingletonObject2 getInstance(){
        return Inner.INSTANCE.getInstance();
    }

}
