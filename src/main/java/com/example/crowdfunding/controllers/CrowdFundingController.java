package com.example.crowdfunding.controllers;

import com.example.crowdfunding.modal.Fundraiser;
import com.example.crowdfunding.services.FundraiserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CrowdFundingController {

    @Autowired
    private FundraiserService fundraiserService;

    @RequestMapping(value = "/Fundraisers")
    public String getcontributionList(Model model){


        model.addAttribute("fundraisers",fundraiserService.fundraiserList());

        return "Fundraisers";

    }


}
