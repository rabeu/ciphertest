package com.marceu.mcipher;

public class CipherModel {

	private String cipher;
    private String plainText;
    private String cipherText;
    private long shifts;

	public CipherModel(final String cipher, final String plainText, final String cipherText, final long shifts) {
		this.cipher = cipher;
        this.plainText = plainText;
        this.cipherText = cipherText;
        this.shifts = shifts;
    }

    public CipherModel(final String cipher, final String plainText, final String cipherText) {
		this.cipher = cipher;
        this.plainText = plainText;
        this.cipherText = cipherText;
    }

    public String getCipher(){
        return cipher;
    }

    public String getPlainText(){
        return plainText;
    }

    public String getCipherText(){
        return cipherText;
    }

	public long getShifts() {
		return shifts;
	}
}