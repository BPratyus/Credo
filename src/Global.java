/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anand
 */
public class Global {
     static int x;
    String c;
    
    void check(int a){
        x=a;
    }
    String choice(){
        switch(x)
    {   case 1: c="fruits";
        break;
        case 2: c="Vegetables";
        break;
        case 3: c="Diary";
        break;
        case 4: c="Poultry";
        break;
        case 5: c="Honey";
        break;
        case 6: c="Marine";
        break;
        
    }
        return c;
    }  
 
    
}
