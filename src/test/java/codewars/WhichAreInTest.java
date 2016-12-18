package codewars;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by colus on 2016. 12. 18..
 */
public class WhichAreInTest {
    @Test
    public void inArray_for() throws Exception {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };
        assertArrayEquals(r, WhichAreIn.inArray_for(a, b));
    }

    @Test
    public void inArray_Stream1() throws Exception {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };
        assertArrayEquals(r, WhichAreIn.inArray_Stream1(a, b));
    }

    @Test
    public void inArray_Stream2() throws Exception {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };
        assertArrayEquals(r, WhichAreIn.inArray_Stream2(a, b));
    }

    @Test
    public void inArray_ArraysStream() throws Exception {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };
        assertArrayEquals(r, WhichAreIn.inArray_ArraysStream(a, b));
    }

}