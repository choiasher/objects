package me.asher.objects.global.error;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ErrorCode {

  // Common
  INTERNAL_SERVER_ERROR(500, "COM001", "Server error"),

  HANDLE_ACCESS_DENIED(403, "COM002", "Access is Denied"),
  METHOD_NOT_ALLOWED(405, "COM003", "Method not allowed"),
  INVALID_INPUT_VALUE(400, "COM004", "Invalid input value"),
  INVALID_TYPE_VALUE(400, "COM005", "Invalid type value"),
  ENTITY_NOT_FOUND(404, "COM006", " Entity not found"),
  ENTITY_NOT_FOUND_FROM(404, "COM007", "Entity not found with search value: {0}"),
  RESOURCE_NOT_FOUND(404, "COM008", "Resource not found"),

  // Member
  EMAIL_DUPLICATION(400, "M001", "Email is Duplication"),
  LOGIN_INPUT_INVALID(400, "M002", "Login input is invalid");

  private final String code;
  private final String message;
  private final int status;

  ErrorCode(final int status, final String code, final String message) {
    this.status = status;
    this.message = message;
    this.code = code;
  }

  public String getMessage() {
    return this.message;
  }

  public String getCode() {
    return code;
  }

  public int getStatus() {
    return status;
  }


}