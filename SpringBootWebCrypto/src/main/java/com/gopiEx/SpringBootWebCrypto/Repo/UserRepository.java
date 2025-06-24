package com.gopiEx.SpringBootWebCrypto.Repo;

import com.gopiEx.SpringBootWebCrypto.Model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserData,String> {

}
