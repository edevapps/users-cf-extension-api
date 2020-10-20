/*
 * Copyright (c) 2020, The Eduard Burenkov. All rights reserved. http://edevapps.com
 */

package com.edevapps.jira.applications.customfields.ucfe.api;

/**
 * The type Not allow exception.
 */
public class NotAllowException extends RuntimeException {

  private static final long serialVersionUID = -7149205952236427076L;

  /**
   * Instantiates a new Not allow exception.
   */
  public NotAllowException() {
  }

  /**
   * Instantiates a new Not allow exception.
   *
   * @param message the message text
   */
  public NotAllowException(String message) {
    super(message);
  }

  /**
   * Instantiates a new Not allow exception.
   *
   * @param message the message text
   * @param cause the inner exception
   */
  public NotAllowException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * Instantiates a new Not allow exception.
   *
   * @param cause the inner exception
   */
  public NotAllowException(Throwable cause) {
    super(cause);
  }

  /**
   * Instantiates a new Not allow exception.
   *
   * @param message the message text
   * @param cause the inner exception
   * @param enableSuppression the enable suppression
   * @param writableStackTrace the writable stack trace
   */
  public NotAllowException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
