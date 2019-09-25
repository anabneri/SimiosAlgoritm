public class DnaSimio {

    // método estático, item em comum em toda a classe
    static boolean isSimian (String[] dna) {

        String[][] simio = new String[6][6];

        // percorrer as duas coisas ao mesmo tempo
        for (int i = 0; i < 6; i++) {

            // quebrando a string pra retornar vetor de string com o .split
            // percorrendo acad linha da materiz
            dna[i].split("");
            String[] split = dna[i].split("");

            for (int j = 0; j < 6; j++) {

                // percorrer cada item que eu "quebrei" anteriormente
                // e percorrer cada linha da posição da matriz

                simio[i][j] = split[j];
            }
        }

        // Visualizar a matriz
        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 6; j++) {

                System.out.print(simio [i][j] + " ");
            }

            System.out.println();
        }

        return true;
    }

}
