package TP15;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TP15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectMapper objectMapper = new ObjectMapper();
		String path = "src\\main\\java\\Archivo\\TP15.json";
		File reader = new File(path);
		try {
			Promocion promo1=objectMapper.readValue(reader, Promocion.class);
			System.out.println(promo1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
