package com.ras.grad;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@WebMvcTest
class JenGradApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testGreetingEndPoint() throws Exception{

		String name = "Rashmi Ranjan Swain";
		mockMvc.perform(MockMvcRequestBuilders.get("/greetings/{name}", name))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Hello " + name.split(" ")[0] + " Congratulations you have successfully completed Jenkins CI/CD demo !"));

	}

}
