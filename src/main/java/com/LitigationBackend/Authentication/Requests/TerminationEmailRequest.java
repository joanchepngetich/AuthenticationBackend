package com.LitigationBackend.Authentication.Requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TerminationEmailRequest {


    private String emailType;


    private String recipientEmail;
}
