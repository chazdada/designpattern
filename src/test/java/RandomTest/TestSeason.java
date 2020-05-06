package RandomTest;

import org.junit.Test;


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

}
