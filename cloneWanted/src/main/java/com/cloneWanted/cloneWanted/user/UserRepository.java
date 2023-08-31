package com.cloneWanted.cloneWanted.user;

import com.cloneWanted.cloneWanted.user.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Member,Long> {
    Optional<Member> findByPhoneNumber(String PhoneNumber);
}
