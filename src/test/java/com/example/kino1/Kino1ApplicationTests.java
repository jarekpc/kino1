package com.example.kino1;

import com.example.kino1.com.example.domain.Bilet;
import com.example.kino1.com.example.domain.Widz;
import com.example.kino1.com.example.repository.BiletRepository;
import com.example.kino1.com.example.repository.WidzRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

//@RunWith(SpringRunner.class)
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class Kino1ApplicationTests {

	@Autowired
	WidzRepository widzRepository;

	@Autowired
	BiletRepository biletRepository;

	@Before
	public void setUp(){
		Bilet bilet = new Bilet();
		bilet.setId_seans(1);
		bilet.setId_widz(1);
		bilet.setType("Normalny");
		biletRepository.save(bilet);

	}

	@Test
	public void contextLoads() {
		List<Widz> widzList = (ArrayList<Widz>) widzRepository.findAll();
		assertEquals(widzList.size(),1);

	}

	@Test
	public void checkTicket(){
		List<Bilet> bilets = (ArrayList<Bilet>)biletRepository.findAll();
		assertEquals(bilets.size(),2);
	}

	public void testCRUD(){

	}

}
