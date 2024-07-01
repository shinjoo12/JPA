package com.ohgiraffers.mapping.section01.entity;


import jakarta.persistence.*;

import java.util.Date;

/*
* @Entity 어노테이션은 jpa에서 사용되는 엔티티 클래스임을 표시한다.
* 이 어노테이션을 사용하면 해당 클래스가 데이터베이스의 테이블과 매핑된다.
* @entity 어노테이션은 클래스 선언 위에 위치해야 한다.
* 또한 , name 속성을 사용하여 엔티티의 이름을 지정해줄 수 있으며,
* 생략하면 자동으로 클래스 이름을 엔티티명으로 사용한다.
*
* -프로젝트 내에 다른 패키지에도 동일한 엔티티가 존재하는 경우 해당 엔티티를 식별하기 위한 중복되지 않는
* name을 지정해주어야 한다.
* -기본 생성자는 필수로 작성해야한다.
* -final클래스 ,enum,interface,inner class에서는 사용할수 없다.
* -저장할 필드에 final을 사용하면 안된다.
* */

//Entity name 생략가능
@Entity(name = "member_section01")
@Table(name = "tbl_member_section01")
public class Member {


    @Id //primary key
    //member_no를 memberNo 로 매핑
    @Column(name = "member_no")
    private int memberNo;

    @Column(name = "member_id")
    private String memberId;

    @Column(name = "member_pwd")
    private String memberPwd;

    @Column(name = "nickName")
    private String nickName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "enroll_date")
    private Date enrollDte;

    @Column(name = "member_role")
    private String memberRole;

    @Column(name = "status")
    private String status;

    public Member() {
    }

    public Member(int memberNo, String memberId, String nickName, String memberPwd, String phone, String address, Date enrollDte, String memberRole, String status) {
        this.memberNo = memberNo;
        this.memberId = memberId;
        this.nickName = nickName;
        this.memberPwd = memberPwd;
        this.phone = phone;
        this.address = address;
        this.enrollDte = enrollDte;
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

    public Date getEnrollDte() {
        return enrollDte;
    }

    public void setEnrollDte(Date enrollDte) {
        this.enrollDte = enrollDte;
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
                ", enrollDte=" + enrollDte +
                ", memberRole='" + memberRole + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
