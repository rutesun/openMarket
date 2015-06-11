package com.intellicode.openMarket.util.validator;

import com.intellicode.openMarket.controller.PurchaseController;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by rutes_000 on 2015-06-11.
 */
@Component
public class PurchaseValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return PurchaseController.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
