package com.example.kino1;

import com.example.kino1.com.example.domain.*;
import com.example.kino1.com.example.repository.BiletRepository;
import com.example.kino1.com.example.repository.CenaRepository;
import com.example.kino1.com.example.repository.KasjerRepository;
import com.example.kino1.com.example.repository.SeansRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class Kino1ApplicationTests {

	@Autowired
	BiletRepository biletRepository;

	@Autowired
	KasjerRepository kasjerRepository;

	@Autowired
	CenaRepository cenaRepository;

	@Autowired
	SeansRepository seansRepository;

	@Before
	public void setUp(){
		Kasjer kasjer = new Kasjer("Tomek","Kowalski");
		kasjerRepository.save(kasjer);

		Bilet b1 = new Bilet(Type.NORMALNY,kasjer);
		Cena c = new Cena(b1,new BigDecimal(88));
		biletRepository.save(b1);
		cenaRepository.save(c);

		Seans seans = new Seans("Film P", b1);
		seansRepository.save(seans);

	}

	@Test
	public void checkTicket(){
		List<Bilet> bilets = (ArrayList<Bilet>)biletRepository.findAll();
		assertEquals(3,3);
	}

	@Test
	public void checkKasjer(){
		List<Kasjer> kasjers = (ArrayList<Kasjer>)kasjerRepository.findAll();
		assertEquals(kasjers.size(),4);
	}

	@Test
	public void checkCena(){
		List<Cena> cenas = (ArrayList<Cena>)cenaRepository.findAll();
		assertEquals(cenas.size(),3);
	}

	@Test
	public void checkSeans(){
		List<Seans> seans = (ArrayList<Seans>)seansRepository.findAll();
		assertEquals(seans.size(),2);
	}
}
