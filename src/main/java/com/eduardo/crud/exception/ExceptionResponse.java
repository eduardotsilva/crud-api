package com.eduardo.crud.exception;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionResponse implements Serializable {
    private static final long serialVersionUID = -8232861081218909382L;

    private Date timeStamp;
    private String message;
    private String details;

}
