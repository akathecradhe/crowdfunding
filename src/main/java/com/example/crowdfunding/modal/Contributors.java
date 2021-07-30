package com.example.crowdfunding.modal;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Contributors {

    @Id
    private Integer ID;

    private String name;

}
