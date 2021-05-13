/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author lo397
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
        boolean valido1 = false;
        int n =0;
        int n2 =0;
        int y =0, u;
        int total =0;
        int exponente1 =0;
        int exponente2 =0;
        proyecto2[] ecuacion;
        proyecto2[] ecuacion2;
        ecuacion = new proyecto2[n];
        ecuacion2 = new proyecto2[n2];
        //Crear arreglo de la suma
        int[] suma = new int[n];
        String[] variable = new String[n];
        int[] exponente = new int[n];
        
        
//        proyecto2[] ecuacion2;
        System.out.println("--------------- Proyecto Segundo Parcial ----------------");
        System.out.println("------------- Suma de Dos Ecuaciones ----------");
        System.out.println("");
        
        int opc = 0;
        while(opc !=7){
            try{
            System.out.println("---------------MENU PRINCIPAL----------------");
            System.out.println("-- Polinomios por cada Ecuacion ["+n+"]--");
            System.out.println("1) Ingresa cuantos polinomios necesitas");
            System.out.println("2) Ingresar Polinomios Primer Ecuacion");
            System.out.println("3) Ingresar Polinomios Segunda Ecuacion");
            System.out.println("4) Mostrar Ecuaciones");
            System.out.println("5) Sumar Polinomios");
            System.out.println("6) Restar Polinomios");
            System.out.println("7) Cerrar Sistema");
            System.out.print("Elige una opcion ---> ");
            opc = Integer.parseInt(sc.nextLine());
            
            switch(opc){
                case 1:
                    System.out.print("Cuantos polinomios necesitas en cada Ecuacion: ");
                    //Para validar datos do{try{}catch(Exception e){"Error en la captura"}}while();
                    
                    do{
                        try{
                            n = Integer.parseInt(sc.nextLine());
                            valido1 = true;
                        }catch(Exception e){
                            System.out.println("Error en la captura del numero -- Intentalo Nuevamente");
                            System.out.print("Cuantos Polinomios necesitas en cada Ecuacion: ");
                            opc=0;
                            valido1 = false;
                        }
                    
                    }while(valido1 == false);
                    break;
                case 2:
                    
                    if (n == 0) {
                        System.out.println("---------- Aun no se ha registrado cuantos polinomios necesitas ----------");
                        System.out.println("");
                    }
                    ecuacion = new proyecto2[n];
                    exponente1 = n;
                    //Aqui se inicializa las variables
                    
                    for (int i = 0; i<n; i++) {
                        ecuacion[i] = new proyecto2();
                    }
                    try{
                        //Se llenan los datos
                    for (int i = 0; i<n; i++) {
                        System.out.println("Monomio [" + (i+1) + "]");
                        System.out.print("Define Numero: ");
                        do{
                            try{
                                ecuacion[i].setNumero(Integer.parseInt(sc.nextLine()));
                                valido1 = true;
                            }catch(Exception e){
                                System.out.println("Error en la captura del numero -- Intentalo Nuevamente");
                                System.out.print("Define Numero: ");
                                opc =0;
                                valido1 = false;
                            }
                        }
                        while(valido1 == false);
                        
                        System.out.print("Define Variable: ");
                        ecuacion[i].setVariable(bf.readLine());
                        ecuacion[i].setExponente(exponente1);
                        exponente1 = exponente1 -1;
                        
                        
                        }
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                    
                case 3:
                    if (n == 0) {
                        System.out.println("---------- Aun no se ha registrado cuantos polinomios necesitas ----------");
                        System.out.println("");
                    }
                    n2 = n;
                    ecuacion2 = new proyecto2[n2];
                    exponente2 = n2;
                    //Aqui se inicializa las variables
                    for (int i = 0; i<n2; i++) {
                        ecuacion2[i] = new proyecto2();
                    }
                    try{
                        //Se llenan los datos
                    for (int i=0; i<n2; i++) {
                        System.out.println("Monomio [" + (i+1) + "]");
                        System.out.print("Define Numero: ");
                        do{
                            try{
                                ecuacion2[i].setNumero2(Integer.parseInt(sc.nextLine()));
                                valido1 = true;
                            }catch(Exception e){
                                System.out.println("Error en la captura del Numero -- Intentalo Nuevamente");
                                System.out.print("Define Numero: ");
                                opc = 0;
                                valido1 = false;
                            }
                        }while(valido1 == false);
                        
                        
                        System.out.print("Define Variable: ");
                        ecuacion2[i].setVariable2(bf.readLine());
                        ecuacion2[i].setExponente2(exponente2);
                        exponente2 = exponente2 -1;
                        }
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    
                    break;
                 
                case 4:
                    
                    System.out.println("---------- Primer Polinomio ----------");
                    if(n==0){
                        System.out.println("No existen registros del Polinomio");
                    }else{
                    for(int i=0; i<n; i++){
                        if(ecuacion[i].getNumero()>0){
                            System.out.print("+");
                        }
                        System.out.print(ecuacion[i].getNumero()+""+ecuacion[i].getVariable()+""+ecuacion[i].getExponente());
                    }
                    }
                    System.out.println("");

                            System.out.println("---------- Segundo Polinomio ----------");
                            if(n2 == 0){
                                System.out.println("No existen registros del Polinomio");
                            }else{
                            for(int i=0; i<n2; i++){
                                    if (ecuacion2[i].getNumero2() > 0) {
                                        System.out.print("+");
                                    }
                                    System.out.print(ecuacion2[i].getNumero2() + "" + ecuacion2[i].getVariable2() + "" + ecuacion2[i].getExponente2());

                                }
                            }
                    System.out.println("");
            
                      break;

                case 5:
                    u =1;
                    y=0;
//                    System.out.println("Comienza");

                    //Conocemos que los exponentes disminuiran de uno por uno
                    //Ejemplo si n es 5, sera x5, x4, x3, x2 y x1
                   total = n+n2; 
                   
                   if(n==0 || n2 ==0){
                        System.out.println("---------- No Se ha completado la suma ----------");
                        System.out.println(" ");
                    }else{
                       System.out.println("---------- Suma ----------");
                   for(int i=0; i<n; i++){
                        if(ecuacion[i].getNumero()>0){
                            System.out.print("+");
                        }
                        System.out.print(ecuacion[i].getNumero()+""+ecuacion[i].getVariable()+""+ecuacion[i].getExponente());
                    }
                       
                   for(int i=0; i<n2; i++){
                                    if (ecuacion2[i].getNumero2() > 0) {
                                        System.out.print("+");
                                    }
                                    System.out.print(ecuacion2[i].getNumero2() + "" + ecuacion2[i].getVariable2() + "" + ecuacion2[i].getExponente2());

                                }
                   }
                    System.out.println("");
                  
                    break;
                    
                case 6:
                    
                    //Restar los Polinomos 1 y 2
                    u =1;
                    y=0;
                    //Conocemos que los exponentes disminuiran de uno por uno
                    //Ejemplo si n es 5, sera x5, x4, x3, x2 y x1
                   total = n2 +n;
                    //Inicializar variables
                   if(n==0 || n2 ==0){
                        System.out.println("---------- No Se ha completado la Resta ----------");
                        System.out.println(" ");
                    }else{
                       System.out.println("---------- Resta ----------");
                       for(int i=0; i<n; i++){
                        if(ecuacion[i].getNumero()>0){
                            System.out.print("+");
                        }
                        System.out.print(ecuacion[i].getNumero()+""+ecuacion[i].getVariable()+""+ecuacion[i].getExponente());
                    }
                       
                   for(int i=0; i<n2; i++){
                                    if (ecuacion2[i].getNumero2() < 0) {
                                        System.out.print("+");
                                    }
                                    System.out.print(-1*(ecuacion2[i].getNumero2()) + "" + ecuacion2[i].getVariable2() + "" + ecuacion2[i].getExponente2());

                                }

                    }

                    
                     System.out.println("");
                    break;
                    
                case 7:
                    
                    System.out.println("----------- Pasa un Excelente dia ----------");
                    System.out.println("------ Gracias por utilizar mi programa ------");
                    break;
                default:
                    System.out.println("No es una opcion del menu -- Intentalo Nuevamente");
                    System.out.println(" ");
            
            
            
            }
            
        
        
        
        
        }catch(Exception e){
                System.out.println("Respuesta no valida -- Intentalo Nuevamente");
                opc =0;
                System.out.println(" ");
        
        }
        }


    
    }
    
}