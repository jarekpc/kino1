package com.example.kino1;

import com.example.kino1.com.example.domain.Bilet;
import com.example.kino1.com.example.domain.Cena;
import com.example.kino1.com.example.domain.Kasjer;
import com.example.kino1.com.example.domain.Type;
import com.example.kino1.com.example.repository.BiletRepository;
import com.example.kino1.com.example.repository.CenaRepository;
import com.example.kino1.com.example.repository.KasjerRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

//@RunWith(SpringRunner.class)
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class Kino1ApplicationTests {

	@Autowired
	BiletRepository biletRepository;

	@Autowired
	KasjerRepository kasjerRepository;

	@Autowired
	CenaRepository cenaRepository;

	@Before
	public void setUp(){
		Kasjer kasjer = new Kasjer();
		kasjer.setFirstName("Tomek");
		kasjer.setLastName("Kowalski");
		kasjerRepository.save(kasjer);

		Bilet b1 = new Bilet();
		b1.setType(Type.NORMALNY);
		b1.setKasjer(kasjer);

		Bilet b2 = new Bilet();
		b2.setType(Type.ULGOWY);
		b2.setKasjer(kasjer);

		Set<Bilet> s = new HashSet<Bilet>();
		s.add(b1);
		s.add(b2);
		kasjer.setBiletSet(s);
		biletRepository.save(b1);
		biletRepository.save(b2);

		Cena c = new Cena();
		//c.setBilet(b2);
		c.setKoszt(new BigDecimal(99));
		cenaRepository.save(c);

	}

	@Test
	public void contextLoads() {
		/*
		List<Widz> widzList = (ArrayList<Widz>) widzRepository.findAll();
		assertEquals(widzList.size(),1);
		*/
	}

	@Test
	public void checkTicket(){
		List<Bilet> bilets = (ArrayList<Bilet>)biletRepository.findAll();
		assertEquals(bilets.size(),3);
	}

	public void testCRUD(){

	}

}
