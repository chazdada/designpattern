package RandomTest;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;


public class TestSeason {

    @Test
    public void testSeason(){
        Season season = Season.SPRING;
        System.out.println(season.ordinal());
    }

    @Test
    public void testStatusCode(){
        StatusCode statusCode = StatusCode.SUCCESS;
        System.out.println(statusCode.getCode());

        StatusCode[] values = StatusCode.values();
        for (StatusCode value : values) {
            System.out.println(value.name());
        }
    }

    @Test
    public void testBasic(){
        int a = 0100;
        System.out.println(a);
        System.out.println(2.0-1.1);
        int 哈哈 = 1;
        System.out.println(哈哈);
        System.out.println();
        BigInteger b = new BigInteger("10000000000000000000000000000000000");
        System.out.println(b.add(BigInteger.valueOf(1)));
        System.out.println(Integer.toBinaryString(2));
        int[] arr = new int[] {1,2,3};
        int[] arr2 = arr;
//        arr2[2] = 0;

        arr2 = Arrays.copyOf(arr,3);
        arr2[2] = 1100;
        for(int i : arr){
            System.out.println(i);
        }

    }

}
