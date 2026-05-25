package com.relation.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "manager")
public class ManagerModel {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String shift;
    private double salary;

    @OneToMany(mappedBy = "manager", cascade = CascadeType.ALL)
    private List<WaiterModel> waitersList;
    
    @OneToOne(mappedBy = "managerModel")
    private OwnerModel ownerModel;
    
}
