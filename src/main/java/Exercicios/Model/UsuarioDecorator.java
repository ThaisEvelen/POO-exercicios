package Exercicios.Model;

import Exercicios.Interfaces.Publicavel;

public class UsuarioDecorator implements Publicavel {
        private Publicavel usuario;

        public UsuarioDecorator(Publicavel usuario) {
            this.usuario = usuario;
        }

        @Override
        public void publicar() {
            usuario.publicar();
            System.out.println("Publicando como usuário...");
        }
}
