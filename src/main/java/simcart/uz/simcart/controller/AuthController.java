package simcart.uz.simcart.controller;

import simcart.uz.simcart.payload.ApiResponse;
import simcart.uz.simcart.payload.LoginDto;
import simcart.uz.simcart.service.MyAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    MyAuthService authService;

    @PostMapping("/loginforStaff")
    public HttpEntity<?> loginForStaff(@RequestBody LoginDto loginDto) {
        ApiResponse response = authService.loginForStaff(loginDto);

        return ResponseEntity.status(response.isSuccess() ? 200 : 409).body(response);
    }

    //mobile app //browser shaxsiy kabinetga
    @PostMapping("/loginforClient")
    public HttpEntity<?> loginForClient(@RequestBody LoginDto loginDto) {
        ApiResponse response = authService.loginForClient(loginDto);

        return ResponseEntity.status(response.isSuccess() ? 200 : 409).body(response);
    }


}
