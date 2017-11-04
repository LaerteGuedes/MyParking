package br.com.myparking.core.exceptions;

/**
 * Created by laerteguedes on 04/11/17.
 */
public class NotFoundException extends RuntimeException {

    public NotFoundException() {
        super();
    }

    public NotFoundException(String message) {
        super(message);
    }
}
