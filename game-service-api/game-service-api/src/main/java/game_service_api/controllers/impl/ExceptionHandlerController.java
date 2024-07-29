package game_service_api.controllers.impl;

import game_service_api.commons.dto.ErrorResponse;
import game_service_api.commons.exceptions.GameException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class ExecptionHandlerController {

    @ExceptionHandler(value = {GameException.class})
    ResponseEntity<ErrorResponse> handleError(GameException gameException) {

        log.error("NEW EXCEPTION", gameException);

        var errorResponse = ErrorResponse.builder()
                .codeStatus(gameException.getHttpStatus().value())
                .message(gameException.getMessage())
                .build();

        return ResponseEntity.status(gameException.getHttpStatus()).body(errorResponse);
    }

}
