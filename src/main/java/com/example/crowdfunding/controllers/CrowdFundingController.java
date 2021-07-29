package com.example.crowdfunding.controllers;

import com.example.crowdfunding.modal.Contribution;
import com.example.crowdfunding.services.ContributionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Controller
public class CrowdFundingController {

    @Autowired
    private ContributionService contributionService;

    @RequestMapping(value = "/contributions")
    public List<Contribution> getcontributionList(){

        return contributionService.contributionList();

    }

    @RequestMapping(value = "/contributions/{id}")
    public Contribution getcontributionList(@PathVariable int id){

        return contributionService.getContributer(id);

    }
}
