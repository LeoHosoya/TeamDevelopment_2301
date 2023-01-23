package com.example.demo.model;

import java.sql.Date;
import java.sql.Time;

import lombok.Data;

@Data

public class attendanceForm {
   private String status;
   private Date attendancedate;
   private Time attendancetime;
   private Time leavingworktime;
   private Date leavingworkdate;
   private Time Operatingtime;
   private Time Breaktime;
   private String remarks;

}
