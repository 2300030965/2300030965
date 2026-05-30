package com.logistics.repository;

import com.logistics.model.MaintenanceSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface MaintenanceScheduleRepository extends JpaRepository<MaintenanceSchedule, Long> {
    List<MaintenanceSchedule> findByDepotIdAndScheduleStatus(Integer depotId, String status);
    List<MaintenanceSchedule> findByVehicleId(Long vehicleId);
    List<MaintenanceSchedule> findByDepotIdAndScheduledAtBetween(Integer depotId, LocalDateTime start, LocalDateTime end);
}
