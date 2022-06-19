/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class CalCu {
    public static int getTest(int a){
        if(a < 0){
            throw  new IllegalArgumentException("para must be > 0");
        }
        return a + 10;
    }
}
