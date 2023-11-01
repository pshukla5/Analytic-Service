package com.dev.analytic_service.Models;


import com.dev.analytic_service.Enums.State;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Tickets")
public class Ticket extends BaseModel{

    String description;

    @Enumerated(EnumType.STRING)
    State state;

    @ManyToOne
    Employee assigned_to;

    @ManyToOne
    Client raised_by;

//    @Column(columnDefinition = "DATETIME")
    Date generated_on;

//    @Column(columnDefinition = "DATETIME")
    Date last_updated;
}
