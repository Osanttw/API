package com.example.soundfraude.entity;

public class Artista {

        private int id;
        private String nome;
        private String estilo;

        public Artista() {
        }

        public Artista(int id, String nome, String estilo) {
            this.id = id;
            this.nome = nome;
            this.estilo = estilo;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEstilo() {
            return estilo;
        }

        public void setEstilo(String estilo) {
            this.estilo = estilo;
        }

        @Override
        public String toString() {
            return "Artista{id=" + id + ", nome='" + nome + "', estilo='" + estilo + "'}";
        }
    }

