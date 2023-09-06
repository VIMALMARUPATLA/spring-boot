package com.aarvi.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "vehicles")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Vehicle extends AbstractAuditableEntity<Long> implements Serializable {
    
    @Column
    private String name;
    
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private Brand brand = Brand.FORD;
    
}
