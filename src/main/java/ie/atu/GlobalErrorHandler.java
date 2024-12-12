package ie.atu;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

public class GlobalErrorHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> display(MethodArgumentNotValidException ex){
        Map<String, String> errorList = new HashMap<>();

        for(FieldError error : ex.getBindingResult().getFieldErrors()) {
            String errorName = error.getField();
            String errorMessage = error.getDefaultMessage();
            errorList.put(errorName, errorMessage);
        }
        return ResponseEntity.status(400).body(errorList);
    }
}
