package com.yaser.domain;

public class Anakart {
	private String model;
	private String uretici;
	private int yuvaSayisi;
	private String isletimSistemi;

	public Anakart(String model, String uretici, int yuvaSayisi, String isletimSistemi) {
		this.model = model;
		this.uretici = uretici;
		this.yuvaSayisi = yuvaSayisi;
		this.isletimSistemi = isletimSistemi;
	}

	public void isletimSistemiYukle(String isletimSistemi) {
		this.isletimSistemi=isletimSistemi;
		System.out.println("Isletim sistemi yüklendi : " + isletimSistemi);

	}

	public String getModel() {
		return model;
	}

	public String getUretici() {
		return uretici;
	}

	public int getYuvaSayisi() {
		return yuvaSayisi;
	}

	public String getIsletimSistemi() {
		return isletimSistemi;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setUretici(String uretici) {
		this.uretici = uretici;
	}

	public void setYuvaSayisi(int yuvaSayisi) {
		this.yuvaSayisi = yuvaSayisi;
	}

	public void setIsletimSistemi(String isletimSistemi) {
		this.isletimSistemi = isletimSistemi;
	}

}
