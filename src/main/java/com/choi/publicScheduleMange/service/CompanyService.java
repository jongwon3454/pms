package com.choi.publicScheduleMange.service;

import com.choi.publicScheduleMange.model.CompanyMgt;

import java.util.List;

public interface CompanyService {
    List<CompanyMgt> findByCompanyList();
    void insCompanyList(CompanyMgt company);

    int findByCheckName(String companyNm);

    void delCompanyList(String companyId);

    CompanyMgt findByCompanyItem(String companyId);

    void uptCompanyList(CompanyMgt company);
}
