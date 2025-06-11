package com.firegom.demo.carcompany.service;


import com.firegom.demo.carcompany.domain.Company;
import org.springframework.stereotype.Service;

@Service
public class CarCompanyService {

    public Company newCompany(){
        return new Company();
    }


}
