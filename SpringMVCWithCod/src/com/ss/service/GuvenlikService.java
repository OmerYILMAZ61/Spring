package com.ss.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ss.dao.DAO;

@Service
@Transactional
public class GuvenlikService {

	public String merhabaDe() {

		System.out.println("Merhaba");
		return "Merhaba";

	}
	
	public void veriEkle(){
		DAO dao = new DAO();
	}
	
}
