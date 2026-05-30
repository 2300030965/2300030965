package com.logistics.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "maintenance_schedules")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MaintenanceSchedule {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private Long vehicleId;
    
    @Column(nullable = false)
    private Integer depotId;
    
    @Column(nullable = false)
    private Double duration;
    
    @Column(nullable = false)
    private Integer importanceScore;
    
    @Column(nullable = false)
    private String scheduleStatus;
    
    @Column(nullable = false)
    private LocalDateTime createdAt;
    
    @Column
    private LocalDateTime scheduledAt;
    
    @Column
    private LocalDateTime completedAt;
}
