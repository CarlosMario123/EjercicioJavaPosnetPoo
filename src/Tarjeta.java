public class Tarjeta {
    private EntidadFinaciera entidad;
    private String numeroDeTarjeta;
    private Double saldo;
    private Persona titular;

    public Tarjeta(EntidadFinaciera entidad, String numeroDeTarjeta, Double saldo, Persona titular) {
        this.entidad = entidad;
        this.numeroDeTarjeta = numeroDeTarjeta;
        this.saldo = saldo;
        this.titular = titular;
    }

    //aca comprobara el sin tiene saldo para cierta cantida de dinero
    public boolean ComprobarSaldoDisponible(double valor){
       return saldo >= valor;
    }

    public void Descontar(double valor){
        saldo = saldo - valor;
    }

    public String NombreCompleto(){
        return  titular.DarNombreCompleto();
    }
}
