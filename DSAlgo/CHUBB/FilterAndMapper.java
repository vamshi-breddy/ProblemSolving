//package com.DSAlgo.CHUBB;
//
//import java.util.function.Function;
//import java.util.function.Predicate;
//
//public class FilterAndMapper {
//
//
//    /*Create
//     * Create the Filter and Mapper classes here.
//     */
//    class Filter {
//        public static Predicate<String> nameStartingWithPrefix(String prefix) {
//            return name -> name != null && name.startsWith(prefix);
//        }
//    }
//
//    static class Mapper {
//        public static Function<String, CharactersCount> getDistinctCharactersCount() {
//            return name -> new CharactersCount(name, (int) name.chars().distinct().count());
//        }
//    }
//
//    class CharactersCount {
//        private final String name;
//        private final Integer distinctCharacterCount;
//
//        public static CharactersCount(String name, Integer distinctCharacterCount) {
//            this.name = name;
//            this.distinctCharacterCount = distinctCharacterCount;
//        }
//
//        @Override
//        public String toString() {
//            return "\"" + this.name + "\" has " + this.distinctCharacterCount + " distinct characters.";
//        }
//    }
//}
//
//
