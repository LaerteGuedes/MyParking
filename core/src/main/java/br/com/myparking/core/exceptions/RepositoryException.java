package br.com.myparking.core.exceptions;

/**
 * Created by laerteguedes on 04/11/17.
 */
public class RepositoryException extends RuntimeException{

    public RepositoryException() {
        super();
    }

    public RepositoryException(String message) {
        super(message);
    }
}
