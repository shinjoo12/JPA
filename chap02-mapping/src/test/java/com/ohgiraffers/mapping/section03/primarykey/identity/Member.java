package com.ohgiraffers.mapping.section03.primarykey.identity;


import jakarta.persistence.*;

import java.util.Date;



//Entity name 생략가능
@Entity(name = "member_section03")
@Table(name = "tbl_member_section03")
public class Member {


    @Id
    //member_no를 memberNo 로 매핑
    @Column(name = "member_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberNo;

    @Column(name = "member_id")
    private String memberId;

    @Column(name = "member_pwd")
    private String memberPwd;

    @Column(name = "nickName")
    @Transient
    private String nickName;

    //010-000-0000 기본값은 이건데 길이 200.....
    @Column(name = "phone",columnDefinition ="varchar(200) default '010-000-0000'")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "enroll_date")
    //
    @Temporal(TemporalType.TIMESTAMP)
//    @Temporal(TemporalType.DATE)
//    @Temporal(TemporalType.TIME)
    private Date enrollDate;

    @Column(name = "member_role",nullable = false)
    private String memberRole;

    @Column(name = "status")
    private String status;

    public Member() {
    }

    public Member(int memberNo, String memberId, String nickName, String memberPwd, String phone, String address, Date enrollDate, String memberRole, String status) {
        this.memberNo = memberNo;
        this.memberId = memberId;
        this.nickName = nickName;
        this.memberPwd = memberPwd;
        this.phone = phone;
        this.address = address;
        this.enrollDate = enrollDate;
        this.memberRole = memberRole;
        this.status = status;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDte) {
        this.enrollDate = enrollDte;
    }

    public String getMemberRole() {
        return memberRole;
    }

    public void setMemberRole(String memberRole) {
        this.memberRole = memberRole;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberNo=" + memberNo +
                ", memberId='" + memberId + '\'' +
                ", memberPwd='" + memberPwd + '\'' +
                ", nickName='" + nickName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", enrollDte=" + enrollDate +
                ", memberRole='" + memberRole + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}