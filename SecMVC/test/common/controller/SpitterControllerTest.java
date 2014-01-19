package common.controller;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;
import org.springframework.validation.BindingResult;
import org.springframework.web.multipart.MultipartFile;

import static org.mockito.Mockito.*;

import common.domain.Spitter;
import common.repository.SpitDAO;

public class SpitterControllerTest {

	//@Before
	
	@Test
	public void shouldCreateSpitterProfile() {
		SpitterController sc = new SpitterController();
		HashMap<String,Object> model = new HashMap<String, Object>();
		//String viewName = sc.createSpitterProfile(model);
	//assertEquals("spitters/edit", viewName);
	}
	
	@Test
	public void shouldAddUserTest() {
		
//		Spitter spitter = new Spitter();
//		spitter.setUserName("Alex");
//		
//		SpitDAO spitDaoMock = mock(SpitDAO.class);
//		SpitterController sc = new SpitterController();
//		sc.setSpitDao(spitDaoMock);
//				
//		
//		BindingResult bindingResult = mock(BindingResult.class);
//		MultipartFile img = mock(MultipartFile.class);
//		String viewName = sc.addSpitterFromForm( spitter, bindingResult, img);
//			      
//	    assertEquals("/spitters/" + spitter.getUserName(), viewName);
//				
	}

}
