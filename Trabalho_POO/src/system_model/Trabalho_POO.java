/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//GABRIELA MARIA SINASTRE & MAYKON DOUGLAS BORGES
package system_model;


import system.IU.IUBemVindo;
import system_control.Controller;


/**
 *
 * @author maayk
 */
public class Trabalho_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUBemVindo().setVisible(true);
            }
        });
        
        /*Controller c = new Controller();
        
        c.addDepartments("123", "Física");
        c.addEfetivo("laa", "roberto", "1", "D2", "D1");
        c.addTecnico("traba", "julia", "344", 0, "T1");
        c.addTecnico("traba", "julio", "344", 0, "T2");
        c.addSubstituto(12, "rodrigo", "123-2", 0, "S1", "Doutor");
      
        c.addDepartments("124", "Matematica");
        c.addEfetivo("laa", "cassio", "1", "D2", "D1");
        c.addTecnico("traba", "cortana", "344", 0, "T1");
        c.addSubstituto(12, "michele", "123-2", 0, "S1", "Doutor");*/
 
        /*
     /*((Efetivo) vet[i]).getArea()*/
        
        /*System.out.println(c.showAllTec());ok*/
        /*System.out.println(c.showAllFunc());*/
        /*System.out.println(c.showFuncSalarioEspec(1700, 1900));ok*/
      //  System.out.println(c.showInfoDepartamentos(1000, 2000));
        /*System.out.println(c.showInfoDepartamentoFaixaEspecifica(1400, 10000));ok arrumae qtd func*/
        /*System.out.println(c.showAllEfetivo());ok*/
        /*System.out.println(c.showAllSubs());ok*/
        /*System.out.println(c.showAllDocentes());ok*/
      //  System.out.println(c.showInfoDepartamento("124"));
        
       // System.out.println(c.showGeneralDep());

    }

}
