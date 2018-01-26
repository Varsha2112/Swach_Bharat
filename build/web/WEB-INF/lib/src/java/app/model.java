/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Random;

/**
 *
 * @author Harshit
 */
public class model {
  public static final  String getrandom(){
        
        Random r=new Random();
    return "User"+ r.nextInt(99999);
    }
}



