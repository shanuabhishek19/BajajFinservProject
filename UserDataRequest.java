/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.List;

/**
 *
 * @author project
 */
public class UserDataRequest {
  private List<Object> data;
  public List<Object> getData() {
    return data;
  }
  public void setData(List<Object> data) {
    this.data = data;
  }
}

public class UserDataResponse {
  public String status;
  public int userId;
  public String emailId;
  public String collegeRollNumber;
  public List<Integer> evenNumbers;
  public List<Integer> oddNumbers;

    /**
     *
     */
    public List<String> upperCaseLetters;
  // getters and setters
}
