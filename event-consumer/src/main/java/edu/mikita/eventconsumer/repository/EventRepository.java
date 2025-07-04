package edu.mikita.eventconsumer.repository;

import edu.mikita.eventconsumer.model.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventEntity, Long> {
}
