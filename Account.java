package com.nazeem.multidb.mongodb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "accounts")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    private String customerId;

    private String fullName;
    private String address;
    private String email;
    private String contactNo;
}
