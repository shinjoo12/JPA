package com.ohgiraffers.mapping.section06.idclass;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

// 복합키 설정

public class MemberPK implements Serializable { // Serializable 직렬화


    private int memberNo;
    private String memberId;

    public MemberPK() {
    }

    public MemberPK(int memberNo, String memberId) {
        this.memberNo = memberNo;
        this.memberId = memberId;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "MemberPk{" +
                "memberNo=" + memberNo +
                ", memberId='" + memberId + '\'' +
                '}';
    }
//해시 함수 또는 해시 알고리즘 또는 해시함수알고리즘은 임의의 길이의 데이터를 고정된 길이의 데이터로 매핑하는 함수이다
    @Override
    public int hashCode() {
        return Objects.hash(memberNo,memberId);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MemberPK memberPK = (MemberPK) obj;

        return memberNo ==memberPK.memberNo && Objects.equals(memberId, memberPK.getMemberId());
    }
}
