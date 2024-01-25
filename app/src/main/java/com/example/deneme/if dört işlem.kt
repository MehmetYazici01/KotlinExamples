package com.example.deneme

import java.util.Scanner

fun main(){

    val girdi = Scanner(System.`in`)
    println("toplama(1)")
    println("çıkarma(2)")
    println("çarpma(3)")
    println("bölme(4)")
    val secim = girdi.nextInt()


    println("birinci sayıyı gir:")
    val sayi1 = girdi.nextInt()
    println("ikinci sayıyı gir:")
    val sayi2 = girdi.nextInt()

    if(secim == 1){
        println("toplama: ${sayi1 + sayi2}")
    }else if(secim == 2){
        println("çıkarma: ${sayi1 - sayi2}")
    }else if(secim == 3){
        println("çarpma: ${sayi1 * sayi2}")
    }else if(secim == 4){
        println("bölme: ${sayi1 / sayi2}")

    }

}