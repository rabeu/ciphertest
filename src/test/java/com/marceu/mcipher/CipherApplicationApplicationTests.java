package com.marceu.mcipher;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CipherApplicationTests {

	@Autowired
	private CipherController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

	@Test
	void testCeasarEncipher(){
		
		final CipherModel cipherModelMock = new CipherModel("Caesar", "THEXQUICKXBROWNXFOXXJUMPSXOVERXTHEXLAZYXDOG", "QEBUNRFZHUYOLTKUCLUUGRJMPULSBOUQEBUIXWVUALD", -3);

		final CipherModel cipherModelResult = controller.ceasarEncipher("THEXQUICKXBROWNXFOXXJUMPSXOVERXTHEXLAZYXDOG", -3);	

		assertThat(cipherModelMock.getCipherText()).isEqualTo(cipherModelResult.getCipherText());

	}

	@Test
	void testCeasarDecipher(){
		
		final CipherModel cipherModelMock = new CipherModel("Caesar", "QEBUNRFZHUYOLTKUCLUUGRJMPULSBOUQEBUIXWVUALD", "THEXQUICKXBROWNXFOXXJUMPSXOVERXTHEXLAZYXDOG", -3);

		final CipherModel cipherModelResult = controller.ceasarDecipher("QEBUNRFZHUYOLTKUCLUUGRJMPULSBOUQEBUIXWVUALD", -3);

		assertThat(cipherModelMock.getCipherText()).isEqualTo(cipherModelResult.getCipherText());

	}

	@Test
	void testAtbashEncipher(){
		
		final CipherModel cipherModelMock = new CipherModel("Atbash", "THEXQUICKXBROWNXFOXXJUMPSXOVERXTHEXLAZYXDOG", "GSVCJFRXPCYILDMCULCCQFNKHCLEVICGSVCOZABCWLT");

		final CipherModel cipherModelResult = controller.atbashEncipher("THEXQUICKXBROWNXFOXXJUMPSXOVERXTHEXLAZYXDOG");

		assertThat(cipherModelMock.getCipherText()).isEqualTo(cipherModelResult.getCipherText());

	}


	@Test
	void testAtbashDecipher(){
		
		final CipherModel cipherModelMock = new CipherModel("Atbash", "GSVCJFRXPCYILDMCULCCQFNKHCLEVICGSVCOZABCWLT", "THEXQUICKXBROWNXFOXXJUMPSXOVERXTHEXLAZYXDOG");

		final CipherModel cipherModelResult = controller.atbashDecipher("GSVCJFRXPCYILDMCULCCQFNKHCLEVICGSVCOZABCWLT");

		assertThat(cipherModelMock.getCipherText()).isEqualTo(cipherModelResult.getCipherText());

	}

}
