package com.cox.automotive.edi9.util;


import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.generators.PKCS5S1ParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/**
 * Created by tap on 5/1/15.
 */
public class ManheimEncryptor {
    private static final Logger logger = LoggerFactory.getLogger(ManheimEncryptor.class);

    private String aesKey;
    private String salt;
    private Integer passwordIterations;
    private Integer keySize;
    private String iV;
    private PKCS5S1ParametersGenerator generator;
    private BouncyCastleProviderAESCBC bouncyCastleProviderAES;

    private void init() throws NoSuchPaddingException,
            InvalidAlgorithmParameterException, NoSuchAlgorithmException,
            NoSuchProviderException, InvalidKeyException {
        generator = new PasswordDeriveBytes(new SHA1Digest());
        generator.init(aesKey.getBytes(), salt.getBytes(), passwordIterations);
        byte[] key = ((KeyParameter)generator.generateDerivedParameters(keySize)).getKey();
        bouncyCastleProviderAES = new BouncyCastleProviderAESCBC(key, iV.getBytes(StandardCharsets.UTF_8));
        bouncyCastleProviderAES.InitCiphers();
    }

    public String getAesKey() {
        return aesKey;
    }

    public void setAesKey(String aesKey) {
        this.aesKey = aesKey;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getPasswordIterations() {
        return passwordIterations;
    }

    public void setPasswordIterations(Integer passwordIterations) {
        this.passwordIterations = passwordIterations;
    }

    public Integer getKeySize() {
        return keySize;
    }

    public void setKeySize(Integer keySize) {
        this.keySize = keySize;
    }

    public String getiV() {
        return iV;
    }

    public void setiV(String iV) {
        this.iV = iV;
    }

    public static void main(String[] args) throws Exception
    {

        String aesKey = "0Zb+smauaT8v6hRiFGJDnakwlS/YC2u=";
        String salt = "manheimvickipii2009";
        int passwordIterations = 2;
        int keySize = 256;
        String iv = "9aVrj8x8IevyeaD=";
        //byte[] saltBytes = salt.getBytes();
       // PKCS5S1ParametersGenerator generator = new PasswordDeriveBytes(new SHA1Digest());
        //generator.init(aesKey.getBytes(), saltBytes, passwordIterations);

        //byte[] key = ((KeyParameter)generator.generateDerivedParameters(keySize)).getKey();
        //BouncyCastleProviderAESCBC bouncyCastleProviderAES = new BouncyCastleProviderAESCBC(key, iv.getBytes(StandardCharsets.UTF_8));

        //bouncyCastleProviderAES.InitCiphers();
        String encrypted = "Z59pfH2VTDgUBIT/C4ooJj83v1D+guQ7vaLY8qJspNYq1nqVHQydu1WClKhLu63iUFBcth/Evfp2jWcwa41msuFjvWRFwGT98iGbfeoN4QOcRwl3OY5fPFWXh2iNoUBPprd+oDPONFaZsfT6bK1fNKbqNXIQJaZqdD+3s3BoQ/mqpxLGq6yuIR2OzHqviIBOQqM1mgattamzbaRlY+l2Ku4uwneb7W5VXX3SP88E+vNIwdxNrwlAlhJC+f5fT7UTTxVGY/gVvxU8HfHfXunnvOPFzg0yCNzzhMsUEgHYleA5o/D3Vdyfcq9oeFE9PA3bcHOdT4ydFlDD03BWbT3WOno+yGSpfcFE9qRkGK7iumeB2lM4aDPyNXDL47iGlyzTjkfyFjogNOg4zVDEWIM3FHM+h/Vcrc9m6rnKjkz/ga4INifdFo30XZrfVfLH9r+24jXUfLh0zTtUlZCdmJzOPamfPu3h/5YKb2WolVgkVX69fHubxe3Nwvir8KH0VqdZW8EfKDQ3m+U1HDkINb/T8AzhQTKO+D56pcsz/cykkxMaYxnohK01Sa76airxlB+FjdPGXThNPWPFhsyGVlKGrgUy2E2sn87P1efcZ7wckkxGlP08eosY2RQlXRlQCF5k2mnzjcBymnzWJSMLpbpKWPs3xy9hSENbJiyg7VFYviAXJ5QIuaz7GUvdjXoGxnSlqkaFRaLHc+L03aEJHHE85D0Om3SC+aPxTbjQNstMxd7VQ9aByHXLGA4FHd4LBWcAXC99XKdOS5QCCNHAYGSh+Xed1gumz4pjnks0rpxm0EnIz2U+Qa9b0ztDmdNJQYA+P/OvoGsCvd0FpXjuGKo9pJN+TspOWHrauye75RYfN0rtQc1szAIZK4PrKZY9bSnl8k0yqeSC7NDdNNlSpBLaRK9RVQj1y6yA25IlRBGjzODxHGdiOaxPue5LGPboJH4BWX6xA24jWirT5udQAnh9nAQBcVc2y6LoNHkpHC2nsD9XhcwT4N3+QVM1il6vp3mc2R1ClpG5L2Z7MQFEoVR9bf5C6JOFGMcmxdgV4AkyxwgtVbXRWDK2vONWEXmvsV+B6x6hQ9619WueFrB/m/1LNZsvr1t3/0D/nZ3YuQ3XB4IZOs0oM3A4SQslPYZjbSMLLL7HonC3cNlpOh2wBKyMqFbxbSQufiY6wVhxqejOIvvZwRe2XpJLfmsPXpcbtT23nzb+ambztUQxFOO+0zMrbpKZXOCyinPyb9s34QA1Riu3rFZ0C/N47ULPTCTKT1MTI83dzdq80OU3Izopr8JtzGGofRtOuZOyn2q91bvcvmIu9Ve8zcFarwFPfLTiEouWWhzgTzQyjCwfoDPF+slAcmHQd6ALCSPi2loTj4vjoSD6jqs8qtiSWmtqX/R4hM3PjUvaCINV/8eq+xc9LAGcI7YIo9n9hQvwVActXoOcouZO02/A8dxspVHq4HWkHw++uxdyY8Kfxw5XjEW3uPe5/mu5qE1eP7nb0XE1zBo3FWP72smsOt9aDQgSMXxZwjjLsr+m6geRIikAxEkynXh+iOxN6Nq7/8c/wljiQzIR0F7F/ODKk7uAYxsifixwFxxc8kJzohx7hGflWT/haTvRNg==";

        //byte[] base64TextToDecrypt = org.bouncycastle.util.encoders.Base64.decode(encrypted.getBytes());
        //byte[] decryptedBytes =  bouncyCastleProviderAES.decryptCipher.doFinal(base64TextToDecrypt);
       // String decrypted = new String(decryptedBytes,StandardCharsets.UTF_8);
        //System.out.println("Output "+decrypted);
        ManheimEncryptor manheimEncryptor = new ManheimEncryptor();
        manheimEncryptor.setAesKey(aesKey);
        manheimEncryptor.setSalt(salt);
        manheimEncryptor.setiV(iv);
        manheimEncryptor.setKeySize(keySize);
        manheimEncryptor.setPasswordIterations(passwordIterations);
        manheimEncryptor.init();
        String decrypted2 = manheimEncryptor.decryptString(encrypted);
        System.out.println("Decrypted2 "+decrypted2);
    }

    /**
     * This method takes a base64 encoded and encrypted String and returns the String representation.
     * @param encrypted
     * @return
     */
    public String decryptString(String encrypted) throws NoSuchPaddingException,
            InvalidAlgorithmParameterException,
            NoSuchAlgorithmException,
            NoSuchProviderException,
            InvalidKeyException,
            BadPaddingException, IllegalBlockSizeException {
        byte[] base64TextToDecrypt = org.bouncycastle.util.encoders.Base64.decode(encrypted.getBytes());
        byte[] decryptedBytes =  bouncyCastleProviderAES.decryptCipher.doFinal(base64TextToDecrypt);
        String decrypted = new String(decryptedBytes,StandardCharsets.UTF_8);
        return decrypted;
    }

    public String encryptString(String text) throws NoSuchPaddingException,
            InvalidAlgorithmParameterException,
            NoSuchAlgorithmException,
            NoSuchProviderException,
            InvalidKeyException,
            BadPaddingException, IllegalBlockSizeException {
        byte[] encryptedBytes =  bouncyCastleProviderAES.encryptCipher.doFinal(text.getBytes());
        byte[] base64Text = org.bouncycastle.util.encoders.Base64.encode(encryptedBytes);
        String encrypted = new String(base64Text,StandardCharsets.UTF_8);
        return encrypted;
    }
}

