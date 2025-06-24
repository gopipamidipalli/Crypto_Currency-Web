package com.gopiEx.SpringBootWebCrypto.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class UserData {
    @Id
    private String username;
    private String email;
    private String password;

}
