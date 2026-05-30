package com.logistics.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.logic.vehiclemaintenance.dto.ScheduledRequestDTO;
import com.logic.vehiclemaintenance.dto.ScheduledResponseDTO;
import com.logic.vehiclemaintenance.service.VehicleMaintenanceService;

@RestController
@RequestMapping("/api/maintenance")
public class VehicleMaintenanceController {

    @Autowired
    private VehicleMaintenanceService vehicleMaintenanceService;

    @PostMapping("/schedule")
    public ResponseEntity<ScheduledResponseDTO> scheduleVehicles(
            @RequestBody ScheduledRequestDTO request) {

        ScheduledResponseDTO response =
                vehicleMaintenanceService.scheduleVehicles(request);

        return ResponseEntity.ok(response);
    }
}