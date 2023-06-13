package com.beautycommerce.middlewaresvc.Pojo.Validator;
import com.beautycommerce.middlewaresvc.Pojo.Constraint.Password;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<Password, String> {
    @Override
    public boolean isValid(String password, ConstraintValidatorContext constraintValidatorContext) {
        if(password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+]).{8,20}$")){
            return true;
        }
        return false;
    }
}
