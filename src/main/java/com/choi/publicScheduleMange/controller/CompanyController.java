package com.choi.publicScheduleMange.controller;

import com.choi.publicScheduleMange.model.CompanyMgt;
import com.choi.publicScheduleMange.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @GetMapping("/company")
    public String deptList(CompanyMgt company, Model model) {
        List<CompanyMgt> companyList = companyService.findByCompanyList();
        model.addAttribute("companyList", companyList);
        return "company/companyList";
    }


    @GetMapping("/company/companyDel/{companyId}")
    public String companyDel(@PathVariable("companyId") String companyId) {
        companyService.delCompanyList(companyId);
        return "redirect:/company";
    }

    @GetMapping("/company/companyUpt/{companyId}")
    public String companyUpt(@PathVariable("companyId") String companyId, Model model) {
        CompanyMgt companyItem = companyService.findByCompanyItem(companyId);
        model.addAttribute("companyItem", companyItem);


        return "company/companyInsUpt";
    }


    @GetMapping("/company/companyIns")
    public String companyIns(Model model) {
        CompanyMgt companyItem = new CompanyMgt();
        companyItem.setCompanyId("");
        companyItem.setCompanyNm("");
        companyItem.setUseYn("");

        model.addAttribute("companyItem", companyItem);
        return "company/companyInsUpt";
    }

    @PostMapping("/company/companyIns")
    public String companyIns(CompanyMgt company) {
        if(company.getCompanyId() != null && !company.getCompanyId().equals("")) {
            companyService.uptCompanyList(company);
        } else {
            companyService.insCompanyList(company);
        }

        return "redirect:/company";
    }

    @GetMapping("/company/checkName")
    @ResponseBody
    public int checkName(@RequestParam("companyName") String companyNm) {
        return companyService.findByCheckName(companyNm);
    }
}
