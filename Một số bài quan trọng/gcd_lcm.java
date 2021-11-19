/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeptit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 *
 * @author suckm
 */
public class XuLyVanBan {
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
             
        return gcd(b % a, a);
    }
     
    // function to calculate lcm of
    // two numbers.
    static int lcm(int a, int b)
    {
        return (a * b) / gcd(a, b);
    }
}
