package com.LitigationBackend.Authentication.OTP;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;

@Service
@Slf4j
public class OTPService {
    @Autowired
    private OTPRepository otpRepository;

    public String generateOTP(String username)  {
        Integer otp = 1000 + new Random().nextInt(9000);
        OTP otpCode = new OTP();
        log.info("OTP code is {}",otp);
        otpCode.setOtp(otp);
        otpCode.setRequestedTime(new Date());
        otpCode.setUsername(username);
        otpCode.setSn(null);
        otpRepository.save(otpCode);
        return otp.toString();
    }
}