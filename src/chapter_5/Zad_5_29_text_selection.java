package chapter_5;

import java.util.Scanner;

/**
 * text selection
 */
public class Zad_5_29_text_selection {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while( ! exit ) {

            System.out.println("please give me a number range 1 - 12 (or exit select -> 0 ) :");

            int number = sc. nextInt();

            switch (number) {
                case 0:
                    exit = true;
                    System.out.println("see yaa");
                    break;

                case 1:

                    System.out.println("On the first day of Christmas my true love sent to me\n" +
                            "A partridge in a pear tree");
                    break;

                case 2:

                    System.out.println("On the second day of Christmas my true love sent to me\n" +
                            "Two turtle doves\n" +
                            "And a partridge in a pear tree");
                    break;

                case 3:

                    System.out.println("On the third day of Christmas my true love sent to me\n" +
                            "Three French hens, two turtle doves\n" +
                            "And a partridge in a pear tree");
                    break;
                case 4:

                    System.out.println("On the fourth day of Christmas my true love sent to me\n" +
                            "Four calling birds, three French hens, two turtle doves\n" +
                            "And a partridge in a pear tree");
                    break;
                case 5:

                    System.out.println("On the fifth day of Christmas my true love sent to me\n" +
                            "Five gold rings, four calling birds, three French hens, two turtle doves\n" +
                            "And a partridge in a pear tree");
                    break;

                case 6:

                    System.out.println("On the sixth day of Christmas my true love sent to me\n" +
                            "Six geese a laying, five gold rings, four calling birds\n" +
                            "Three French hens, two turtle doves\n" +
                            "And a partridge in a pear tree");
                    break;

                case 7:

                    System.out.println("On the seventh day of Christmas my true love sent to me\n" +
                            "Seven swans a swimming, six geese a laying, five gold rings\n" +
                            "Four calling birds, three French hens, two turtle doves\n" +
                            "And a partridge in a pear tree\n");
                    break;

                case 8:

                    System.out.println("On the eighth day of Christmas my true love sent to me\n" +
                            "Eight maids a milking, seven swans a swimming, six geese a laying\n" +
                            "Five gold rings, four calling birds, three French hens, two turtle doves\n" +
                            "And a partridge in a pear tree");
                    break;

                case 9:

                    System.out.println("On the ninth day of Christmas my true love sent to me\n" +
                            "Nine drummers drumming\n" +
                            "On the tenth day of Christmas my true love sent to me\n" +
                            "Ten pipers piping");
                    break;

                case 10:

                    System.out.println("Nine drummers drumming, ten pipers piping\n" +
                            "Drumming, piping, drumming, piping\n" +
                            "Eight maids a milking, seven swans a swimming, six geese a laying\n" +
                            "Five gold rings, four calling birds, three French hens, two turtle doves\n" +
                            "And a partridge in a pear tree");
                    break;

                case 11:

                    System.out.println("On the eleventh day of Christmas my true love sent to me\n" +
                            "Eleven ladies dancing, ten pipers piping, nine drummers drumming\n" +
                            "Eight maids a milking, seven swans a swimming, six geese a laying\n" +
                            "Five gold rings, four calling birds, three French hens, two turtle doves\n" +
                            "And a partridge in a pear tree");
                    break;

                case 12:

                    System.out.println("On the twelfth day of Christmas my true love sent to me\n" +
                            "Twelve Lords a leaping, eleven ladies dancing, ten pipers piping\n" +
                            "Nine, drummers drumming, eight maids a milking\n" +
                            "Seven swans a swimming, six geese a laying\n" +
                            "And five gold rings, four calling birds, three French hens, two turtle doves\n" +
                            "And a partridge in a pear tree, and a partridge in a pear tree");
                    break;
                default: {
                    System.out.println("wrong value ...");
                    break;
                }

            }


        }
    }
}
