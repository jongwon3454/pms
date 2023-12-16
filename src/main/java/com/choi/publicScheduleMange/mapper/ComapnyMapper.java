package com.choi.publicScheduleMange.mapper;

import com.choi.publicScheduleMange.model.CompanyMgt;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ComapnyMapper {

    List<CompanyMgt> findByCompanyList();

    void insCompanyList(CompanyMgt company);

    int findByCheckName(String companyNm);

    void delCompanyList(String companyId);

    CompanyMgt findByCompanyItem(String companyId);

    void uptCompanyList(CompanyMgt company);
}
