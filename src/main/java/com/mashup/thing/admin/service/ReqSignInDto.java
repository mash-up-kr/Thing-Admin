package com.mashup.thing.admin.service;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ReqSignInDto {

    @NotNull
    private String adminId;

    @NotNull
    private String adminPassword;

}
