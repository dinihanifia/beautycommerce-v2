package com.beautycommerce.middlewaresvc.Helper;
import com.beautycommerce.middlewaresvc.Pojo.Context.UserContext;
import com.beautycommerce.middlewaresvc.Pojo.Request.RegisterUserRequest;
import io.vavr.control.Try;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import java.util.UUID;

@Service
public class Helper {

    public Try<UserContext> userInit(RegisterUserRequest registerUserRequest, BindingResult bind, UUID userId, int pageNo, int pageSize){
        return Try.ofSupplier(() -> new UserContext(registerUserRequest, bind, userId, pageNo, pageSize));
    }
}
