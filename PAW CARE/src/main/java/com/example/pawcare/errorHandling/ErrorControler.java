package com.example.pawcare.errorHandling;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorControler {
    @ExceptionHandler(NotFoundException.class)
    public String error(Model model, NotFoundException ex) {

        model.addAttribute("cedula", ex.getCedula());

        return ("pagina_error");
    }
    @ExceptionHandler(UserAlreadyExistsException.class)
    public String error2(Model model, UserAlreadyExistsException ex) {
        return ("pagina_error_registro");
    }
}
