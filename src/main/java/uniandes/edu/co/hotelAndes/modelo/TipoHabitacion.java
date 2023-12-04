package uniandes.edu.co.hotelAndes.modelo;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Document("TipoHabitacion")
public class TipoHabitacion {


        @Id
        private Integer id;

        private String tipo;

        
        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public TipoHabitacion() {
                // Constructor vacío requerido por Spring Data MongoDB
        }

        public TipoHabitacion(String tipo) {
                this.tipo = tipo;
        }

        public String getTipo() {
                return tipo;
        }

        public void setTipo(String tipo) {
                this.tipo = tipo;
        }

        @Override
        public String toString() {
                return "TipoHabitacion{" +
                        "tipo='" + tipo + '\'' +
                        '}';
        }
}
