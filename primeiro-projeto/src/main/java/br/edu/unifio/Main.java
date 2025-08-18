package br.edu.unifio;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

       
        String senha = RandomStringUtils.insecure().nextAlphabetic(count:8);
        System.out.println(senha);
    
    }
}