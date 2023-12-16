package com.choi.publicScheduleMange.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class Calendar {

    private String title;
    private Date start;
    private Date end;
}
