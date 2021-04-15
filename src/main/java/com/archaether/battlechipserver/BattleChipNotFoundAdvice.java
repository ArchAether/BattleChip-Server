package com.archaether.battlechipserver;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class BattleChipNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(BattleChipNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String battleChipNotFoundHandler(BattleChipNotFoundException ex) {
        return ex.getMessage();
    }
}
