package com.choi.publicScheduleMange.model;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class TodoMgt {

    private String loginId;
    private String companyId;
    private String todoNo;
    private String feedId;
    private String todoContent;
    private Date todoStartDate;
    private Date todoEndDate;
    private String todoCompleteYn;

    private String title;

}
