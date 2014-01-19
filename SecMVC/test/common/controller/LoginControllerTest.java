////http://java.dzone.com/articles/junit-testing-spring-mvc-1
//	
//package common.controller;
//
//
//import static org.springframework.test.web.server.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.server.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.server.result.MockMvcResultMatchers.forwardedUrl;
//import static org.springframework.test.web.server.result.MockMvcResultMatchers.redirectedUrl;
//import static org.springframework.test.web.server.result.MockMvcResultMatchers.status;
////import static org.springframework.test.web.server.samples.context.SecurityRequestPostProcessors.user;
////import static org.springframework.test.web.server.samples.context.SecurityRequestPostProcessors.userDeatilsService;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//import junit.framework.Assert;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContext;
//import org.springframework.security.web.FilterChainProxy;
//import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.web.server.MockMvc;
//import org.springframework.test.web.server.MvcResult;
//import org.springframework.test.web.server.ResultMatcher;
//import org.springframework.test.web.server.request.RequestPostProcessor;
//import org.springframework.test.web.server.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
///**
//* Basic example that includes Spring Security configuration.
//*
//* <p>Note that currently there are no {@link ResultMatcher}' built specifically
//* for asserting the Spring Security context. However, it's quite easy to put
//* them together as shown below and Spring Security extensions will become
//* available in the near future.
//*
//* <p>This also demonstrates a custom {@link RequestPostProcessor} which authenticates
//* a user to a particular {@link HttpServletRequest}.
//*
//* <p>Also see the Javadoc of {@link GenericWebContextLoader}, a class that
//* provides temporary support for loading WebApplicationContext by extending
//* the TestContext framework.
//*
//* @author Rob Winch
//* @author Rossen Stoyanchev
//* @see SecurityRequestPostProcessors
//*/
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(
//                loader=WebContextLoader.class,
//                value={
//                        "classpath:org/springframework/test/web/server/samples/context/security.xml",
//                        "classpath:org/springframework/test/web/server/samples/servlet-context.xml"
//                })
//public class SpringSecurityTests {
//
//        private static String SEC_CONTEXT_ATTR = HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY;
//
//        @Autowired
//        private FilterChainProxy springSecurityFilterChain;
//
//        @Autowired
//        private WebApplicationContext wac;
//
//        private MockMvc mockMvc;
//
//        @Before
//        public void setup() {
//                this.mockMvc = MockMvcBuilders.webApplicationContextSetup(this.wac)
//                                .addFilters(this.springSecurityFilterChain).build();
//        }
//
//        @Test
//        public void requiresAuthentication() throws Exception {
//                mockMvc.perform(get("/user"))
//                        .andExpect(redirectedUrl("http://localhost/spring_security_login"));
//        }
//
//        @Test
//        public void accessGranted() throws Exception {
//                this.mockMvc.perform(get("/").with(userDeatilsService("user")))
//                        .andExpect(status().isOk())
//                        .andExpect(forwardedUrl("/WEB-INF/layouts/standardLayout.jsp"));
//        }
//
//        @Test
//        public void accessDenied() throws Exception {
//                this.mockMvc.perform(get("/").with(user("user").roles("DENIED")))
//                        .andExpect(status().isForbidden());
//        }
