package com.dev.analytic_service.Dtos;

import com.dev.analytic_service.Enums.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TicketResponseDto {

    String description;
    State state;
    String assigned_to;
    String raised_by;
    Date generated_on;
    Date last_updated;
    Date resolved_on;

}
