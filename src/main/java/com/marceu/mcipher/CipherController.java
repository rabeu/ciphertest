package com.marceu.mcipher;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CipherController {

    @PostMapping("/ceasar/encipher")
	public CipherModel ceasarEncipher(@RequestParam(value = "plaintext", defaultValue = "") String plainText, @RequestParam(value = "shifts", defaultValue = "") int shifts) {
        return CipherUtil.ceasarEncipher(plainText, shifts);
    }
    
    @PostMapping("/caesar/decipher")
	public CipherModel ceasarDecipher(@RequestParam(value = "plaintext", defaultValue = "") String plainText, @RequestParam(value = "shifts", defaultValue = "") int shifts) {
        
        return CipherUtil.ceasarDecipher(plainText, shifts);
    }
    
    @PostMapping("/atbash/encipher")
    public CipherModel atbashEncipher (@RequestParam(value = "plaintext", defaultValue = "") String plainText) {
        return CipherUtil.atbashEncipher(plainText);
    }

    @PostMapping("/atbash/decipher")
    public CipherModel atbashDecipher (@RequestParam(value = "plaintext", defaultValue = "") String plainText)  {
        return CipherUtil.atbashDecipher(plainText);
    }

}
