package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // creeaza un program care accepta un sir de caractere si afiseaza de cate ori contine un subsir ales inainte
        //ex:Astazi invat Java si zilnic fac aplicatii practice." subsir: zi - va fi gasit de 2 ori
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti sirul dorit");
        String sir = scan.nextLine();
        System.out.println("Introduceti subsirul dorit");
        String subsir = scan.nextLine();
        aparitii(sir,subsir);


    }
    public static void aparitii(String sir, String subsir){
        int nrAparitii = 0;
        for (int i = 0; i < sir.length(); i++) {
            if (sir.charAt(i) == subsir.charAt(0)) {
                for (int j = 0; j < subsir.length(); j++)
                    if (sir.charAt(i + 1) == subsir.charAt(j)) {
                        nrAparitii++;
                    }
            }
        }
        if (nrAparitii == 0)
            System.out.println("subsirul " + subsir + " nu apare in sirul introdus " + sir);
        else
            System.out.println("Subsirul '"+subsir+"' apare de "+ nrAparitii+" ori in sirul '"+sir+"'");


    }
}
