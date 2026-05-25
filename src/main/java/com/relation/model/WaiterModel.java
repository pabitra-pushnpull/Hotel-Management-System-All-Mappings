package com.relation.model;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "waiter")
@Component
public class WaiterModel {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int experienceYears;
    private String section;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private ManagerModel manager;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
        name = "waiter_customer",
        joinColumns = @JoinColumn(name = "waiter_id"),
        inverseJoinColumns = @JoinColumn(name = "customer_id")
    )
    private Set<CustomerModel> customers = new HashSet<>() ;
    
    
}
