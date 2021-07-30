package com.example.crowdfunding.repositories;

import com.example.crowdfunding.modal.Fundraiser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository

public interface FundraiserRepo extends JpaRepository<Fundraiser,Integer> {


    public List<Fundraiser> findAll();

}


