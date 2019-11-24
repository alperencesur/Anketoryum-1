package com.anket.Anketoryum.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;


// Common Service her sayfada kullanabileceğimiz fonksiyonlar. Mesela şuanki zaman gibi.
@Service
public class CommonService {	
	public String getDate() {
		DateFormat dateFormat = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		Date date = new Date();
		String strDate = dateFormat.format(date); 
		return strDate;
	}
}
