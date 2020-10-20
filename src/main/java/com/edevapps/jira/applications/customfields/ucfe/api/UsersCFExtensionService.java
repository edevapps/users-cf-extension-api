/*
 * Copyright (c) 2020, The Eduard Burenkov. All rights reserved. http://edevapps.com
 */

package com.edevapps.jira.applications.customfields.ucfe.api;

import java.util.Set;

/**
 * The interface Users cf extension service.
 */
public interface UsersCFExtensionService {

  /**
   * Gets not allow groups.
   *
   * @return the not allow groups
   */
  Set<String> getNotAllowGroups();

  /**
   * Gets not allow users groups.
   *
   * @return the not allow users groups
   */
  Set<String> getNotAllowUsersGroups();

  /**
   * Gets groups for project.
   *
   * @param projectKey the project key
   * @return the groups for project
   * @throws IndexOutOfBoundsException the index out of bounds exception
   */
  Set<String> getGroupsForProject(String projectKey) throws IndexOutOfBoundsException;

  /**
   * Add group for project.
   *
   * @param projectKey the project key
   * @param groupName the group name
   * @throws IndexOutOfBoundsException the index out of bounds exception
   * @throws NotAllowException the not allow exception
   */
  void addGroupForProject(String projectKey, String groupName)
      throws IndexOutOfBoundsException, NotAllowException;

  /**
   * Remove group for project.
   *
   * @param projectKey the project key
   * @param groupName the group name
   * @throws IndexOutOfBoundsException the index out of bounds exception
   */
  void removeGroupForProject(String projectKey, String groupName) throws IndexOutOfBoundsException;

  /**
   * Gets users group for project.
   *
   * @param projectKey the project key
   * @return the users group for project
   * @throws IndexOutOfBoundsException the index out of bounds exception
   */
  String getUsersGroupForProject(String projectKey) throws IndexOutOfBoundsException;

  /**
   * Sets users group for project.
   *
   * @param projectKey the project key
   * @param groupName the group name
   * @throws IndexOutOfBoundsException the index out of bounds exception
   * @throws NotAllowException the not allow exception
   */
  void setUsersGroupForProject(String projectKey, String groupName)
      throws IndexOutOfBoundsException, NotAllowException;

  /**
   * Gets default group for single group custom field.
   *
   * @param projectKey the project key
   * @return the default group for single group custom field
   * @throws IndexOutOfBoundsException the index out of bounds exception
   */
  String getDefaultGroupForSingleGroupField(String projectKey) throws IndexOutOfBoundsException;

  /**
   * Sets default group for single group custom field.
   *
   * @param projectKey the project key
   * @param groupName the group name
   * @throws IndexOutOfBoundsException the index out of bounds exception
   * @throws NotAllowException the not allow exception
   */
  void setDefaultGroupForSingleGroupField(String projectKey, String groupName)
      throws IndexOutOfBoundsException, NotAllowException;

  /**
   * Gets default groups for groups custom field.
   *
   * @param projectKey the project key
   * @return the default groups for groups custom field
   * @throws IndexOutOfBoundsException the index out of bounds exception
   */
  Set<String> getDefaultGroupsForGroupsField(String projectKey) throws IndexOutOfBoundsException;

  /**
   * Add default group for groups custom field.
   *
   * @param projectKey the project key
   * @param groupName the group name
   * @throws IndexOutOfBoundsException the index out of bounds exception
   * @throws NotAllowException the not allow exception
   */
  void addDefaultGroupForGroupsField(String projectKey, String groupName)
      throws IndexOutOfBoundsException, NotAllowException;

  /**
   * Remove default group for groups custom field.
   *
   * @param projectKey the project key
   * @param groupName the group name
   * @throws IndexOutOfBoundsException the index out of bounds exception
   */
  void removeDefaultGroupForGroupsField(String projectKey, String groupName)
      throws IndexOutOfBoundsException;

  /**
   * Gets default user for single user custom field.
   *
   * @param projectKey the project key
   * @return the default user for single user field
   * @throws IndexOutOfBoundsException the index out of bounds exception
   */
  String getDefaultUserForSingleUserField(String projectKey) throws IndexOutOfBoundsException;

  /**
   * Sets default user for single user custom field.
   *
   * @param projectKey the project key
   * @param userName the user name
   * @throws IndexOutOfBoundsException the index out of bounds exception
   * @throws NotAllowException the not allow exception
   */
  void setDefaultUserForSingleUserField(String projectKey, String userName)
      throws IndexOutOfBoundsException, NotAllowException;

  /**
   * Gets default users for users custom field.
   *
   * @param projectKey the project key
   * @return the default users for users field
   * @throws IndexOutOfBoundsException the index out of bounds exception
   */
  Set<String> getDefaultUsersForUsersField(String projectKey) throws IndexOutOfBoundsException;

  /**
   * Add default user for users custom field.
   *
   * @param projectKey the project key
   * @param userName the user name
   * @throws IndexOutOfBoundsException the index out of bounds exception
   * @throws NotAllowException the not allow exception
   */
  void addDefaultUserForUsersField(String projectKey, String userName)
      throws IndexOutOfBoundsException, NotAllowException;

  /**
   * Remove default user for users custom field.
   *
   * @param projectKey the project key
   * @param userName the user name
   * @throws IndexOutOfBoundsException the index out of bounds exception
   */
  void removeDefaultUserForUsersField(String projectKey, String userName)
      throws IndexOutOfBoundsException;
}
