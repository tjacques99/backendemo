package com.jacques.backendemo.entity;

public class Crypto {
	private long id;
	private String cryptoName;
	
	public Crypto(long id, String cryptoName) {
		super();
		this.id = id;
		this.cryptoName = cryptoName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCryptoName() {
		return cryptoName;
	}

	public void setCryptoName(String cryptoName) {
		this.cryptoName = cryptoName;
	}	
}
