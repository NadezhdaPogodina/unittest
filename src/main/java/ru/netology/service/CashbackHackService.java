package ru.netology.service;

public class CashbackHackService {

    private final int    boundary = 1000;
    private       String bonus;

    public int remain(int amount) {


        return boundary - amount % boundary;
    }
}
