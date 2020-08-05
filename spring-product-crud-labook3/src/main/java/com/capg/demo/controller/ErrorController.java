package com.capg.demo.controller;


import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capg.demo.exception.productDoesnotExistsException;
import com.capg.demo.exception.productNotFoundException;
import com.capg.demo.model.ErrorResponse;

@RestControllerAdvice
public class ErrorController {
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = { productDoesnotExistsException.class })
	public ErrorResponse handleStudentAlreadyExistsException(Exception ex, HttpServletRequest req) {

		return new ErrorResponse(new Date(), ex.getMessage(), HttpStatus.BAD_REQUEST.getReasonPhrase(),
				HttpStatus.BAD_REQUEST.value(), req.getRequestURL().toString());

	}

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = { productNotFoundException.class })
	public ErrorResponse handleStudentNotException(Exception ex, HttpServletRequest req) {

		return new ErrorResponse(new Date(), ex.getMessage(), HttpStatus.BAD_REQUEST.getReasonPhrase(),
				HttpStatus.BAD_REQUEST.value(), req.getRequestURL().toString());

	}


}
