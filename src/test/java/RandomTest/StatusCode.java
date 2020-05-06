package RandomTest;

public enum StatusCode {

    SUCCESS(100,"成功"),FAILD(400,"失败");

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private int code;
    private String msg;

    StatusCode(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

}
