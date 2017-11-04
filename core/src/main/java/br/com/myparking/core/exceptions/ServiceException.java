package br.com.myparking.core.exceptions;

/**
 * Created by laerteguedes on 04/11/17.
 */
public class ServiceException extends RuntimeException {

    public ServiceException() {
        super();
    }

    public ServiceException(String message) {
        super(message);
    }
}
