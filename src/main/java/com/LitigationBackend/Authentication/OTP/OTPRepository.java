package com.LitigationBackend.Authentication.OTP;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OTPRepository extends JpaRepository<OTP, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM otp WHERE req_time >= CURRENT_TIMESTAMP - INTERVAL " +
            "5 MINUTE AND username = :username ORDER BY req_time DESC  LIMIT 1")
    OTP validOTP(@Param("username") String username);
}