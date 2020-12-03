package com.yaser.program;

import com.yaser.domain.Anakart;
import com.yaser.domain.Bilgisayar;
import com.yaser.domain.Kasa;
import com.yaser.domain.Monitor;
import com.yaser.domain.Resulution;

public class DriverBilgisayar {
	public static void main(String[] args) {
		Resulution resulution=new Resulution(1920, 1080);
		Monitor monitor=new Monitor("XC56", "ASUS", "20", resulution);
		Kasa kasa=new Kasa("QWE125", "DcoN", "Karbon");
		Anakart anakart=new Anakart("Quaz", "Asus", 10, "Win 8.1");

		Bilgisayar bilgisayar=new Bilgisayar(monitor, kasa, anakart);
		bilgisayar.getKasa().bilgisayarAc();
		bilgisayar.getMonitor().monitoruKapat();
		// Compositionda has a iliskisi vardir.Bilgisayar bunlara sahiptir.
		//Inheritiance degildir.Karisiliklik olmasin diye bu örnegi yaptim.
		
	}

}
