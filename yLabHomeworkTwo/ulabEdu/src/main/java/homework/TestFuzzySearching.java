/*
        Task3
            Реализовать функцию нечеткого поиска
                    fuzzySearch("car", "ca6$$#_rtwheel"); // true
                    fuzzySearch("cwhl", "cartwheel"); // true
                    fuzzySearch("cwhee", "cartwheel"); // true
                    fuzzySearch("cartwheel", "cartwheel"); // true
                    fuzzySearch("cwheeel", "cartwheel"); // false
                    fuzzySearch("lw", "cartwheel"); // false
         */

package homework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFuzzySearching {

    @Test
    public void test() {
        Assert.assertTrue(fuzzySearch("car", "ca6$$#_rtwheel"));
        Assert.assertTrue(fuzzySearch("cwhl", "cartwheel"));
        Assert.assertTrue(fuzzySearch("cwhee", "cartwheel"));
        Assert.assertTrue(fuzzySearch("cartwheel", "cartwheel"));
        Assert.assertFalse(fuzzySearch("cwheeel", "cartwheel"));
        Assert.assertFalse(fuzzySearch("lw", "cartwheel"));
        Assert.assertFalse(fuzzySearch(null, null));
        Assert.assertFalse(fuzzySearch("", null));
        Assert.assertFalse(fuzzySearch(null, ""));
        Assert.assertFalse(fuzzySearch("", ""));
    }

    public static boolean fuzzySearch(String needToFind, String string) {

        if (needToFind == null || needToFind.equals("") || string == null || string.equals("")) {
            return false;
        }
        int indexFind = 0;
        int indexString = 0;
        char[] findChar = needToFind.toCharArray();
        char[] stringChar = string.toCharArray();

        for (; indexFind < findChar.length; indexFind++) {
            char tmp = findChar[indexFind];
            for (; indexString <= stringChar.length; indexString++) {
                if (indexString == stringChar.length) {
                    return false;
                }
                if (stringChar[indexString] == tmp) {
                    indexString++;
                    break;
                }
            }
        }
        return true;
    }
}