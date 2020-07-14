package simplefactory;

/**
 * @program: designpattern
 * @description:
 * @author: chazdada
 * @create: 2020-07-14 22:24
 **/
public class Factory {

  public static Api creatApi(){
    return new ImplApi();
  }
}
