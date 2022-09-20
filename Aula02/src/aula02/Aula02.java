package aula02;
public class Aula02 {
    public static void main(String[] args) {
        CanetaPreta c1 = new CanetaPreta();  
        c1.cor="Azul";
        c1.ponta=0.5f;
        c1.tampar();
        
        c1.rabiscar();
        c1.status();
        
        CanetaPreta c2 = new CanetaPreta();
        c2.modelo = "Hostnest";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
        
    }
    
}
