package com.qf.day40.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account {
  private Integer id;
  private String email;
  private String pwd;
  private String truename;
  private String qq;
  private String wx;
  private String phone;
}
