package com.example.crowdfunding.repositories;

import com.example.crowdfunding.modal.ContributionForm;
import com.example.crowdfunding.modal.Fundraiser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ContributerRepo extends JpaRepository<ContributionForm,Integer> {


    public List<ContributionForm> findAll();

    public List<ContributionForm> findContributionFormById(int id);

   // public List<ContributionForm> sa


}


