package com.mkj.rapipay.dto;

import lombok.Data;

@Data
public class ClientBankInfoDTO {
	
	private int clientId;
	private String clientName;
	private String bankName;
	private int balance;

}
