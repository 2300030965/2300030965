package com.logistics.repository;

import com.logistics.model.DailySchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface DailyScheduleRepository extends JpaRepository<DailySchedule, Long> {
    Optional<DailySchedule> findByDepotIdAndScheduleDate(Integer depotId, LocalDate date);
    List<DailySchedule> findByDepotId(Integer depotId);
    List<DailySchedule> findByDepotIdAndStatus(Integer depotId, String status);
}
