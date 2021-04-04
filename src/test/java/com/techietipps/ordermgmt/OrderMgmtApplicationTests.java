package com.techietipps.ordermgmt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@Profile("test")
@ActiveProfiles("test")
class OrderMgmtApplicationTests {

	@Value("${sample}")
	private String sampleProp;


	@Test
	void contextLoads() {
		System.out.println("Context loads with test profile");

		System.out.println("Now printing the sampleProp from test profile: "+sampleProp);
	}

}
