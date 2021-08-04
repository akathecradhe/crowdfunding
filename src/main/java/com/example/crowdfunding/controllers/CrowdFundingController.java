package com.example.crowdfunding.controllers;

import com.example.crowdfunding.modal.Fundraiser;
import com.example.crowdfunding.services.FundraiserService;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

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

    @RequestMapping(value = "/contribute/{fundraiserid}", method = RequestMethod.GET)

    public  String startContribution (@PathVariable int fundraiserid, Model model ){


        System.out.println(fundraiserid);

        return "contributions";
    }



}
