package com.ohgiraffers.mapping.section06.compositekey;


import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;



//Entity name 생략가능
@Entity(name = "member_section06")
@Table(name = "tbl_member_section06")


public class Member {


    @EmbeddedId
    private MemberPK memberNo;


    @Column(name = "member_pwd")
    private String memberPwd;

    @Column(name = "nickName")
    private String nickName;

    public Member() {
    }

    public Member(MemberPK memberNo, String memberPwd, String nickName) {
        this.memberNo = memberNo;
        this.memberPwd = memberPwd;
        this.nickName = nickName;
    }

    public MemberPK getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(MemberPK memberNo) {
        this.memberNo = memberNo;
    }

    public String getMemberPwd() {
        return memberPwd;
    }

    public void setMemberPwd(String memberPwd) {
        this.memberPwd = memberPwd;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberNo=" + memberNo +
                ", memberPwd='" + memberPwd + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}

