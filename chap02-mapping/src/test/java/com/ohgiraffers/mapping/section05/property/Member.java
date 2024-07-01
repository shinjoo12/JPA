package com.ohgiraffers.mapping.section05.property;


import jakarta.persistence.*;


/*
* 필드 접근이 기본 값으로 해당 설정을 제거해도 동일하게 동작한다.
* 또한 필드 레벨과 프로퍼티 레벨에 모두 선언하면 프로퍼티 레벨을 우선으로 한다.
*
*
* */
//Entity name 생략가능
@Entity(name = "member_section05")
@Table(name = "tbl_member_section05")
/*
* 클래스 레벨 : 모든 필드에 대해서 Getter 접근 방식을 적용한다.
* 주의할 점은 @id 어노테이션이 필드에 있다명 엔티티를 생성하지 못하기 때문에 @id 어노테이션을 getter메소드 위로 옯겨야 한다.
* */
//1. 클래스 레벨 : 모든 필드에 대해서 필드 접근 방식을 적용한다.
@Access(AccessType.PROPERTY)
public class Member {

    //2.  필드 레벨 : 해당 필드에 대해서 필드 접근 방식을 적용한다.
    @Id
    //member_no를 memberNo 로 매핑
    @Column(name = "member_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberNo;

    @Column(name = "member_id")
    private String memberId;

    @Column(name = "member_pwd")
    private String memberPwd;

    public String getMemberPwd() {
        return memberPwd;
    }

    @Access(AccessType.PROPERTY)
    public String getNickName(){
        System.out.println("getNickName을 이용한 호출");
        return nickName = "님";
    }

    public String getMemberId() {
        return memberId;
    }

    public int getMemberNo() {
        return memberNo;
    }



    @Column(name = "nickName")

    @Transient
    private String nickName;

    public Member() {
    }

    public Member(int memberNo, String memberId, String memberPwd, String nickName) {
        this.memberNo = memberNo;
        this.memberId = memberId;
        this.memberPwd = memberPwd;
        this.nickName = nickName;
    }

}
