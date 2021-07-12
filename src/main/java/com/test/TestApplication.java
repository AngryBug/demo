package com.test;

import java.math.BigDecimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.mapper.ModelMapper;
import com.test.models.CopyModel;
import com.test.models.OriginalModel;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
		
		OriginalModel o = new OriginalModel("anc", 25, "abc@xyz.com", new BigDecimal(500));
		
		CopyModel c = ModelMapper.INSTANCE.mapOriginal2Copy(o);
		
		System.out.println(c);
		
	}

}
