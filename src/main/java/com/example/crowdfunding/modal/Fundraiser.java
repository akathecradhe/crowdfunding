package com.example.crowdfunding.modal;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Fundraiser {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;

 @NonNull
 private String name;

 @NonNull
 private String email;

 @NonNull
 private String location;

 @NonNull
 private String purpose;

 @NonNull
 private Integer bankdetails;

 @NonNull
 private Integer targetamount;

 @NonNull
 private Date targetdate;

 private Integer currentamount;



 public Fundraiser() {

 }
}
