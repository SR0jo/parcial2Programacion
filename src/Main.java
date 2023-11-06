
public class Main {
    public static boolean diagonalInversa(String[] dna){
        for (int i = 0; i < dna.length;i++){
            for (int j = 0; j < dna[i].toCharArray().length;j++){
                try {
                    if(dna[i].toCharArray()[j] ==  dna[i+1].toCharArray()[j-1] &&
                            dna[i+2].toCharArray()[j-2] == dna[i+3].toCharArray()[j-3] &&
                            dna[i+1].toCharArray()[j-1] == dna[i+3].toCharArray()[j-3]){
                        return true;
                    }
                }catch (Exception e){
                }
            }
        }
        return false;
    }
    public static boolean diagonal(String[] dna){
        for (int i = 0; i < dna.length;i++){
            for (int j = 0; j < dna[i].toCharArray().length;j++){
                    try {
                        if(dna[i].toCharArray()[j] ==  dna[i+1].toCharArray()[j+1] &&
                                dna[i+2].toCharArray()[j+2] == dna[i+3].toCharArray()[j+3] &&
                                dna[i+1].toCharArray()[j+1] == dna[i+3].toCharArray()[j+3]){
                            return true;
                        }
                    }catch (Exception e){

                    }
            }

        }
        return false;
    }
    public static boolean lado(String[] dna){
        for (int i = 0; i < dna.length;i++){
            for (int j = 0; j < dna[i].toCharArray().length;j++){
                if(dna[i].toCharArray().length-4-j >= 0){
                    if(dna[i].toCharArray()[j] ==  dna[i].toCharArray()[j+1] &&
                            dna[i].toCharArray()[j+2] == dna[i].toCharArray()[j+3] &&
                            dna[i].toCharArray()[j+1] == dna[i].toCharArray()[j+3]){
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public static boolean arriba(String[] dna){
        for (int i = 0; i < dna.length;i++){
            for (int j = 0; j < dna[i].toCharArray().length;j++){
                if(dna.length-i-4 >= 0){
                    if(dna[i].toCharArray()[j] ==  dna[i+1].toCharArray()[j] &&
                            dna[i+2].toCharArray()[j] == dna[i+3].toCharArray()[j] &&
                            dna[i+1].toCharArray()[j] == dna[i+3].toCharArray()[j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean isMutant(String[]dna){
        if(arriba(dna ) || lado(dna) || diagonal(dna) || diagonalInversa(dna)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        String[] dna = {"ACCTTG",
                "CACCTT",
                "TTAGGT",
                "CTAAGG",
                "GGTATG",
                "GCTACT"};
        if (isMutant(dna))
        System.out.println("Es mutante");
        else
            System.out.println("No es mutante");

    }
}