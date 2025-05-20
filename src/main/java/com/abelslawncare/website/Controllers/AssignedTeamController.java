package com.abelslawncare.website.Controllers;

import com.abelslawncare.website.Services.AssignedTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assignedteam")
public class AssignedTeamController {

    @Autowired
    private AssignedTeamService service;
}
