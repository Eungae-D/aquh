package com.ssafy.team8alette.member.model.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "member")
public class Member {

	@Id
	@GeneratedValue
	@Column(name = "member_number", nullable = false)
	private Long memberNumber;

	@Column(name = "member_id", nullable = false)
	private String memberId;

	@Column(name = "member_email", nullable = false)
	private String memberEmail;

	@Column(name = "member_password", nullable = false)
	private String memberPassword;

	@Column(name = "member_nickname", nullable = false)
	private String memberNickname;

	@Column(name = "member_name", nullable = false)
	private String memberName;

	@Column(name = "member_intro")
	private String memberIntro;

	@Column(name = "member_state", nullable = false)
	private int memberState;

//	@Enumerated(EnumType.STRING)
	@Column(name = "member_type", nullable = false)
	private String memberType;

	@Column(name = "is_email_authentication", nullable = false)
	private boolean isEmailVerified;

	@Column(name = "is_email_receive", nullable = false)
	private boolean isEmailReceive;

}
