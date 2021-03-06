package com.app.buscameapi.util

import java.util.Random

private const val MAX_HEX_LENGTH = 8

fun randomNumberHex() : String {

    val random = Random()
    val randomNumber1 = random.nextInt() * 1000
    val randomNumber2 = random.nextInt() * 1000

    val hex = Integer.toHexString(randomNumber1) +
            Integer.toHexString(randomNumber2) +
            Integer.toHexString(randomNumber1)

    if(hex.length < MAX_HEX_LENGTH) return randomNumberHex()

    return hex.substring(0, MAX_HEX_LENGTH)
}