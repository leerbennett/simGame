package com.leerbennett.odata.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.leerbennett.odata.entities.Member;

public interface MemberRepository extends CrudRepository<Member, Integer> {

    List<Member> findByLastName(String lastName);

}