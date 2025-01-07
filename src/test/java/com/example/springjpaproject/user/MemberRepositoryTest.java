package com.example.springjpaproject.user;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberRepositoryTest {
    @Autowired MemberRepository memberRepository;

    @Test
    public void testMember() throws Exception
    {
        Member m = new Member();
        m.setUsername("Sally");
        long saved_id = memberRepository.save(m);

        Member fm = memberRepository.find(saved_id);

        Assertions.assertThat(fm.getId()).isEqualTo(m.getId());
        Assertions.assertThat(fm.getUsername()).isEqualTo(m.getUsername());
    }
}