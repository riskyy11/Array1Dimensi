
package array;

/**
 *
 * @author riskyy
 */
import java.util.Scanner;
import java.util.stream.*;
public class Array1Dimensi {
    public static void main(String[] args) {
        
     Scanner sc= new Scanner(System.in);
        String belanja[]=new String[5];
        int harga[]= new int[5];
        int jumlah[]= new int[5];
        int total[]= new int [5];
        int pilih=0;
        int item = 0;
        int jum;
        int pilihsubmenu,uang, kembalian;
        int sum=IntStream.of(total).sum();
        
        do{
            System.out.println("Daftar Menu");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("1. Pecel");
            System.out.println("2. Soto");
            System.out.println("3. Sate");
            System.out.println("4. Teh");
            System.out.println("5. Jeruk");
            System.out.println("6. Selesai");
            System.out.print("Pilih: ");
            pilih=sc.nextInt();
            System.out.println();
            switch(pilih){
                case 1:
                    System.out.println("1. Pecel Madiun   : Rp.15000");
                    System.out.println("2. Pecel Semanggi : Rp.17000");
                    System.out.print("Pilih : ");
                    pilihsubmenu=sc.nextInt();
                    if(pilihsubmenu==1){
                      if(item<belanja.length){
                      belanja[item]="Pecel Madiun";
                      harga[item]= 15000;
                      System.out.print("Jumlah: ");
                      jum=sc.nextInt();
                      jumlah[item]=jum;
                      System.out.println();
                      total[item]= harga[item]*jumlah[item];
                      }else System.out.println("Keranjang Penuh!");
                    }else if(pilihsubmenu==2){
                      if(item<belanja.length){
                      belanja[item]="Pecel Semanggi";
                      harga[item]= 17000;
                      System.out.print("Jumlah: ");
                      jum=sc.nextInt();
                      jumlah[item]=jum;
                      System.out.println();
                      total[item]= harga[item]*jumlah[item];
                      }else System.out.println("Keranjang Penuh!");
                    }
                    break;
                case 2:
                    System.out.println("1. Soto Ayam  : Rp.10000");
                    System.out.println("2. Soto Daging: Rp.12000");
                    System.out.print("Pilih : ");
                    pilihsubmenu=sc.nextInt();
                    if(pilihsubmenu==1){
                      if(item<belanja.length){
                      belanja[item]="Soto Ayam";
                      harga[item]= 10000;
                      System.out.print("Jumlah : ");
                      jum=sc.nextInt();
                      System.out.println();
                      jumlah[item]=jum;
                      total[item]= harga[item]*jumlah[item];
                      }else System.out.println("Keranjang Penuh!");
                    }else if(pilihsubmenu==2){
                      if(item<belanja.length){
                      belanja[item]="Soto Daging";
                      harga[item]= 12000;
                      System.out.print("Jumlah : ");
                      jum=sc.nextInt();
                      System.out.println();
                      jumlah[item]=jum;
                      total[item]= harga[item]*jumlah[item];
                      }else System.out.println("Keranjang Penuh!");
                    }
                    break;
                case 3:
                    System.out.println("1. Sate Ayam    : Rp.13000");
                    System.out.println("2. Sate Kambing : Rp.16000");
                    System.out.print("Pilih : ");
                    pilihsubmenu=sc.nextInt();
                    if(pilihsubmenu==1){
                      if(item<belanja.length){
                      belanja[item]="Sate Ayam";
                      harga[item]= 13000;
                      System.out.print("Jumlah : ");
                      jum=sc.nextInt();
                      System.out.println();
                      jumlah[item]=jum;
                      total[item]= harga[item]*jumlah[item];
                      }else System.out.println("Keranjang Penuh!");
                    }else if(pilihsubmenu==2){
                      if(item<belanja.length){
                      belanja[item]="Sate Kambing";
                      harga[item]= 16000;
                      System.out.print("Jumlah : ");
                      jum=sc.nextInt();
                      System.out.println();
                      jumlah[item]=jum;
                      total[item]= harga[item]*jumlah[item];
                      }else System.out.println("Keranjang Penuh!");
                    }
                    break;
                case 4:
                    System.out.println("1. Es Teh       : Rp.4000");
                    System.out.println("2. Teh Hangat   : Rp.3000");
                    System.out.print("PIlih : ");
                    pilihsubmenu=sc.nextInt();
                    if(pilihsubmenu==1){
                      if(item<belanja.length){
                      belanja[item]="Es Teh   ";
                      harga[item]= 4000;
                      System.out.print("Jumlah : ");
                      jum=sc.nextInt();
                      System.out.println();
                      jumlah[item]=jum;
                      total[item]= harga[item]*jumlah[item];
                      }else System.out.println("Keranjang Penuh!");
                    }else if(pilihsubmenu==2){
                      if(item<belanja.length){
                      belanja[item]="Teh Hangat";
                      harga[item]= 3000;
                      System.out.print("Jumlah : ");
                      jum=sc.nextInt();
                      System.out.println();
                      jumlah[item]=jum;
                      total[item]= harga[item]*jumlah[item];
                      }else System.out.println("Keranjang Penuh!");
                    }
                    break;
                case 5:
                    System.out.println("1. Es Jeruk       : Rp.4000");
                    System.out.println("2. Jeruk Hangat   : Rp.4000");
                    System.out.print("Pilih : ");
                    pilihsubmenu=sc.nextInt();
                    if(pilihsubmenu==1){
                      if(item<belanja.length){
                      belanja[item]="Es Jeruk   ";
                      harga[item]= 4000;
                      System.out.print("Jumlah : ");
                      jum=sc.nextInt();
                      System.out.println();
                      jumlah[item]=jum;
                      total[item]= harga[item]*jumlah[item];
                      }else System.out.println("Keranjang Penuh!");
                    }else if(pilihsubmenu==2){
                      if(item<belanja.length){
                      belanja[item]="Jeruk Hangat";
                      harga[item]= 4000;
                      System.out.print("Jumlah : ");
                      jum=sc.nextInt();
                      System.out.println();
                      jumlah[item]=jum;
                      total[item]= harga[item]*jumlah[item];
                      }else System.out.println("Keranjang Penuh!");
                    }
                    break;
                case 6:
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("Daftar Belanja");
                    System.out.println("no\tBarang\t\tHarga\t\tJumlah\t\tTotal");
                    System.out.println("----------------------------------------------------------------------");
                    for (int i = 0; i < item; i++) {
                        sum += total[i];
                        System.out.print((i+1)+"\t"+belanja[i]);
                        System.out.print("\t"+harga[i]+" ");
                        System.out.print("\t\t["+jumlah[i]+"]");
                        System.out.println("\t\t"+total[i]+" ");
                        System.out.println();
                    }
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("Grand Total: Rp."+sum);
                    System.out.println();
                    System.out.print("Uang : Rp.");
                    uang=sc.nextInt();
                    if(uang==sum){
                    System.out.println("Uang Pas");
                    }else if(uang>sum){
                        kembalian=uang-sum;
                        System.out.println("Kembalian : Rp."+kembalian);
                    }else if(uang<sum){
                        System.out.println("Uang Kurang");
                    } System.out.println();
                    System.out.println("----------------------------------------------------------------------");
                    break;
            }
            item++;
            if(item>5){
                System.out.println("jumlah yang dibeli: "+item);
                break;
            }
        }while(pilih!=6);
        System.out.println("\t\tTerima Kasih\t\t");
        System.out.println("----------------------------------------------------------------------");
        
    }
    }



