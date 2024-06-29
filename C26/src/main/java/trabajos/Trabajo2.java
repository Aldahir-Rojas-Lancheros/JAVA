package trabajos;

public class Trabajo2 {
    // Clase Vehiculo como clase interna estática
    public static class Vehiculo {
        // Atributos
        private String marca;
        private String modelo;
        private int anio;
        private double precio;

        // Constructor
        public Vehiculo(String marca, String modelo, int anio, double precio) {
            this.marca = marca;
            this.modelo = modelo;
            this.anio = anio;
            this.precio = precio;
        }

        // Métodos getters y setters para los atributos
        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public int getAnio() {
            return anio;
        }

        public void setAnio(int anio) {
            this.anio = anio;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        // Método toString para mostrar la información del vehículo
        @Override
        public String toString() {
            return "Vehiculo{" +
                    "marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", anio=" + anio +
                    ", precio=" + precio +
                    '}';
        }
    }

    public static void main(String[] args) {
        // Crear un objeto de tipo Vehiculo
        Vehiculo miVehiculo = new Vehiculo("Toyota", "Corolla", 2020, 20000.00);

        // Mostrar la información del vehículo
        System.out.println(miVehiculo);
    }
}
