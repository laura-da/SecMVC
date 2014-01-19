package common.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.jdbc.JdbcTestUtils;


import common.domain.Spitter;
import common.domain.Spittle;
import common.repository.SpitDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="test-context.xml")
public class SpitDAOTest {

	@Autowired
	SpitDAO sDao;
	
	@Before
	public void setupSpitters() {
		Spitter s = new Spitter();
		sDao.addSpitter(s);
		Spittle sl = new Spittle(s);
		sDao.addSpittle(sl);
	}
	
	@Test
	public void shouldFindAllSpittersTest() {
		//List<Spitter> expected;
		List<Spitter> spitters;		
		spitters = sDao.findAllSpitters();
		assertTrue("spitters is not null", spitters.size() >0 );
	}

	@Test
	public void shouldGetAllSpittlesForSpitter() {
		List<Spittle> spits;
		List<Spitter> spitters;		
		spitters = sDao.findAllSpitters();
		
		spits = sDao.getSpittlesForSpitter(spitters.get(0));
		assertTrue("spittles are not null", spits.size()>0);
		
	}

//	@Test
//	public void shouldSaveSpitter(Spitter s) {
//		sDao.addSpitter(s);
//	}
}
