package com.dev.analytic_service.Repositories;

import com.dev.analytic_service.Models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface TicketRepo extends JpaRepository<Ticket, UUID> {

    @Override
    <S extends Ticket> S save(S entity);

    @Override
    List<Ticket> findAll();

    @Override
    Optional<Ticket> findById(UUID uuid);

}
