import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class tugasjavabasicridho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sandinama = "Administrator";
        int sandipasword;
        int sandipin = 123456789;
        System.out.print("Nama: ");
        sandinama = sc.nextLine();
        System.out.print("pasword: ");
        sandipasword = sc.nextInt();
        System.out.print("pin: ");
        sandipin = sc.nextInt();

        if (sandinama.equals("Administrator") && sandipasword >= 11111 && sandipin == 123456789) {
            System.out.println("Akses Diterima, Selamat Datang!!");

            int no1 = 1;

            do {
System.out.println("  Silahkan Pilih Menu ");
                System.out.println("1.Bangun Ruang/Datar\n2.Konversi\n3.Secret Menu\n4.Exit");
                System.out.print("Masukan nomer yang anda pilih: ");
                no1 = sc.nextInt();
                switch (no1) {
                    case 1:

                        int br1 = 1;
                        do {
                            System.out.println("bangunan ruang/datar");
                            System.out.println("1.Luas Panjang\n2. Volume\n3.exit");
                            System.out.println("Masukan nomer yang anda pilih: ");
                            br1 = sc.nextInt();
                            switch (br1) {
                                case 1:
                                    int l1 = 1;
                                    do {
                                        System.out.println("Luas");

                                        System.out.println(
                                                "1.Persegi Panjang\n2. Persegi\n3. Segitiga \n4. Lingkara\n5.exit");
                                        System.out.println("Masukan nomer yang anda pilih: ");
                                        l1 = sc.nextInt();
                                        switch (l1) {
                                            case 1:
                                                int pp1;
                                                int pp2;
                                                System.out.println("persegi panjang");
                                                System.out.print("masukan panjang :");
                                                pp1 = sc.nextInt();
                                                System.out.print("masukan lebar :");
                                                pp2 = sc.nextInt();
                                                System.out.println("jadi bila " + pp1 + " X " + pp2 + " maka hasilnya "
                                                        + (pp1 * pp2) + " M??");

                                                break;
                                            case 2:
                                                int p1;

                                                System.out.println("persegi");
                                                System.out.print("masukan sisi :");
                                                p1 = sc.nextInt();
                                                System.out.println("jadi bila " + p1 + " X " + p1 + " maka hasilnya "
                                                        + (p1 * p1) + " M??");
                                                break;
                                            case 3:
                                                int alas;
                                                int t;

                                                System.out.println("segitiga");
                                                System.out.print("masukan alas :");
                                                alas = sc.nextInt();
                                                System.out.print("masukan tinggi :");
                                                t = sc.nextInt();
                                                System.out.println("jadi bila 1/2 X " + alas + " X " + t + " maka hasilnya "
                                                        + (alas* t/2 ) +  "M??");
                                                break;
                                            case 4:
                                                int jj;

                                                System.out.println("lingkaran");
                                                System.out.print("masukan sisi :");
                                                jj = sc.nextInt();
                                                System.out.println("jadi bila 22/7" + jj + "X" + jj + " maka hasilnya "
                                                        + (22*  jj * jj /7) + "M??");
                                                break;

                                            default:
                                                break;
                                        }
                                    } while (l1 < 5);
                                    System.out.println();
                                    break;
                                case 2:
                                    int V1 = 1;
                                    do {
                                        System.out.println("Volume");
                                        System.out.println("1.balok\n2.kubus\n3.bola \n4.exit");
                                        System.out.println("Masukan nomer yang anda pilih: ");
                                        V1 = sc.nextInt();
                                        switch (V1) {
                                            case 1:
                                                int panjang1;
                                                int lebar1;
                                                int tinggi1;
                                                System.out.println("Balok");
                                                System.out.print("masukan panjang :");
                                                panjang1 = sc.nextInt();
                                                System.out.print("masukan lebar :");
                                                lebar1 = sc.nextInt();
                                                System.out.print("masukan tinggi :");
                                                tinggi1 = sc.nextInt();
                                                System.out.println("jadi bila " + panjang1 + " X " + lebar1 + " X "
                                                        + tinggi1
                                                        + " maka hasilnya " + (panjang1 * lebar1 * tinggi1) + "Liter");
                                                break;
                                            case 2:
                                                int sisi1;

                                                System.out.println("kubus");
                                                System.out.print("masukan sisi :");
                                                sisi1 = sc.nextInt();

                                                System.out.println(
                                                        "jadi bila " + sisi1 + " X " + sisi1 + " X " + sisi1
                                                                + " maka hasilnya "
                                                                + (sisi1 * sisi1 * sisi1) + " Liter");
                                                break;
                                            case 3:
                                                int sisi2;

                                                System.out.println("bola");
                                                System.out.print("masukan sisi :");
                                                sisi2 = sc.nextInt();

                                                System.out.println(
                                                        "jadi bila 4/3 X 22/7 X " + sisi2 + " X " + sisi2 + " X "
                                                                + sisi2
                                                                + " maka hasilnya "
                                                                + (4*sisi2*sisi2*sisi2/3*22/7) + "Liter");
                                                break;

                                            default:
                                                break;
                                        }
                                    } while (V1 < 4);
                                default:
                                    break;

                            }
                        } while (br1 < 3);

                        break;
                    case 2:
                        int K1 = 1;
                        do {
                            System.out.println("Konversion");
                            System.out.println("1.derajat\n2.Panjang\n3.berat \n4.exit");
                            System.out.println("Masukan nomer yang anda pilih: ");
                            K1 = sc.nextInt();
                            switch (K1) {
                                case 1:
                                int D3 = 1;
                                do {
                                    System.out.println("Derajat celcius");
                                    System.out.println("1. celcius\n2. farenhait\n3.reamur \n 4.exit");
                                    System.out.println("Masukan nomer yang anda pilih: ");
                                    D3 = sc.nextInt();
                                    switch (D3) {
                                        case 1:
                                        int c1 =1;
                                        do {
                                            System.out.println("Derajat celcius");
                                            System.out.println("1. celcius ke farenhait \n2. celcius ke reamur \n 3.exit");
                                            System.out.println("Masukan nomer yang anda pilih: ");
                                            c1 = sc.nextInt();
                                            switch (c1) {
                                                case 1:
                                                Float c;
                                          
                                                System.out.println("Farenhiat");
                                                System.out.println("Masukan nomer yang anda pilih: ");
                                                c = sc.nextFloat();
    
                                                System.out.println(
                                                        c+"??C" + " di ubah ke " + ((9 * c/5) + 32) + " ??F");
                                                ; 
                                                    break;
                                            case 2:
                                            float R;
                                           
                                            System.out.println("reamur");
                                            System.out.println("Masukan nomer yang anda pilih: ");
                                            R = sc.nextFloat();

                                            System.out.println(R +"??C"+ " di ubah ke "
                                                    + (4* R /5) + " ??R");
                                            ;
                                            break;
                                                default:
                                                    break;
                                            }
                                        } while (c1 <3);
                                           
                                            break;
                                        case 2:
                                            int F7 = 1;
                                            do {
                                                System.out.println("Derajat farenhait");
                                            System.out.println("1. farenhait ke celcius \n2. farenhait ke reamur \n 3.exit");
                                            System.out.println("Masukan nomer yang anda pilih: ");
                                            F7 = sc.nextInt();
                                            switch (F7) {
                                                case 1:
                                                Float F8;
                                          
                                                System.out.println("calecius");
                                                System.out.println("Masukan nomer yang anda pilih: ");
                                                F8 = sc.nextFloat();
    
                                                System.out.println(
                                                        F8+"??F" + " di ubah ke " + ((F8-32) * 5/9) + " ??C");
                                                ; 
                                                    break;
                                                case 2:
                                                Float F9;
                                          
                                                System.out.println("reamur");
                                                System.out.println("Masukan nomer yang anda pilih: ");
                                                F9 = sc.nextFloat();
    
                                                System.out.println(
                                                        F9+"??F" + " di ubah ke " + ((F9-32) * 4/9) + " ??R");
                                                ; 
                                                    break;
                                            
                                                default:
                                                    break;
                                            }
                                            } while (F7<3);
                                            break;
                                      case 3:
                                      int R1=1;
                                     do {
                                        System.out.println("Derajat Reamur");
                                        System.out.println("1. reamur ke celcius \n2. reamur ke farenhait \n 3.exit");
                                        System.out.println("Masukan nomer yang anda pilih: ");
                                        R1 = sc.nextInt();
                                        switch (R1) {
                                            case 1:
                                            float R8;
                                          
                                            System.out.println("celcius");
                                            System.out.println("Masukan nomer yang anda pilih: ");
                                            R8 = sc.nextFloat();

                                            System.out.println(
                                                    R8+"??R" + " di ubah ke " + (R8-32 * 5/4) + " ??C");
                                            ; 
                                                break;
                                            case 2:
                                            float R9;
                                          
                                            System.out.println("farenhait");
                                            System.out.println("Masukan nomer yang anda pilih: ");
                                            R9 = sc.nextFloat();

                                            System.out.println(
                                                    R9+"??R" + " di ubah ke " + (R9 * 9/4+32) + " ??F");
                                            ; 
                                                break;
                                        
                                            default:
                                                break;
                                        }
                                     } while (R1<3);

                                      break;
                                        default:
                                            break;
                                    }
                                } while (D3 < 3);
break;
                                case 2:

                                    int jarak1 = 1;
                                    do {
                                        System.out.println("Panjang");
                                        System.out.println(
                                                "1.kilometer\n2.hektometer\n3.dekameter\n4.desimeter\n5.centimeter\n6.milimeter\n7.exit  ");
                                        System.out.println("Masukan nomer yang anda pilih: ");
                                        jarak1 = sc.nextInt();
                                        switch (jarak1) {
                                            case 1:
                                                float km;
                                                System.out.println("kilometer");
                                                System.out.println("Masukan nomer meter");
                                                km = sc.nextFloat();
                                                System.out.println("jadi " + km + "meter di ubah ke Km hasilnya: "
                                                        + (km / 1000) + "Km??");
                                                break;
                                            case 2:
                                                float hm;
                                                System.out.println("hektometer");
                                                System.out.println("Masukan nomer meter");
                                                hm = sc.nextFloat();
                                                System.out.println("jadi " + hm + "meter di ubah ke hm hasilnya: "
                                                        + (hm / 100) + "hm");
                                                break;
                                            case 3:
                                                float dam;
                                                System.out.println("dekameter");
                                                System.out.println("Masukan nomer meter");
                                                dam = sc.nextFloat();
                                                System.out.println("jadi " + dam + "meter di ubah ke dam hasilnya: "
                                                        + (dam / 10) + "dam");
                                                break;
                                            case 4:
                                                float dm;
                                                System.out.println("desimeter");
                                                System.out.println("Masukan nomer meter");
                                                dm = sc.nextFloat();
                                                System.out.println(
                                                        "jadi " + dm + "meter di ubah ke dm hasilnya: " + (dm * 10)
                                                                + "dm");
                                                break;
                                            case 5:
                                                float cm;
                                                System.out.println("centimeter");
                                                System.out.println("Masukan nomer meter");
                                                cm = sc.nextFloat();
                                                System.out.println(
                                                        "jadi " + cm + "meter di ubah ke cm hasilnya: " + (cm * 100)
                                                                + "cm");
                                                break;
                                            case 6:
                                                float mm;
                                                System.out.println("milimeter");
                                                System.out.println("Masukan nomer meter");
                                                mm = sc.nextFloat();
                                                System.out.println(
                                                        "jadi " + mm + "meter di ubah ke mm hasilnya: " + (mm * 1000)
                                                                + "mm");
                                                break;

                                            default:
                                                break;
                                        }
                                    } while (jarak1 < 7);

                                    break;
                                case 3:
                                    int berat1 = 1;
                                    do {
                                        System.out.println("berat");
                                        System.out.println(
                                                "1.kilogram\n2.hekgram\n3.dekagram\n4.desigram\n5.centigram\n6.miligram\n7.exit  ");
                                        System.out.println("Masukan nomer yang anda pilih: ");
                                        berat1 = sc.nextInt();
                                        switch (berat1) {
                                            case 1:
                                                float kg;
                                                System.out.println("kilogram");
                                                System.out.println("Masukan nomer gram: ");
                                                kg = sc.nextFloat();
                                                System.out.println("jadi " + kg + "gram di ubah ke Kg hasilnya: "
                                                        + (kg / 1000) + "Kg");
                                                break;
                                            case 2:
                                                float hg;
                                                System.out.println("hektogram");
                                                System.out.println("Masukan nomer gram: ");
                                                hg = sc.nextFloat();
                                                System.out.println(
                                                        "jadi " + hg + "gram di ubah ke hg hasilnya: " + (hg / 100)
                                                                + "hg");
                                                break;
                                            case 3:
                                                float dag;
                                                System.out.println("dekagram");
                                                System.out.println("Masukan nomer gram: ");
                                                dag = sc.nextFloat();
                                                System.out.println("jadi " + dag + "gram di ubah ke dag hasilnya: "
                                                        + (dag / 10) + "dag");
                                                break;
                                            case 4:
                                                float dg;
                                                System.out.println("desigram");
                                                System.out.println("Masukan nomer gram: ");
                                                dg = sc.nextFloat();
                                                System.out.println(
                                                        "jadi " + dg + "gram di ubah ke dg hasilnya: " + (dg * 10)
                                                                + "dg");
                                                break;
                                            case 5:
                                                float cg;
                                                System.out.println("centigram");
                                                System.out.println("Masukan nomer gram: ");
                                                cg = sc.nextFloat();
                                                System.out.println(
                                                        "jadi " + cg + "gram di ubah ke cg hasilnya: " + (cg * 100)
                                                                + "cg");
                                                break;
                                            case 6:
                                                float mg;
                                                System.out.println("miligram");
                                                System.out.println("Masukan nomer gram: ");
                                                mg = sc.nextFloat();
                                                System.out.println(
                                                        "jadi " + mg + "gram di ubah ke mg hasilnya: " + (mg * 1000)
                                                                + "mg");
                                                break;

                                            default:
                                                break;
                                        }
                                    } while (berat1 < 7);

                                default:
                                    break;
                            }
                            // koversion
                        } while (K1 < 4);
                        break;
                    // 3
                    case 3:

                        String unik2;

                        System.out.println("Masukan kode unik: ");
                        unik2 = sc.next();
                        if (unik2.length() >= 7 || unik2.length() == 10) {
                            System.out.println("Selamat Datang VIP!!");

                            ;

                            int vip = 1;

                            do {
                                System.out.println("  Silahkan Pilih Menu Rahasia ");
                                System.out.println("1.upercase\n2.lowercase\n3.reverse\n4.exit");
                                System.out.println("Pilih nomer rahasia");
                                vip = sc.nextInt();
                                switch (vip) {
                                    case 1:
                                        String upercase ;
                                        System.out.print("Ketik apa yang mau di upercase/kapital: ");
                                        sc.nextLine();
                                        upercase = sc.nextLine().toUpperCase();
                                        System.out.println("upercase: " + upercase);
                                        break;
                                    case 2:
                                    String lowercase ;
                                    System.out.print("Ketik apa yang mau di lowercase/diperkecil: ");
                                    sc.nextLine();
                                    lowercase = sc.nextLine().toLowerCase();
                                    System.out.println("lowercase: " + lowercase);
                                        break;
                                    case 3:
                                    String kebalik;
                                    System.out.println("Ketik apa yang ingin dijadikan Reverse/dibalikan : ");
                                     sc.nextLine();
                                    kebalik = sc.nextLine();

                                        List<String> List = Arrays.asList(kebalik.split(" "));
                                        System.out.print("Reversed : ");
                                        Collections.reverse(List);
                                        System.out.println(String.join(" ",List )); 
                                    break;
                                  
                                    case 4:
                                    sc.close();
                                    break;

                                    
                                    
                                    default:
                                        break;
                                }
                            } while (vip < 4);
                         
                            // rahasia
                        } else {
                            System.out.println("kode salah silahkan coba lagi");
                        }
                        break;
                    default:
                        break;
                }
            } while (no1 < 4);
            // login
       
        } else {
            System.out.println("Akses Ditolak");
            sc.close();
        }
        // sc.close();
    }
}
