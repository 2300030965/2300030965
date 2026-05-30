package com.logistics.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vehicles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vehicle {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, unique = true)
    private String vehicleId;
    
    @Column(nullable = false)
    private String vehicleType;
    
    @Column(nullable = false)
    private Integer operationalImpactScore;
    
    @Column(nullable = false)
    private Double serviceDuration;
    
    @Column(nullable = false)
    private String status;
    
    @Column(nullable = false)
    private Integer depotId;
}
