package club.ndt.oauth.boot.exception;

/**
 * @author ndt
 * @create Time 2018/8/6 15:56
 * @description 参数不正确
 * @modify by
 * @modify time
 **/
public class ArgumentsFailureException extends RuntimeException {

    public ArgumentsFailureException() {
        this("参数错误");
    }

    public ArgumentsFailureException(String message) {
        super(message);
    }
}
