package com.tts;

    public class AsciiChars {

        public static void printNumbers () {
            //to print valid numeric input
            for (int i = 48; i <= 57; i++) {
                System.out.print((char) i);
            }
        }

        public static void printLowerCase () {
            //to print valid lowercase alphabetic inputs
            for (int i = 97; i <= 122; i++) {
                System.out.print((char) i);
            }
        }

        public static void printUpperCase () {
            //to print valid uppercase alphabetic input
            for (int i = 65; i <= 90; i++) {
                System.out.print((char) i);
            }
        }
    }


