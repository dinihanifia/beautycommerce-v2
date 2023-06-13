package com.beautycommerce.middlewaresvc.Exception;
import lombok.*;
import org.springframework.http.HttpStatus;

@Data
@Getter
@Setter
@ToString
public class ResponseErrorException extends Throwable {
    private final String code;
    private final String message;
    private final HttpStatus httpStatus;

    public ResponseErrorException(String code, String message, HttpStatus httpStatus){
        this.code = code;
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
