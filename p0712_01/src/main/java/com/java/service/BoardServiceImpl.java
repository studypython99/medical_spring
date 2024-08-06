package com.java.service;

import java.rmi.Naming;
import java.util.ArrayList;

import javax.naming.Name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.java.dao.BoardDao;
import com.java.dto.BoardDto;

@Service // IOC 컨테이너 등록, new를 안하려고 @autowierd를 이용해서 같은것 매칭
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDao boardDao;
	
	@Override
	public void SelectCount() {
		System.out.println("BoardServiceImpl 버전1");
	}
	//버전1

	@Override
	public ArrayList<BoardDto> selectList() {

		ArrayList<BoardDto> list = boardDao.selectList();
		System.out.println("service list: "+list.size());
		
		return list;
	}
}
