package Execption;

/**
 * @author
 * @create 2020-10-18 9:01
 */
public class SysException extends Exception{
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SysException(String message) {
        this.message = message;
    }
}
