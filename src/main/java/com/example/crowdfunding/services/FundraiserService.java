package com.example.crowdfunding.services;

import com.example.crowdfunding.modal.Fundraiser;
import com.example.crowdfunding.repositories.FundraiserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service

public class FundraiserService {


    @Autowired
    private FundraiserRepo fundraiserRepo;

    public List<Fundraiser> fundraiserList() {

        return fundraiserRepo.findAll();
    }




}
