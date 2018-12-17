/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 348848128
 */
public class Test {
    public static void main(String[] args){
       Linked_List<Patient> patients = new Linked_List<Patient>();
       
       patients.add(new Patient("bill","cui"));
       System.out.println(patients.get(0).toString());
        
   
    }
}
