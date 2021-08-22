package com.example.crowdfunding.controllers;

import com.example.crowdfunding.modal.ContributionForm;
import com.example.crowdfunding.modal.Fundraiser;
import com.example.crowdfunding.services.ContributionService;
import com.example.crowdfunding.services.FundraiserService;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Controller
public class CrowdFundingController {

    @Autowired
    private FundraiserService fundraiserService;

    @Autowired
    private ContributionService contributionService;

    private Integer id;

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

    @GetMapping("/contribute/{fundraiserid}")

    public  String newContribution (@PathVariable Integer fundraiserid, Model model ){


        id = fundraiserid;
        model.addAttribute("contributionForm", new ContributionForm());
        model.addAttribute("fundraiserid", fundraiserid);

        //System.out.println(fundraiserid);

        return "contributions";
    }


    @PostMapping("/contribute/submit")

    public  String submitform (@ModelAttribute("contribution") ContributionForm contribution, BindingResult bindings){


        Fundraiser afundraiser = fundraiserService.findFundraiserById(id);
        String name = contribution.getName();
        String email = contribution.getEmail();
        Integer amount= contribution.getAmount();
        Integer bankDetails = contribution.getAccountNumber();
        ContributionForm aform = new ContributionForm();

        aform.setName(name);
        aform.setEmail(email);
        aform.setAccountNumber(bankDetails);
        aform.setAmount(amount);
        aform.setFundraiserid(id);

        contributionService.addContribution(aform);
        fundraiserService.updateAmountById(id,contribution.getAmount());

        return "thankYou.html";
    }



}
