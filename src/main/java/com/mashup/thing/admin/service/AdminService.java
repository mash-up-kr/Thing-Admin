package com.mashup.thing.admin.service;

import com.mashup.thing.admin.domain.AdminRepository;
import com.mashup.thing.exception.FailSingInException;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public void signIn(ReqSignInDto reqSignInDto) {

        adminRepository.findByAdminIdAndAdminPassword(reqSignInDto.getAdminId(), reqSignInDto.getAdminPassword())
                .orElseThrow(FailSingInException::new);
    }
}
