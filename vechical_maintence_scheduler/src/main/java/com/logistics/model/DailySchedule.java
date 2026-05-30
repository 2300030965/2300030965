package com.logistics.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "daily_schedules")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DailySchedule {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private Integer depotId;
    
    @Column(nullable = false)
    private LocalDate scheduleDate;
    
    @Column(nullable = false)
    private Double availableMechanicHours;
    
    @Column(nullable = false)
    private Double utilisedMechanicHours;
    
    @Column(nullable = false)
    private Integer totalImportanceScore;
    
    @Column(nullable = false)
    private String status;
}
