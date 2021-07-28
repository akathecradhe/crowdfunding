package com.example.crowdfunding.controllers;

import com.example.crowdfunding.modal.Contribution;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CrowdFundingController {

    @GetMapping("contributions")
    public String contributionList(Model model){


        Contribution aContribution;
        aContribution = new Contribution(1,"John", "ctsungu@gmail.com",
                "Colchester",
                "cancer fund",
                5456745);
        model.addAttribute("contribution",aContribution);
        return "contributions";
    }
}
