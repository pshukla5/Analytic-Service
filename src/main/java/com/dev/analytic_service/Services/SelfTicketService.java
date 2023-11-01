package com.dev.analytic_service.Services;

import com.dev.analytic_service.Models.Employee;
import com.dev.analytic_service.Models.Ticket;
import com.dev.analytic_service.Repositories.TicketRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
@AllArgsConstructor
public class SelfTicketService {//implements TicketService{

    TicketRepo ticketRepo;


}
