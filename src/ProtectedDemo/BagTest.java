package ProtectedDemo;

import protectorDemo.Bag;

    public class BagTest extends Bag {
        public BagTest(String companyName, String bagColor, String cost, String ratings) {
            super(companyName, bagColor, cost, ratings);
        }

        public static void main(String[] args) {
            Bag bag = new Bag("Lenovo", "Black", "2000", "4.2");
            System.out.println(bag);
        }
        }


