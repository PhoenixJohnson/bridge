package com.indoor.data.entities;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Payment {

    private Long paymentId;
    private String paymentStatus;
    private String paymentSource;
    private String paymentRefId;
    private String currency;
    private Double amount;
    private Date creationDate;
    private Date lastModifiedDate;
}
