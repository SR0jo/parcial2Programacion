import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @org.junit.jupiter.api.Test
    void diagonalInversa() {
        String[] dna = {"ATGCGA", "CAGTAC", "TTAATT","AGACGG","GAGTCA","ACACTG"};
        boolean result = Main.diagonalInversa(dna);
        assertTrue( result, "La prueba para la condición diagonal verdadera falló");
        System.out.println("Resultado de la prueba: " + result);

        String[] dna2 = {"ATGCGAT", "CAGTACTT", "TTAATTA","AGACGGA","GTGTCAA","CCACTGA"};
        result = Main.diagonalInversa(dna2);
        assertTrue( result, "La prueba para la condición diagonal verdadera falló");
        System.out.println("Resultado de la prueba: " + result);

        String[] dna3 = {"ATGCGT", "CACTAC", "TCAATT","CGACGG","GTGTCA","CCACTG"};
        result = Main.diagonalInversa(dna3);
        assertTrue( result, "La prueba para la condición diagonal verdadera falló");
        System.out.println("Resultado de la prueba: " + result);

    }

    @org.junit.jupiter.api.Test
    void diagonal() {

        String[] dna = {"ATGCGA", "CAGTAC", "TAAATT","AGAAGG","GAGTCA","ACACTG"};
        boolean result = Main.diagonal(dna);
        assertTrue( result, "La prueba para la condición diagonal verdadera falló");
        System.out.println("Resultado de la prueba: " + result);

        String[] dna2 = {"ATGCGA", "CATTAC", "TTATTT","AGACTG","GTGTCA","CCACTG"};
        result = Main.diagonal(dna2);
        assertTrue( result, "La prueba para la condición diagonal verdadera falló");
        System.out.println("Resultado de la prueba: " + result);

        String[] dna3 = {"A", "TA", "GGA","TAAA","TTGGAA","TGTCAC"};
        result = Main.diagonal(dna3);
        assertTrue( result, "La prueba para la condición diagonal verdadera falló");
        System.out.println("Resultado de la prueba: " + result);

        String[] dna4 = {"CGATGA", "TACAGT", "AATTAA","GGACAG","TCAGAG","TGTCAC"};
        result = Main.diagonal(dna4);
        assertTrue( result, "La prueba para la condición diagonal verdadera falló");
        System.out.println("Resultado de la prueba: " + result);

    }

    @org.junit.jupiter.api.Test
    void lado() {
        String[] dna = {"AAAAAA", "CAGTAC", "TTTTTT","AGACCG","GTGTCA","ACACTG"};
        boolean result = Main.lado(dna);
        assertTrue( result, "La prueba para la condición diagonal verdadera falló");
        System.out.println("Resultado de la prueba: " + result);

        String[] dna2 = {"ATGCGA", "CAGTAC", "TTAATT","AGACGG","GAGTCA","ACACTG"};
        result = Main.lado(dna2);
        assertTrue( result, "La prueba para la condición diagonal verdadera falló");
        System.out.println("Resultado de la prueba: " + result);
    }

    @org.junit.jupiter.api.Test
    void arriba() {
        String[] dna = {"ATGCGA", "TAGTAC", "TTAATT","TGACGG","TAGTCA","ACACTG"};
        boolean result = Main.arriba(dna);
        assertTrue( result, "La prueba para la condición diagonal verdadera falló");
        System.out.println("Resultado de la prueba: " + result);

        String[] dna2 = {"ATGCGA", "CAGTAC", "TTAATT","AGACGG","GAGTCA","ACACTG"};
        result = Main.arriba(dna2);
        assertTrue( result, "La prueba para la condición diagonal verdadera falló");
        System.out.println("Resultado de la prueba: " + result);
    }

    @org.junit.jupiter.api.Test
    void isMutant() {
        String[] dna = {"ATGCGA", "CAGTAC", "TTAATT","AGACGG","GAGTCA","ACACTG"};
        boolean result = Main.isMutant(dna);
        assertTrue( result, "La prueba para la condición diagonal verdadera falló");
        System.out.println("Resultado de la prueba: " + result);

        String[] dna2 = {"AAAAAA", "AAAAAA", "AAAAAA","AAAAAA","AAAAAA","AAAAAA"};
        result = Main.isMutant(dna2);
        assertTrue( result, "La prueba para la condición diagonal verdadera falló");
        System.out.println("Resultado de la prueba: " + result);

        String[] dna3 = {"AAACAA", "ATAAAA", "AATTAA","AAAAAA","AAAAAA","ACCCCA"};
        result = Main.isMutant(dna3);
        assertTrue( result, "La prueba para la condición diagonal verdadera falló");
        System.out.println("Resultado de la prueba: " + result);
    }
}