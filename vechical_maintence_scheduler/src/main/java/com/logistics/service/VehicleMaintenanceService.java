package com.logistics.service;


import org.springframework.scheduling.annotation.Scheduled;

import com.logic.vehiclemaintenance.dto.ScheduledRequestDTO;
import com.logic.vehiclemaintenance.dto.ScheduledResponseDTO;

public interface VehicleMaintenanceService {

    ScheduledResponseDTO scheduleVehicles(ScheduledRequestDTO request);

}