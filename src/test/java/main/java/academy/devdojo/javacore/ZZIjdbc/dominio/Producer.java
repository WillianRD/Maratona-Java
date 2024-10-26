package main.java.academy.devdojo.javacore.ZZIjdbc.dominio;

import java.util.Objects;

public class Producer {
    private Integer id;
    private String name;

    /*
    Metodo privado
    Statico - Faz parte da class
    Final - não pode ser extendido por nenhuma classe
     */
    public static final class ProducerBuilder {
        private Integer id;
        private String name;

        //     Meio que fosse o contrutor da class ProducerBuilder
        public ProducerBuilder() {

        }

        public static ProducerBuilder builder() {
//         Cria uma nova instancia da classe usando new
            return new ProducerBuilder();
        }

        public ProducerBuilder name(String name) {
            this.name = name;
            return this;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producer producer = (Producer) o;
        return Objects.equals(id, producer.id) && Objects.equals(name, producer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Integer getId(Integer id) {
        return this.id;
    }

    public String getName(String name) {
        return this.name;
    }
}
