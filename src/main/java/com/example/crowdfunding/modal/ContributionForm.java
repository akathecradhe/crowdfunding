package com.example.crowdfunding.modal;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Filter;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContributionForm {

    @NotNull
    private String name;

    @NotNull
    private String email;

    @NotNull
    private String accountNumber;


}
