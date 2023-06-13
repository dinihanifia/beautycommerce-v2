package com.beautycommerce.middlewaresvc.Controller;
import com.beautycommerce.middlewaresvc.Config.APIConstant;
import com.beautycommerce.middlewaresvc.Pojo.Interface.RegisterRequestInterface;
import com.beautycommerce.middlewaresvc.Pojo.Request.RegisterUserRequest;
import com.beautycommerce.middlewaresvc.Pojo.Response.ServiceResponse;
import com.beautycommerce.middlewaresvc.Service.LoginService;
import lombok.RequiredArgsConstructor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {

    private static final Log log = LogFactory.getLog(LoginController.class);
    private final LoginService loginService;

    @PostMapping(APIConstant.URL_SAVE_USER)
    public ResponseEntity<?> registerUser(@Validated(RegisterRequestInterface.class)
                                          @RequestBody RegisterUserRequest registerUserRequest,
                                          BindingResult bind) throws Exception{

        ServiceResponse response = loginService.registerUser(registerUserRequest, bind);
        return ResponseEntity.status(response.getHttpStatus()).body(response.getObject());
    }
}
