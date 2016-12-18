package codewars;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by colus on 2016. 12. 18..
 */
public class WhichAreIn {
    public static String[] inArray_for(String[] array1, String[] array2) {
        if ( array1.length == 0 || array2.length == 0 ) {
            return new String[]{};
        }

        Set<String> result = new LinkedHashSet<>();
        for ( String str1 : array1 ) {
            for ( String str2 : array2 ) {
                if ( str2.contains(str1) ) {
                    result.add(str1);
                }
            }
        }
        return result.toArray(new String[]{});
    }

    public static String[] inArray_Stream1(String[] array1, String[] array2) {
        if ( array1.length == 0 || array2.length == 0 ) {
            return new String[]{};
        }

        return Stream.of(array1)
                .filter( str1 -> WhichAreIn.contains(array2, str1))
                .distinct()
                .sorted()
                .collect(toList()).toArray(new String[]{});
    }

    private static Boolean contains(String[] arr, String str) {
        for ( String str1 : arr ) {
            if ( str1.contains(str) ) return true;
        }
        return false;
    }

    public static String[] inArray_Stream2(String[] array1, String[] array2) {
        if ( array1.length == 0 || array2.length == 0 ) {
            return new String[]{};
        }

        return Stream.of(array1)
                .filter( str1 -> Stream.of(array2).anyMatch(s->s.contains(str1)))
                .distinct()
                .sorted()
                .collect(toList()).toArray(new String[]{});
    }


    public static String[] inArray_ArraysStream(String[] array1, String[] array2) {
        if ( array1.length == 0 || array2.length == 0 ) {
            return new String[]{};
        }

        return Arrays.stream(array1)
                .filter( str1 -> Arrays.stream(array2).anyMatch(str2 -> str2.contains(str1)))
                .distinct()
                .sorted()
                .collect(toList()).toArray(new String[]{});
    }
}
