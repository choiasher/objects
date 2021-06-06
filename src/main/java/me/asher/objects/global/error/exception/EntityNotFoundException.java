package me.asher.objects.global.error.exception;


import me.asher.objects.global.error.ErrorCode;
import me.asher.objects.global.error.ErrorResponse;

import java.text.MessageFormat;

public class EntityNotFoundException extends BusinessException {

  static final ErrorCode errorCode = ErrorCode.ENTITY_NOT_FOUND;

  public EntityNotFoundException(Class<?> clazz, ErrorResponse.FieldError... arg) {
    super(errorCode, MessageFormat.format(errorCode.getMessage(), clazz.getSimpleName()));
  }

}
