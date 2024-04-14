package ppapsa;

public class UserException extends Exception{
    final static public int NO_NAME = 1;
    final static public int NO_EMAIL = 2;
    public int code;

    public UserException(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
