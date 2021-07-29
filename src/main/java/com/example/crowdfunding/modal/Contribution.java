package com.example.crowdfunding.modal;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Contribution {

   @Id
    private Integer id;

    private String name;

    private String email;

    private String location;

    private String purpose;


    //many to one
    private Integer bankdetails;

 public Contribution() {
 }

 public Contribution(Integer id, String name, String email,
                     String location, String purpose,
                     Integer bankdetails) {
  this.id = id;
  this.name = name;
  this.email = email;
  this.location = location;
  this.purpose = purpose;
  this.bankdetails = bankdetails;
 }

 public Integer getId() {
  return id;
 }

 public void setId(Integer id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public String getLocation() {
  return location;
 }

 public void setLocation(String location) {
  this.location = location;
 }

 public String getPurpose() {
  return purpose;
 }

 public void setPurpose(String purpose) {
  this.purpose = purpose;
 }

 public Integer getBankdetails() {
  return bankdetails;
 }

 public void setBankdetails(Integer bankdetails) {
  this.bankdetails = bankdetails;
 }
}
