package com.logistics.repository;

import com.logistics.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    Optional<Vehicle> findByVehicleId(String vehicleId);
    List<Vehicle> findByDepotId(Integer depotId);
    List<Vehicle> findByDepotIdAndStatus(Integer depotId, String status);
}
