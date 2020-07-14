package simplefactory;

/**
 * @program: designpattern
 * @description:
 * @author: chazdada
 * @create: 2020-07-14 22:23
 **/
public class ImplApi implements Api{
  @Override
  public void op(String s) {
    System.out.println(s);
  }
}
