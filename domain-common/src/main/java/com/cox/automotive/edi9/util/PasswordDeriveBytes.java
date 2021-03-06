package com.cox.automotive.edi9.util;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.generators.PKCS5S1ParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;


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
public class PasswordDeriveBytes extends PKCS5S1ParametersGenerator {
    private final Digest d;

    private byte[] output = null;

    public PasswordDeriveBytes(Digest d) {
        super(d);

        this.d = d;
    }

    public void init(byte[] password, byte[] salt, int iterationCount) {
        this.password = password;
        this.salt = salt;
        this.iterationCount = iterationCount;
    }

    public CipherParameters generateDerivedParameters(
            int keySize) {
        keySize = keySize / 8;

        byte[] result = new byte[keySize];
        int done = 0;
        int count = 0;
        byte[] b = null;

        while (done < result.length) {
            if (b == null) {
                b = generateInitialKey();
            } else if (++count < 1000) {
                b = generateExtendedKey(count);
            } else {
                throw new RuntimeException("Exceeded limit");
            }

            int use = Math.min(b.length, result.length - done);
            System.arraycopy(b, 0, result, done, use);
            done += use;
        }

        return new KeyParameter(result);
    }

    private byte[] generateOutput() {
        byte[] digestBytes = new byte[d.getDigestSize()];

        d.update(password, 0, password.length);
        d.update(salt, 0, salt.length);
        d.doFinal(digestBytes, 0);

        for (int i = 1; i < (iterationCount - 1); i++) {
            d.update(digestBytes, 0, digestBytes.length);
            d.doFinal(digestBytes, 0);
        }

        return digestBytes;
    }

    private byte[] generateInitialKey() {
        output = generateOutput();
        d.update(output, 0, output.length);

        byte[] digestBytes = new byte[d.getDigestSize()];
        d.doFinal(digestBytes, 0);
        return digestBytes;
    }

    private byte[] generateExtendedKey(int count) {
        byte[] prefix = Integer.toString(count).getBytes();
        d.update(prefix, 0, prefix.length);
        d.update(output, 0, output.length);

        byte[] digestBytes = new byte[d.getDigestSize()];
        d.doFinal(digestBytes, 0);
        return digestBytes;
    }
}
