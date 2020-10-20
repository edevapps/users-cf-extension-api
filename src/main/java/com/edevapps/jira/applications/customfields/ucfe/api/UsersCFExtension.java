/*
 * Copyright (c) 2020, The Eduard Burenkov. All rights reserved. http://edevapps.com
 */

package com.edevapps.jira.applications.customfields.ucfe.api;

import com.atlassian.jira.component.ComponentAccessor;

/**
 * The Utility class for simplify the creation of objects.
 */
public class UsersCFExtension {

  /**
   * Gets users cf extension service.
   *
   * @return the service
   */
  public static UsersCFExtensionService getService() {
    return ComponentAccessor.getOSGiComponentInstanceOfType(UsersCFExtensionService.class);
  }
}
