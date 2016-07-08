
package conjuntos;

import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;


public class Menu {
    private Set a = new TreeSet();
    private Set b = new TreeSet();
    
    private U u = new U();
    private I i = new I();
    private D d = new D();
    private DS ds = new DS();

    Menu(){
        ejecutar();
    }
    
    public void ejecutar(){
        int res;
        Scanner read = new Scanner(System.in);
        do{
            System.out.println("Que deseas hacer "+"\n"+"1.Insertar Conjuntos"+"\n"+"2.AUB"+"\n"+"3.AnB"
                               +"\n"+"4.A-B"+"\n"+"5.A--B"+"\n"+"6.Mostrar"+"\n"+"7.Salir"+"\n");
            res = read.nextInt();
            switch (res){
                case 1:
                    Scanner read1 = new Scanner(System.in);
                    Scanner read2 = new Scanner(System.in);
                    int r;
                    do{
                        System.out.println("conjuntos "+"\n"+"1.A"+"\n"+"2.B"+"\n"+"3.salir");
                        r=read1.nextInt();
                        if(r==1){
                            a.clear();
                            String re;
                            System.out.println("$ Termina");
                            do{     
                                re = read2.nextLine();
                                if(!re.equals("$")){
                                    a.add(re);
                                }
                            }while(!re.equals("$"));
                        }
                        else if(r==2){
                            b.clear();
                            String re;
                            System.out.println("$ Termina");
                            do{        
                                re = read2.nextLine();
                                if(!re.equals("$")){
                                    b.add(re);
                                }
                            }while(!re.equals("$"));
                        }
                        else{
                            System.out.println("xao...");
                        }
                    }while(r!=3);
                    break;
                case 2:
                    System.out.println(u.union(a, b));
                    break;
                case 3:
                    System.out.println(i.Interseccion(a,b));
                    break;
                case 4:
                    System.out.println(d.Diferencia(a, b));
                    break;
                case 5:
                    System.out.println(ds.DSim(a, b));
                    break;
                case 6:
                    System.out.println(a);
                    System.out.println(b);
                    break;
                case 7:
                    System.out.println("Adios.. ");
                    break;
            }
        }while(res!=7);
    }
    
}
