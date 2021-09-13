package com.example.crowdfunding;

import com.example.crowdfunding.controllers.CrowdFundingController;
import com.example.crowdfunding.modal.Fundraiser;
import com.example.crowdfunding.repositories.FundraiserRepo;
import com.example.crowdfunding.services.FundraiserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;


import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;



@SpringBootTest
public class mvcTests {



    @Autowired
    private FundraiserService fundraiserService;



    @MockBean
    private FundraiserRepo repo;

    private Fundraiser aFunduraiser = new Fundraiser(3, "clive", "clive@gmail.com", "Braintree",
            "get money",
            323452,
            300,
            new Date(2021-9-05),
            60);

    private Fundraiser aFunduraiser2 = new Fundraiser(4, "chris", "Chriss@gmail.com", "Braintree",
            "get money",
            221812,
            700,
            new Date(2021-10-05),
            60);

    List<Fundraiser> allFundraisers = Arrays.asList(aFunduraiser,aFunduraiser2);

    @Test
    public void getAllFunderaiserTest() throws Exception {

        when(repo.findAll()).thenReturn(allFundraisers);

        //THERES ONLY 2 FUNDRAISERS IN OUR LIST. A getall function should return to objects
        assertEquals(2,fundraiserService.fundraiserList().size());

    }

    @Test
    public void getUserByIDTest() throws Exception {

        int fundraiserId = 4;
        List<Fundraiser> getByID= allFundraisers
                .stream().filter(x -> x.getId() == fundraiserId).collect(Collectors.toList());
       // when(repo.findFundraiserById(fundraiserId)).thenReturn((true);

         //the size should only equal 1 to show thast it has matched 1 ID otherwise
        assertEquals(1,getByID.size());
    }

    @Test
    public void searchByLocationTest() throws Exception{

        fundraiserService.findByLocation("Braintree");

        Predicate<Fundraiser> eqaulsLocation = x -> x.getLocation().equals("Braintree");

        List<Fundraiser> location= allFundraisers
                .stream().filter(eqaulsLocation).collect(Collectors.toList());

        //the size should only equal 2 to show thast it has matched 2 locations
        assertEquals(2,location.size());

    }

    @Test
    public void maxAmountTest() throws Exception{

         System.out.println(fundraiserService.findByMaxAmount(500).size());

        Predicate<Fundraiser> eqaulsLessthan = x -> x.getTargetamount() <500;

        List<Fundraiser> total= allFundraisers
                .stream().filter(eqaulsLessthan).collect(Collectors.toList());
        //the size should only equal 2 to show thast it has matched 2 locations
        assertEquals(1,total.size());

    }


}
