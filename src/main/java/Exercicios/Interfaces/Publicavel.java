package Exercicios.Interfaces;

public interface Publicavel { void publicar();
}

class Autor implements Publicavel {
    @Override
    public void publicar() {
        System.out.println("Publicando como autor...");
    }
}


