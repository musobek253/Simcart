package simcart.uz.simcart.service;

import simcart.uz.simcart.payload.ApiResponse;
import simcart.uz.simcart.payload.StaffDto;
import simcart.uz.simcart.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService {
    @Autowired
    RoleRepository roleRepository;

    public ApiResponse addStaff(StaffDto staffDto) {

        return null;
    }
}
