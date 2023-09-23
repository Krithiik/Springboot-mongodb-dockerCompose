package com.example.demo.Exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    private String message;
    private String httpStatus;

    public String getMessage() {
        return message;
    }
    public String getHttpStatus() {
        return httpStatus;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }


}