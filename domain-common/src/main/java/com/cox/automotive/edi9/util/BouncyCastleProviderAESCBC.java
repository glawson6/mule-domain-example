package com.cox.automotive.edi9.util;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.*;
import java.security.spec.AlgorithmParameterSpec;

/**
 * Created by greg lawson on 5/1/15.
 * The classes along PasswordDeriveBytes, ManheimEncryptor, BouncyCastleProviderAESCBC were
 * loosely translated from .Net code below to produce an encryptor and decryptor.
 *  private static ICryptoTransform FoundationCode(string watchadoing)
    {
        string aesKey = @"0Zb+smauaT8v6hRiFGJDnakwlS/YC2u=";
        string salt = "manheimvickipii2009";
        string hashAlgorithm = "SHA1";
        int passwordIterations = 2;
        int keySize = 256;
        string iv = "9aVrj8x8IevyeaD=";
        byte[] bytSalt = Encoding.ASCII.GetBytes(salt);
        byte[] bytIv = Encoding.UTF8.GetBytes(iv);
        PasswordDeriveBytes password = new PasswordDeriveBytes(aesKey, bytSalt, hashAlgorithm, passwordIterations);
        byte[] bytKey = password.GetBytes(keySize/8);
        RijndaelManaged objAes = new RijndaelManaged {Mode = CipherMode.CBC, Padding = PaddingMode.ISO10126};
        if (watchadoing == "Encrypt")
        {
            return objAes.CreateEncryptor(bytKey, bytIv);
        }
        return objAes.CreateDecryptor(bytKey, bytIv);
    }
 */
public class BouncyCastleProviderAESCBC {

    // The default block size
    public static int blockSize = 16;

    Cipher encryptCipher = null;
    Cipher decryptCipher = null;

    // Buffer used to transport the bytes from one stream to another
    byte[] buf = new byte[blockSize];       //input buffer
    byte[] obuf = new byte[512];            //output buffer

    // The key
    byte[] key = null;
    // The initialization vector needed by the CBC mode
    byte[] IV = null;

    public BouncyCastleProviderAESCBC(){
        //for a 192 key you must install the unrestricted policy files
        //  from the JCE/JDK downloads page
        key ="SECRET_1SECRET_2".getBytes();
        //default IV value initialized with 0
        IV = new byte[blockSize];
    }

    public BouncyCastleProviderAESCBC(String pass, byte[] iv){
        //get the key and the IV
        key = pass.getBytes();
        IV = new byte[blockSize];
        System.arraycopy(iv, 0 , IV, 0, iv.length);
    }
    public BouncyCastleProviderAESCBC(byte[] pass, byte[] iv){
        //get the key and the IV
        key = new byte[pass.length];
        System.arraycopy(pass, 0 , key, 0, pass.length);
        IV = new byte[blockSize];
        System.arraycopy(iv, 0, IV, 0, iv.length);
    }

    /*

     */
    public void InitCiphers()
            throws NoSuchAlgorithmException,
            NoSuchProviderException,
            NoSuchProviderException,
            NoSuchPaddingException,
            InvalidKeyException,
            InvalidAlgorithmParameterException {
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        //String padding = "AES/CBC/PKCS5Padding";
        String padding = "AES/CBC/ISO10126Padding";
        //1. create the cipher using Bouncy Castle Provider
        encryptCipher =
                Cipher.getInstance(padding, "BC");
        //2. create the key
        SecretKey keyValue = new SecretKeySpec(key,"AES");
        //3. create the IV
        AlgorithmParameterSpec IVspec = new IvParameterSpec(IV);
        //4. init the cipher
        encryptCipher.init(Cipher.ENCRYPT_MODE, keyValue, IVspec);

        //1 create the cipher
        decryptCipher =
                Cipher.getInstance(padding, "BC");
        //2. the key is already created
        //3. the IV is already created
        //4. init the cipher
        decryptCipher.init(Cipher.DECRYPT_MODE, keyValue, IVspec);
    }
}
