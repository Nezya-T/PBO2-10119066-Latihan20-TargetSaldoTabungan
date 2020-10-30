/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119066.latihan20.targetsaldotabungan;

/**
 *
 * @author Neyza-T
 * Nama  : Nezya Tariska
 * Nim   : 10119066
 * Kelas : PBO/IF2
 */
public class PBOIF210119066Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo = 3500000;
        int i = 1;
        while (saldo < 6000000){
            saldo = saldo + (int)((float) saldo*0.08F);
            System.out.println("saldo di bulan ke-"+ i+"Rp "+saldo);
            i++;
        }
    }
    
}
