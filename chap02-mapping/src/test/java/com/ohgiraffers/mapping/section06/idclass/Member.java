package com.ohgiraffers.mapping.section06.idclass;


import jakarta.persistence.*;



//Entity name 생략가능
@Entity(name = "member_section06_Idclass")
@Table(name = "tbl_member_section06_Idclass")
@IdClass(MemberPK.class)


public class Member {
    @Id
    @Column(name ="member_no" )
    private MemberPK memberNo;

    @Id
    @Column(name ="member_id" )
    private MemberPK memberId;


    @Column(name = "member_pwd")
    private String memberPwd;

    @Column(name = "nickName")
    private String nickName;

    public Member() {
    }

    public Member(MemberPK memberNo, MemberPK memberId, String memberPwd, String nickName) {
        this.memberNo = memberNo;
        this.memberId = memberId;
        this.memberPwd = memberPwd;
        this.nickName = nickName;
    }

    public MemberPK getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(MemberPK memberNo) {
        this.memberNo = memberNo;
    }

    public MemberPK getMemberId() {
        return memberId;
    }

    public void setMemberId(MemberPK memberId) {
        this.memberId = memberId;
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
                ", memberId=" + memberId +
                ", memberPwd='" + memberPwd + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}

