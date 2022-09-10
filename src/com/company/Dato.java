
    package com.company;

    public abstract class Dato implements Operacion {

        @Override
        public String eliminar() {
            return "estoy eliminado la base de datos Oracle";
        }

        @Override
        public String consultar() {return "Consultar la base de datos oracla";
        }

        @Override
        public String conectar() {return "Se conecta a la base de datos oracla";
        }

        @Override
        public String insertar() {
            return "Se Inserta a la base de datos oracla";
        }


    }
