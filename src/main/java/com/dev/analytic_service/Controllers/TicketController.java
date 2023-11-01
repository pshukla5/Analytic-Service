package com.dev.analytic_service.Controllers;


import com.dev.analytic_service.Dtos.EmployeeResponseDto;
import com.dev.analytic_service.Dtos.TicketResponseDto;
import com.dev.analytic_service.Services.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Controller
@RestController
@AllArgsConstructor
public class TicketController {

//    TicketService ticketService;


    @RequestMapping("/tickets/groupByAge")
    private Map<String, List<TicketResponseDto>> ticketGroupByAgeing(){

        return null;
    }

    @RequestMapping("/tickets/groupByUser")
    private Map<EmployeeResponseDto,List<TicketResponseDto>> ticketGroupByUser(){

        return null;
    }

    @RequestMapping("/tickets/closerPerUSer")
    private Map<EmployeeResponseDto,List<TicketResponseDto>> closedPerUser(){

        return null;
    }

}
