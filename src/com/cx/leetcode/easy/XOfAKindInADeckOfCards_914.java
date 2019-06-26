package com.cx.leetcode.easy;

import java.util.Arrays;

/**
 * In a deck of cards, each card has an integer written on it.
 * <p>
 * Return true if and only if you can choose X >= 2 such that it is possible to split the entire deck into 1 or more groups of cards, where:
 * <p>
 * Each group has exactly X cards.
 * All the cards in each group have the same integer.
 */
public class XOfAKindInADeckOfCards_914 {
    public boolean hasGroupsSizeX(int[] deck) {
        boolean rs = false;
        int len = deck.length;
        int[][] result;

        if (len % 2 == 0) {
            Arrays.sort(deck);
            int j  = 0;
            for(int i = 0; i < len-2; i++){
                if(deck[i] == deck[i+1]){
                    j++;
//                    result[]
                }
            }

        }
        return rs;
    }
}
