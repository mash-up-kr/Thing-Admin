package com.mashup.thing.admin;

import com.mashup.thing.admin.service.AdminService;
import com.mashup.thing.admin.service.ReqSignInDto;
import com.mashup.thing.exception.RequestNullFieldException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/v1/admin/sign-in")
    public ResponseEntity<Void> adminSignIn(@Valid @ModelAttribute ReqSignInDto reqSignInDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new RequestNullFieldException();
        }
        adminService.signIn(reqSignInDto);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
