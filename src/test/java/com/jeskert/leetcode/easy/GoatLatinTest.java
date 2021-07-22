package com.jeskert.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class GoatLatinTest {
    GoatLatin goatLatin = new GoatLatin();

    @Test
    public void test1() {
        assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", goatLatin.toGoatLatin("I speak Goat Latin"));
        assertEquals("Eachmaa ordwmaaa onsistscmaaaa ofmaaaaa owercaselmaaaaaa andmaaaaaaa uppercasemaaaaaaaa etterslmaaaaaaaaa onlymaaaaaaaaaa", goatLatin.toGoatLatin("Each word consists of lowercase and uppercase letters only"));
        assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa",
                goatLatin.toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }
}
