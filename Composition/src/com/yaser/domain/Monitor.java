package com.yaser.domain;

public class Monitor {
	private String model;
	private String uretici;
	private String boyut;
	private Resulution resulution;

	public Monitor(String model, String uretici, String boyut, Resulution resulution) {
		this.model = model;
		this.uretici = uretici;
		this.boyut = boyut;
		this.resulution = resulution;
	}

	public void monitoruKapat() {
		System.out.println("Monitor Kapatildi.");
	}

	public String getModel() {
		return model;
	}

	public String getUretici() {
		return uretici;
	}

	public String getBoyut() {
		return boyut;
	}

	public Resulution getResulution() {
		return resulution;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setUretici(String uretici) {
		this.uretici = uretici;
	}

	public void setBoyut(String boyut) {
		this.boyut = boyut;
	}

	public void setResulution(Resulution resulution) {
		this.resulution = resulution;
	}

}
