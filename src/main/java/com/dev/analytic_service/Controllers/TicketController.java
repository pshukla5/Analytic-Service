package com.dev.analytic_service.Controllers;


import com.dev.analytic_service.Dtos.EmployeeResponseDto;
import com.dev.analytic_service.Dtos.TicketResponseDto;
import com.dev.analytic_service.Services.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
@RestController
@AllArgsConstructor
public class TicketController {

    TicketService ticketService;


    @GetMapping("/tickets/groupByAge")
    private Map<String, List<TicketResponseDto>> ticketGroupByAgeing(){

        return null;
    }

    @GetMapping("/tickets/groupByEmployee")
    private Map<UUID,List<TicketResponseDto>> ticketGroupByAssignedTo(){

        Map<UUID,List<TicketResponseDto>> response =
                ticketService.ticketGroupByAssignedTo();

        System.out.println(response);

        return response;
    }

    @GetMapping("/tickets/closerPerUSer")
    private Map<EmployeeResponseDto,List<TicketResponseDto>> closedPerUser(){

        return null;
    }

}
