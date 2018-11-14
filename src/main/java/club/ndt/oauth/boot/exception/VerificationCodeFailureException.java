package club.ndt.oauth.boot.exception;


import org.springframework.security.core.AuthenticationException;

/**
 * @auther ndt
 * @create 2018/10/19 16:18
 * @description
 * @modify
 */
public class VerificationCodeFailureException extends AuthenticationException {

    public VerificationCodeFailureException(String msg, Throwable t) {
        super(msg, t);
    }

    public VerificationCodeFailureException(String msg) {
        super(msg);
    }
}
