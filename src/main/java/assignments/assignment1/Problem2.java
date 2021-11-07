/***************************************************************************************
 *    Name: Ngo Trong Hieu
 *    ID: 15943
 *    Course: Introduction to Programming
 *    University: Wyższa Szkoła Handlowa we Wrocławiu
 ***************************************************************************************/
package assignments.assignment1;

import static utils.LogUtils.*;
import static utils.NumeralUtils.*;

public class Problem2 {
    public static void main(String[] args) {
        int base = Random(10, 30), height = Random(10, 30), side = Random(10, 30);
        log("Area = base * height = %d * %d = %d", base, height, base * height);
        log("Perimeter = 2(base + side) = 2(%d + %d) = %d", base, side, 2 * (base + side));
    }
}
