package com.yaser.domain;

public class Bilgisayar {
	private Monitor monitor;
	private Kasa kasa;
	private Anakart anakart;

	public Bilgisayar(Monitor monitor, Kasa kasa, Anakart anakart) {
		this.monitor = monitor;
		this.kasa = kasa;
		this.anakart = anakart;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public Kasa getKasa() {
		return kasa;
	}

	public Anakart getAnakart() {
		return anakart;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public void setKasa(Kasa kasa) {
		this.kasa = kasa;
	}

	public void setAnakart(Anakart anakart) {
		this.anakart = anakart;
	}

}
