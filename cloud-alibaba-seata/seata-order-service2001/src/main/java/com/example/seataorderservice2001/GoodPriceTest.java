package com.example.seataorderservice2001;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: leell
 * Date: 2022/10/26 20:48:47
 */
public class GoodPriceTest {
    static class Good {
        int weight;
        int price;
        double unitPrice;

        public Good(int weight, int price) {
            this.weight = weight;
            this.price = price;
            unitPrice = this.price * 0.1d / this.weight;
        }

        public int getPrice() {
            return price;
        }

        public int getWeight() {
            return weight;
        }

        public double getUnitPrice() {
            return unitPrice;
        }
    }

    public int getMaxPrice(int limitWeight, List<Good> goods) {
        goods.sort((a, b) -> a.unitPrice > b.unitPrice ? -1 : (a.unitPrice == b.unitPrice ? 0 : 1));
        int currentPrice = 0;
        int currentWeight = 0;
        List<Good> currentGoods = new ArrayList<>();
        for (int i = 0; i < goods.size(); i++) {
            Good good = goods.get(i);
            if (good.weight + currentWeight > limitWeight) {
                int w = good.weight - (limitWeight - currentWeight);
                for (int j = currentGoods.size() - 1; j >= 0; j--) {
                    Good jGood = currentGoods.get(j);
                    if (w <= jGood.weight && good.price > jGood.price) {
                        currentGoods.remove(jGood);
                        currentGoods.add(good);
                        currentPrice += good.price - jGood.price;
                        break;
                    }
                }
            } else {
                currentGoods.add(good);
                currentPrice += good.price;
                currentWeight += good.weight;
            }
        }
        System.out.println(currentWeight);
        return currentPrice;
    }

    public static void main(String[] args) {
        List<Good> goods = new ArrayList<>();
        goods.add(new Good(3, 4));
        goods.add(new Good(4, 6));
        goods.add(new Good(2, 3));
        goods.add(new Good(5, 8));
        goods.add(new Good(8, 13));
        goods.add(new Good(7, 12));
        goods.add(new Good(5, 11));
        GoodPriceTest test = new GoodPriceTest();
        int price = test.getMaxPrice(20, goods);
        System.out.println(price);
    }
}
