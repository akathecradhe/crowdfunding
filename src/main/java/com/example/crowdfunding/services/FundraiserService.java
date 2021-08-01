package com.example.crowdfunding.services;

import com.example.crowdfunding.modal.Fundraiser;
import com.example.crowdfunding.repositories.FundraiserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Service

public class FundraiserService {


    @Autowired
    private FundraiserRepo fundraiserRepo;

    public List<Fundraiser> fundraiserList() {

        return fundraiserRepo.findAll();
    }

    public List<Fundraiser> findByLocation(String loctaion) {

        return fundraiserRepo.findFundraiserByLocation(loctaion);
    }




}
