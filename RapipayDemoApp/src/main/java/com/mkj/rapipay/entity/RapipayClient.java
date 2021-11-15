package com.mkj.rapipay.entity;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class RapipayClient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int clientId;
	private String clientName;
	private String password;
	private int balance;
	private int cashback;
	@Embedded
	private BankInfo bankInfo;
}
