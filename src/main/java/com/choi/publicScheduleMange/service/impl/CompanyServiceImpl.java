package com.choi.publicScheduleMange.service.impl;

import com.choi.publicScheduleMange.mapper.ComapnyMapper;
import com.choi.publicScheduleMange.model.CompanyMgt;
import com.choi.publicScheduleMange.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    ComapnyMapper mapper;

    @Override
    public List<CompanyMgt> findByCompanyList() {
        return mapper.findByCompanyList();
    }

    @Override
    public void insCompanyList(CompanyMgt company) {
        mapper.insCompanyList(company);
    }

    @Override
    public int findByCheckName(String companyNm) {
        return mapper.findByCheckName(companyNm);
    }

    @Override
    public void delCompanyList(String companyId) {
        mapper.delCompanyList(companyId);
    }

    @Override
    public CompanyMgt findByCompanyItem(String companyId) {
        return mapper.findByCompanyItem(companyId);
    }

    @Override
    public void uptCompanyList(CompanyMgt company) {
        mapper.uptCompanyList(company);
    }
}
