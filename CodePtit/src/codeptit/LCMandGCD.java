/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeptit;
import java.util.*;
/**
 *
 * @author suckm
 */
public class LCMandGCD {
    
    public static int GCD(int a,int b){
        if(a == 0) 
            return b;
        return GCD(b%a,a);
    }
    
    public static int LCM(int a, int b){
        return (a/GCD(a, b)) * b;
    }
    
}

