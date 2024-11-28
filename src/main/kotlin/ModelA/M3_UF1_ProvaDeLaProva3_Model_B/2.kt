package M3_UF1_ProvaDeLaProva3_Model_B

/*
2. El següent text ha sigut codificat movent les lletres de l'abecedari 3 posicions enrere, fes un programa que el descodifiqui i digui qui és l’autor trobant-lo a google

BI XJLO, ZLJL ZFBDL NRB BP, FJMFAB X ILP XJXKQBP SBO IXP AFSBOQFAXP QLKQBOÍXP NRB ZLJBQBK.

COBZRBKQX RK XÑL JÁP JF ZLJMXÑÍX, V BI BZL AB QR SLW QB PBOÁ BUQOXÑL.

BI JFPJL AFXYIL ZFQXOÁ IXP PXDOXAXP BPZOFQROXP PF SFBKB YFBK X PRP MOLMÓPFQLP.

VL QLJL BI JRKAL MLO IL NRB BP, RK QBXQOL BK BI NRB ZXAX ELJYOB OBMOBPBKQX PR MXOQB.

IX ZXYBWX MLAOÁ AFZQXO IBVBP ZLKQOX IX MXPFÓK, MBOL BI XOALO
MRBAB JÁP NRB IX COFXIAXA AB RKX PBKQBKZFX.

IBB BI ABZOBQL QÚ JFPJL: VX NRB MFABP GRPQFZFX, QBK MLO ZFBOQL NRB QBKAOÁP JÁP GRPQFZFX AB IX NRB ABPBXP.

BI AFXYIL ZFQX IX YFYIFX BK PR MOLSBZEL.

 */

fun main() {
    val text = "BI XJLO, ZLJL ZFBDL NRB BP, FJMFAB X ILP XJXKQBP SBO IXP AFSBOQFAXP QLKQBOÍXP NRB ZLJBQBK.\n" +
            "COBZRBKQX RK XÑL JÁP JF ZLJMXÑÍX, V BI BZL AB QR SLW QB PBOÁ BUQOXÑL.\n" +
            "BI JFPJL AFXYIL ZFQXOÁ IXP PXDOXAXP BPZOFQROXP PF SFBKB YFBK X PRP MOLMÓPFQLP.\n" +
            "VL QLJL BI JRKAL MLO IL NRB BP, RK QBXQOL BK BI NRB ZXAX ELJYOB OBMOBPBKQX PR MXOQB.\n" +
            "IX ZXYBWX MLAOÁ AFZQXO IBVBP ZLKQOX IX MXPFÓK, MBOL BI XOALO\n" +
            "MRBAB JÁP NRB IX COFXIAXA AB RKX PBKQBKZFX.\n" +
            "IBB BI ABZOBQL QÚ JFPJL: VX NRB MFABP GRPQFZFX, QBK MLO ZFBOQL NRB QBKAOÁP JÁP GRPQFZFX AB IX NRB ABPBXP.\n" +
            "BI AFXYIL ZFQX IX YFYIFX BK PR MOLSBZEL."
    val decodedText = text.map {
        if (it.isLetter()) {
            val newChar = it - 3
            if (it.isLowerCase() && newChar < 'a'.toChar()) {
                (newChar + 26).toChar()
            } else if (it.isUpperCase() && newChar < 'A'.toChar()) {
                (newChar + 26).toChar()
            } else {
                newChar.toChar()
            }
        } else {
            it
        }
    }.joinToString("")
    println(decodedText)
    }