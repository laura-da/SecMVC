package common.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import common.domain.Spitter;
import common.repository.SpitDAO;

import static org.mockito.Mockito.*;

public class HomeControllerTest {

	@Test
	public void shouldDisplayHomeTest() {
		ArrayList<Spitter> expectedValue = new ArrayList<Spitter>();
		expectedValue.add(new Spitter());
	 	
		SpitDAO sDAO = mock(SpitDAO.class);
		when(sDAO.findAllSpitters()).thenReturn(expectedValue);
		
	    HomeController controller = 
                new HomeController(); //<co id="co_createController"/>
	    controller.setsDao(sDAO);
 
	    HashMap<String, Object> model = new HashMap<String, Object>();
	    String viewName = controller.showHomePage(model); //<co id="co_callShowHomePage"/>
 
	    assertEquals("home", viewName);
		
	}

}
