package com.example.crowdfunding.controllers;

import com.example.crowdfunding.modal.Fundraiser;
import com.example.crowdfunding.services.FundraiserService;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CrowdFundingController {

    @Autowired
    private FundraiserService fundraiserService;

    @GetMapping("/")
    public String homePage(){


        return "CrowdFundingHome";
    }

    @GetMapping("/fundraisers")
    public String getcontributionList(Model model){


        model.addAttribute("fundraisers",fundraiserService.fundraiserList());

        return "fundraisers";

    }

    @GetMapping("/fundraisers/search")

    public String search(@RequestParam("search") String search, Model model){

        List<Fundraiser> fundraisers;

        if (search.equals("")){
            fundraisers = fundraiserService.fundraiserList();
        }else {
            fundraisers = fundraiserService.getBySearch(search);
        }

        model.addAttribute("fundraisers",fundraisers);
        return "fundraisers";
    }


}
