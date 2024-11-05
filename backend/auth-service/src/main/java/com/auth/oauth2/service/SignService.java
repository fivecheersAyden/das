package com.auth.auth1074.service;

import com.example.common.dto.ResponseBean;

public interface SignService {
    ResponseBean signInCheck(String phoneNum, String password);

    ResponseBean getPhoneCode(String phoneNum, int mode);

    ResponseBean signUp(String phoneNum, int mode, String code, String password);

    ResponseBean resetPassword(String phoneNum, int mode, String code, String newPassword);

    ResponseBean getUserId(String token);
}
