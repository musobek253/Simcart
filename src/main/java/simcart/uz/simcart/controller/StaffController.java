package simcart.uz.simcart.controller;

import simcart.uz.simcart.payload.ApiResponse;
import simcart.uz.simcart.payload.StaffDto;
import simcart.uz.simcart.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/staff")
public class StaffController {

    @Autowired
    StaffService staffService;

    //staff qo'shish
    @PreAuthorize(value = "hasAnyRole('ROLE_DIRECTOR','ROLE_MANAGER')")
    @PostMapping
    public HttpEntity<?> addStaff(@RequestBody StaffDto staffDto) {
        ApiResponse response = staffService.addStaff(staffDto);
        return ResponseEntity.status(response.isSuccess() ? 200 : 409).body(response);
    }
}
