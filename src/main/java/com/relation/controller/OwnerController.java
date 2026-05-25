package com.relation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.relation.model.OwnerModel;
import com.relation.service.OwnerService;

@RestController
public class OwnerController {

	@Autowired
	private OwnerService ownerService;
	
	@GetMapping("hotel")
	public List<OwnerModel> getAll() {
		return ownerService.getAllOwners();
	}

	@PostMapping("create")
	public String createOwner(@RequestBody OwnerModel ownerModel) {
		ownerService.createOwner(ownerModel);
		return "Added Successfully !";
	}
	
	

   /* {
        "name" : "Pabitra Panad",
        "restaurantName" : "Hotel Delicious",
        "contactNumber" : "8433872037",

        "managerModel" : {
            "name" : "Sachin Jadhav",
            "shift" : "Morning",
            "salary" : 54000,
            "waitersList" : [
                {
                    "name" : "Mukesh Karn",
                    "experienceYears" : 2,
                    "section" : "Kitchen" ,
                    "customers" : [
                        {
                            "name" : "Ashish HR",
                            "phone" : "8745785474",
                            "tableNumber" : "A1"
                        },{
                            "name" : "Kumar Bhagit",
                            "phone" : "9999988888",
                            "tableNumber" : "A2"
                        },{
                            "name" : "Swaroop Bhalerao",
                            "phone" : "2222244444",
                            "tableNumber" : "A3"
                        }
                    ]
                },{
                    "name" : "Khushboo Mali",
                    "experienceYears" : 3,
                    "section" : "Dining",
                    "customers" : [
                        {
                            "name" : "Ankita Singh",
                            "phone" : "7777755555",
                            "tableNumber" : "B1"
                        },{
                            "name" : "Ganesh Kumbhar",
                            "phone" : "1111144444",
                            "tableNumber" : "B2"
                        },{
                            "name" : "Sidhant Kadam",
                            "phone" : "3333344444",
                            "tableNumber" : "B3"
                        },{
                            "name" : "Shubham Gouda",
                            "phone" : "7738996322",
                            "tableNumber" : "B4"
                        }
                    ]
                }
            ]
        }
    }*/

}
