package com.cloneWanted.cloneWanted.user;

import com.cloneWanted.cloneWanted.user.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<Member> findAll(){
        List<Member> members = new ArrayList<>();
        for(Member e : repository.findAll()){
            members.add(e);
        }
        return members;
    }

    public String findByPhoneNumber(String PhoneNumber){
        Optional<Member> member = repository.findByPhoneNumber(PhoneNumber);
        return member.get().getEmail();
    }

    public Member save(Member member){
        repository.save(member);
        return member;
    }

    public void updateById(Long id, Member member){
        Optional<Member> e = repository.findById(id);
        if(e.isPresent()){
            e.get().setId(member.getId());
            e.get().setName(member.getName());
            e.get().setEmail(member.getEmail());
            e.get().setPhoneNumber(member.getPhoneNumber());
            e.get().setPassword(member.getPassword());
            e.get().setMember(member.getMember());
            repository.save(member);
        }
    }


}
