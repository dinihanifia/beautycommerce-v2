package com.beautycommerce.middlewaresvc.Service.Component;
import com.beautycommerce.middlewaresvc.Config.MessageConstant;
import com.beautycommerce.middlewaresvc.Config.ResponseCodeConstant;
import com.beautycommerce.middlewaresvc.DAO.UserDAO;
import com.beautycommerce.middlewaresvc.Exception.ResponseErrorException;
import com.beautycommerce.middlewaresvc.Pojo.Context.UserContext;
import com.beautycommerce.middlewaresvc.Pojo.Response.RegisterUserResponse;
import io.vavr.control.Try;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserComponent {

    private final UserDAO userDAO;

    public void checkBindData(BindingResult bind) throws ResponseErrorException {
        if(bind.hasErrors()){
            FieldError fieldError = bind.getFieldErrors().get(0);
            String msg[] = fieldError.getDefaultMessage().split("#");
            throw new ResponseErrorException(ResponseCodeConstant.BAD_REQUEST+msg[1],
                    msg[0]+" "+fieldError.getField(),
                    HttpStatus.BAD_REQUEST);
        }
    }

//    public Try<UserContext> insertUser(UserContext userContext){
//        return Try.of(() -> userContext)
//                .andThenTry(ctx -> {
//                        var request = ctx.getRegisterUserRequest();
//                        Optional<RegisterUserResponse> result = Optional.of(userDAO.insertUser(request));
//                        result.ifPresentOrElse(
//                                userFound -> throw new ResponseErrorException(ResponseCodeConstant.NOT_FOUND, MessageConstant.USER_FOUND, HttpStatus.BAD_REQUEST)),
//                                userNotFound -> ctx.setRegisterUserResponse(result);
////                        RegisterUserResponse response = userDAO.insertUser(request);
////                        ctx.setRegisterUserResponse(response);
//                });
//    }
}
