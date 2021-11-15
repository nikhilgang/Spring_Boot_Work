package com.mkj.rapipay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkj.rapipay.dto.ClientBankInfoDTO;
import com.mkj.rapipay.dto.RapipayClientDTOUser;
import com.mkj.rapipay.entity.RapipayClient;
import com.mkj.rapipay.repository.RapipayClientRepository;

@Service
public class RapipayCLientServiceImpl implements IRapipayClientService {

	@Autowired
	private RapipayClientRepository rapipayClientRepository;
	
	@Override
	public RapipayClientDTOUser registerClient(RapipayClient client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RapipayClientDTOUser getCLientBasedOnId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientBankInfoDTO getClintBankInfo(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
