package com.example.springjpaproject.user;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class MemberRepository {
    @PersistenceContext
    private EntityManager em;

    public long save(Member m){
        em.persist(m);
        return m.getId();
    }

    public Member find(long id){
        return em.find(Member.class, id);
    }
}
