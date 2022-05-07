import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputdata = new Scanner(System.in);
        List<Watchman> wat = new ArrayList<>();
        List<Accountant> acou = new ArrayList<>();
        List<Admin> admini = new ArrayList<>();
        List<CleaningStaff> personal = new ArrayList<>();
        boolean flagStop = false;
        while (!flagStop) {
            System.out.println("Elije que proceso desea realizar 1 -ingresar datos, 2- imprimir, 3- salir");
            int option = Integer.parseInt(inputdata.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Que perfil desea crear en la base de datos seleccione (1:Watchman, 2 : Accountant, 3:" +
                            " Admin, 4: CleaningStaff, 5: salir )");
                    option = Integer.parseInt(inputdata.nextLine());
                    switch (option) {
                        case 1:
                            while (option != 0) {
                                Watchman vigilante = new Watchman();
                                System.out.println("Digite su nombre ");
                                vigilante.setName(inputdata.nextLine());
                                System.out.println("Digite su identificacion");
                                vigilante.setIdentificacion(inputdata.nextLine());
                                System.out.println("Digite la edad");
                                vigilante.setAge(Integer.parseInt(inputdata.nextLine()));
                                System.out.println("Que tipo de arma ");
                                vigilante.setWeapon(inputdata.nextLine());
                                System.out.println("Digite cuantos dias de trabajo");
                                vigilante.setWorkday(inputdata.nextLine());
                                System.out.println("Desea continuar con otro vigilante 1- si, 0 -no");
                                option = Integer.parseInt(inputdata.nextLine());
                                wat.add(vigilante);
                            }
                            break;
                        case 2:
                            while (option != 0) {
                                Accountant contador = new Accountant();
                                System.out.println("Digite su nombre ");
                                contador.setName(inputdata.nextLine());
                                System.out.println("Digite su identificacion");
                                contador.setIdentificacion(inputdata.nextLine());
                                System.out.println("Digite la edad");
                                contador.setAge(Integer.parseInt(inputdata.nextLine()));
                                System.out.println("Que tipo de lider ");
                                contador.setLeader(inputdata.nextLine());
                                System.out.println("Digite el estacionamiento");
                                contador.setParking(inputdata.nextLine());
                                System.out.println("Desea continuar con otro contador 1- si, 0 -no");
                                option = Integer.parseInt(inputdata.nextLine());
                                acou.add(contador);
                            }
                            break;
                        case 3:
                            while (option != 0) {
                                Admin admon = new Admin();
                                System.out.println("Digite su nombre ");
                                admon.setName(inputdata.nextLine());
                                System.out.println("Digite su identificacion");
                                admon.setIdentificacion(inputdata.nextLine());
                                System.out.println("Digite la edad");
                                admon.setAge(Integer.parseInt(inputdata.nextLine()));
                                System.out.println("Que tipo de lider ");
                                admon.setLeader(inputdata.nextLine());
                                System.out.println("Digite el estacionamiento");
                                admon.setParking(inputdata.nextLine());
                                System.out.println("Desea continuar con otro administrador 1- si, 0 -no");
                                option = Integer.parseInt(inputdata.nextLine());
                                admini.add(admon);
                            }
                            break;
                        case 4:
                            while (option != 0) {
                                CleaningStaff aseo = new CleaningStaff();
                                System.out.println("Digite su nombre ");
                                aseo.setName(inputdata.nextLine());
                                System.out.println("Digite su identificacion");
                                aseo.setIdentificacion(inputdata.nextLine());
                                System.out.println("Digite la edad");
                                aseo.setAge(Integer.parseInt(inputdata.nextLine()));
                                System.out.println("Digite el dia libre");
                                aseo.setDayOff(inputdata.nextLine());
                                System.out.println("Desea continuar con otro personal del aseo 1- si, 0 -no");
                                option = Integer.parseInt(inputdata.nextLine());
                                personal.add(aseo);
                            }
                            break;
                        case 5:
                            break;
                    }
                    break;
                case 2:
                   boolean flag = false;
                    while (!flag) {
                        System.out.println("Que perfil desea imprimir en la base de datos seleccione (1:Watchman," + " 2 : Accountant, 3:" +
                                " Admin, 4: CleaningStaff, 5: salir )");
                        int optiones = Integer.parseInt(inputdata.nextLine());
                        switch (optiones) {
                            case 1:
                                for (int i = 0; i < wat.size(); i++) {
                                    System.out.println(wat.get(i).getName());
                                    System.out.println(wat.get(i).getIdentificacion());
                                    System.out.println(wat.get(i).getAge());
                                    System.out.println(wat.get(i).getWeapon());
                                    System.out.println(wat.get(i).getWorkday());
                                }
                                break;
                            case 2:
                                for (int i = 0; i < acou.size(); i++) {
                                    System.out.println(acou.get(i).getName());
                                    System.out.println(acou.get(i).getIdentificacion());
                                    System.out.println(acou.get(i).getAge());
                                    System.out.println(acou.get(i).getLeader());
                                    System.out.println(acou.get(i).getParking());
                                }
                                break;
                            case 3:
                                for (int i = 0; i < admini.size(); i++) {
                                    System.out.println(admini.get(i).getName());
                                    System.out.println(admini.get(i).getIdentificacion());
                                    System.out.println(admini.get(i).getAge());
                                    System.out.println(admini.get(i).getLeader());
                                    System.out.println(admini.get(i).getParking());
                                }
                                break;
                            case 4:
                                for (int i = 0; i < personal.size(); i++) {
                                    System.out.println(personal.get(i).getName());
                                    System.out.println(personal.get(i).getIdentificacion());
                                    System.out.println(personal.get(i).getAge());
                                    System.out.println(personal.get(i).getDayOff());
                                }
                                break;
                            case 5:
                                flag = true;
                                break;

                        }
                    }
                        break;
                        case 3 :
                                flagStop = true;
                                break;
                    }
            }
        }
}
