package com.relation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relation.model.ManagerModel;
import com.relation.model.OwnerModel;
import com.relation.model.WaiterModel;
import com.relation.repository.OwnerRepository;

@Service
public class OwnerService {

	    @Autowired
	    private OwnerRepository ownerRepository;
	    
	    public List<OwnerModel> getAllOwners() {
			return ownerRepository.findAll();
		}

	    public void createOwner(OwnerModel owner) {

//	        ManagerModel manager = owner.getManagerModel();
//
//	        if (manager != null) {
//
//	            // 🔴 Fix Owner ↔ Manager (One-to-One)
//	            manager.setOwnerModel(owner);
//
//	            if (manager.getWaitersList() != null) {
//
//	                for (WaiterModel waiter : manager.getWaitersList()) {
//
//	                    // 🔴 Fix Manager ↔ Waiter (One-to-Many)
//	                    waiter.setManager(manager);
//
//	                    // Optional: fix Many-to-Many inverse side
//	                    if (waiter.getCustomers() != null) {
////	                        waiter.getCustomers()
////	                              .forEach(c -> c.getWaiters().add(waiter));
//	                        for (CustomerModel customer : waiter.getCustomers()) {
//
//	                            if (customer.getWaiters() == null) {
//	                                customer.setWaiters(new HashSet<>());
//	                            }
//
//	                            customer.getWaiters().add(waiter);
//	                        }
//	                    }
//	                }
//	            }
//	        }
//	        ownerRepository.save(owner);
	        
	        
	        
	        
	        
	        
	        ManagerModel manager = owner.getManagerModel();
	        manager.setOwnerModel(owner);

	        for (WaiterModel waiter : manager.getWaitersList()) {
	            waiter.setManager(manager);
	            // NO need to touch customer.waiters
	        }

	        ownerRepository.save(owner);
	    }
	

	
}
