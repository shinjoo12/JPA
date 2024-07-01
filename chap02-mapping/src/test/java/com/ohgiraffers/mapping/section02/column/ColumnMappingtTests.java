package com.ohgiraffers.mapping.section02.column;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.*;

public class ColumnMappingtTests {

    private static EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @BeforeAll
    public static void initFactory(){
        //entityManagerFactory this가 안붙는 이유는 static 있어서
        entityManagerFactory = Persistence.createEntityManagerFactory("jpatest");
    }
    @BeforeEach
    public void initManager(){
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    @AfterEach
    public void closeManager(){
        this.entityManager.close();

    }
    @AfterAll
    public static void closeFactory(){
        entityManagerFactory.close();
    }

    @Test
    public void 컬럼에서_사용하는_속성_테스트(){
        //given
        Member member = new Member();
        member.setMemberNo(1);
        member.setMemberId("홍길동");
        member.setMemberPwd("pass01");
        member.setNickName("user01");
        member.setAddress("강남구");
        member.setPhone("001");
        member.setMemberRole("게스트");
        member.setStatus("Y");

        //when
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(member);
        transaction.commit();

        //then
        Member foundMember = entityManager.find(Member.class,member.getMemberNo());
        Assertions.assertEquals(member.getMemberNo(),foundMember.getMemberNo());

    }


}
