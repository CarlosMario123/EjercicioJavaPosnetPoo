public class Ticket {
    private String nombreApellido;
    private double MontaTotal;
    private double montoPorCuota;

    public Ticket(String nombreApellido, double montaTotal, double montoPorCuota) {
        this.nombreApellido = nombreApellido;
        MontaTotal = montaTotal;
        this.montoPorCuota = montoPorCuota;
    }

    public String MostarInformacion(){
        return "Nombre del titular " + nombreApellido +
                "\nMonto total: " + MontaTotal +
                "\n Monto por cuota: " + montoPorCuota;
    }
}
