package com.example.crowdfunding.services;

import com.example.crowdfunding.modal.Contribution;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service

public class ContributionService {

    Contribution aContribution = new Contribution(1, "John", "ctsungu@gmail.com",
            "Colchester",
            "cancer fund",
            5456745);

    Contribution aContribution2 = new Contribution(2, "james", "dsadau@gmail.com",
            "braintree",
            "new car",
            4444325);
    Contribution aContribution3 = new Contribution(3, "jack", "dalikds@gmail.com",
            "Chelmsford",
            "cricket fund",
            4544444);

    Contribution aContribution4 = new Contribution(4, "jane", "ctu@gmail.com",
            "harlow",
            "football fund",
            788888);


    //model.addAttribute("contribution",aContribution);
    List<Contribution> contributions = Arrays.asList(aContribution, aContribution2, aContribution3, aContribution4);


    public List<Contribution> contributionList() {
        return  contributions;
    }

    public Contribution getContributer(int id){

        Contribution contributor = contributions.stream().filter(t -> t.getId() == id)
                                    .findFirst()
                                    .orElse(null);
                return contributor;
    }


}
