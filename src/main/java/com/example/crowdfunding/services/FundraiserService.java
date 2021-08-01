package com.example.crowdfunding.services;

import com.example.crowdfunding.modal.Fundraiser;
import com.example.crowdfunding.repositories.FundraiserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
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

    public List<Fundraiser> findByMaxAmount(int amount){

        return  fundraiserRepo.findFundraiserByTargetamountLessThan(amount);
    }

    public List<Fundraiser> getBySearch(String search){

        List<Fundraiser> fundraiserSearch;

        if (search.matches("^-?\\d+$")) {
            fundraiserSearch = fundraiserRepo.findFundraiserByTargetamountLessThan(Integer.parseInt(search));
        } else {
            fundraiserSearch = fundraiserRepo.findFundraiserByLocation(search);
        }

        return fundraiserSearch;
    }




}
