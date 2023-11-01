package com.dev.analytic_service.Services;

import com.dev.analytic_service.Dtos.EmployeeResponseDto;
import com.dev.analytic_service.Dtos.TicketResponseDto;
import com.dev.analytic_service.Models.Ticket;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.UUID;

//@Service
public interface TicketService {

    public TicketResponseDto save(Ticket ticket);

    public TicketResponseDto findById(UUID uuid);

    public Map<EmployeeResponseDto,List<TicketResponseDto>> ticketGroupByUser();

    public Map<String,List<Ticket>> ticketGroupByAgeing();

    public Map<EmployeeResponseDto,List<TicketResponseDto>> ticketClosedPerUSer();



}
