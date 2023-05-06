package com.foodsecurityconsortium.fschome.homepage.base;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class BaseResponse implements Serializable {
    private ResponseStatus responseStatus;
    private String message;
    private Object data;
}
