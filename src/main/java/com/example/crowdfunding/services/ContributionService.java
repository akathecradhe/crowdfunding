package com.example.crowdfunding.services;

import com.example.crowdfunding.modal.ContributionForm;
import com.example.crowdfunding.modal.Fundraiser;
import com.example.crowdfunding.repositories.ContributerRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class ContributionService {


    @Autowired
    ContributerRepo contributerRepo;

    public ContributionForm addContribution(ContributionForm aContribution){

        return contributerRepo.save(aContribution);

    }
}
