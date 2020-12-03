package com.yaser.domain;

public class Kasa {
	private String model;
	private String uretici;
	private String malzeme;

	public Kasa(String model, String uretici, String malzeme) {
		this.model = model;
		this.uretici = uretici;
		this.malzeme = malzeme;
	}

	public void bilgisayarAc() {
		System.out.println("Bilgisayar aciliyor...");
	}

	public String getModel() {
		return model;
	}

	public String getUretici() {
		return uretici;
	}

	public String getMalzeme() {
		return malzeme;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setUretici(String uretici) {
		this.uretici = uretici;
	}

	public void setMalzeme(String malzeme) {
		this.malzeme = malzeme;
	}

}
