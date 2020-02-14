package com.marceu.mcipher;

public class CipherUtil {

    private static final String ALL_CHAR = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int CHAR_BEGIN = 65;
    private static final int ALPHABET_LENGTH = 26;
    private static final String SPACE_CONST = "X";

    public static CipherModel ceasarEncipher(final String plainText, final int shifts){

        String plainToCipher = prepareText(plainText);

        StringBuffer result = CipherUtil.ceasarEncrypt(plainToCipher, shifts);

        return new CipherModel("Caesar", plainText, result.toString(), shifts);

    }

    public static CipherModel ceasarDecipher(final String plainText, final int shifts){

        StringBuffer result = CipherUtil.ceasarEncrypt(plainText, (shifts*-1));

        //replacing the X would cause an issue with the actual character in the message, so out of the scope for this demo.
        //String plainToCipher = result.toString().replaceAll(SPACE_CONST," ");

        return new CipherModel("Caesar", plainText, result.toString(), shifts);

    }

    public static StringBuffer ceasarEncrypt(String text, int s)
    {
        StringBuffer result = new StringBuffer();

        for (int i=0; i<text.length(); i++)
        {
            int prePoint = (int)text.charAt(i);
            
            int newPoint = (prePoint + s - CHAR_BEGIN) % ALPHABET_LENGTH;

            if(newPoint < 0){
                newPoint += ALPHABET_LENGTH;
            }
            char ch = (char)(newPoint + CHAR_BEGIN);

            result.append(ch);

        }
        return result;
    }

    public static CipherModel atbashEncipher(final String plainText){
        
        String cipherText = CipherUtil.atbashEncrypt(prepareText(plainText));

        return new CipherModel("Atbash", plainText, cipherText);
    }

    public static CipherModel atbashDecipher(final String plainText){

        String cipherText = CipherUtil.atbashEncrypt(plainText);

        //replacing the X would cause an issue with the actual character in the message, so out of the scope for this demo.
        //String plainToCipher = cipherText.replaceAll(SPACE_CONST," ");

        return new CipherModel("Atbash", plainText, cipherText);
    }

    public static String atbashEncrypt(final String plainText){
        String cipherText = "";

        String plainTextLocal = plainText;
        
        int textLength= plainTextLocal.length();
        int alphabetLength = ALL_CHAR.length();

        for(int i=0; i<textLength; i++){
            char b=plainTextLocal.charAt(i);
            for(int j=0; j<alphabetLength; j++){
                char c=ALL_CHAR.charAt(j);
                if(c == b ){
                    int index=ALL_CHAR.indexOf(c);
                    int position=(alphabetLength-1)-index;
                    cipherText+= ALL_CHAR.charAt(position);
                    break;
                }
            }
        }

        return cipherText;
    }

    private static String prepareText(String text){
        text = text.replaceAll("\\s+",SPACE_CONST);
        text = text.toUpperCase();
        return text;
    }
}