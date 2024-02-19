package com.venturenix.cmc.payload.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import jakarta.validation.constraints.Size;

public class GroupUserQuestionHandleRequest {




  //@NotBlank
  private Long eventid;

  //@NotBlank
  private Long groupid;

  //@NotBlank
  private Long userlist;  

  //@NotBlank
  private Long questionid;  

  //@NotBlank
  private String status;

  
  private LocalDateTime createddate;

  
  private Integer createdby;

  
  private LocalDateTime updateddate;

  
  private Integer updatedby;


  public Long getEventid() {
    return eventid;
  }

  public void setEventid(Long eventid) {
    this.eventid = eventid;
  }

  public Long getGroupid() {
    return groupid;
  }

  public void setGroupid(Long groupid) {
    this.groupid = groupid;
  }  

  public String getUserlist() {
    return userlist;
  }

  public void setUserlist(String userlist) {
    this.userlist = userlist;
  }  

  public Long getQuestionid() {
    return questionid;
  }

  public void setQuestionid(Long questionid) {
    this.questionid = questionid;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
 public Integer getCreatedby() {
    return createdby;
  }

  public void setCreatedby(Integer createdby) {
    this.createdby = createdby;
  }

  public LocalDateTime getCreateddate() {
    return createddate;
  }

  public void setCreateddate(LocalDateTime createddate) {
    this.createddate = createddate;
  }

   public Integer getUpdatedby() {
    return updatedby;
  }

  public void setUpdatedby(Integer updatedby) {
    this.updatedby = updatedby;
  }

  public LocalDateTime getUpdateddate() {
    return updateddate;
  }

  public void setUpdateddate(LocalDateTime updateddate) {
    this.updateddate = updateddate;
  }

}