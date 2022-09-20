public class Parte2 {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.SumarPuerta();
        System.out.println(miCoche.numpuertas);
    }

}
    class Coche {
        public int numpuertas = 4;

        public void SumarPuerta(){
            this.numpuertas++;
        }
    }

