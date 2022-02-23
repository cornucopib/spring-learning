package com.cornucopib.springframework.beans;

/**
 * Beans Exception
 *
 * @author cornucopib
 * @since 2022/2/22
 */
public class BeansException extends RuntimeException {

    private String message;
    private Throwable e;

    public BeansException(String message, Throwable e) {
        super(message, e);
        this.message = message;
        this.e = e;
    }

    public BeansException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Throwable getE() {
        return e;
    }

    public void setE(Throwable e) {
        this.e = e;
    }
}
