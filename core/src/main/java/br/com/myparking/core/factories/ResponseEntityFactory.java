package br.com.myparking.core.factories;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Created by laerteguedes on 04/11/17.
 */
public class ResponseEntityFactory {

    public static ResponseEntity build(Object obj, HttpStatus status){
        return new ResponseEntity(obj, status);
    }

    public static ResponseEntity ok(Object obj){
        return build(obj, HttpStatus.OK);
    }

    public static ResponseEntity create(Object obj){
        return build(obj, HttpStatus.CREATED);
    }

    public static ResponseEntity unauthorized(Object obj){
        return build(obj, HttpStatus.UNAUTHORIZED);
    }

    public static ResponseEntity badRequest(Object obj){
        return build(obj, HttpStatus.BAD_REQUEST);
    }

    public static ResponseEntity forbidden(Object obj){
        return build(obj, HttpStatus.FORBIDDEN);
    }

    public static ResponseEntity notFound(Object obj){
        return build(obj, HttpStatus.NOT_FOUND);
    }

}
