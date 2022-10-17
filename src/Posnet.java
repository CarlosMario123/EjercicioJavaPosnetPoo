public class Posnet {


    public Ticket EfectuarPago(Tarjeta tarjeta,double saldo,byte cuotas){
        double montofinal = 0;
        Ticket ticket = null;

        if(DatosValido(tarjeta,saldo,cuotas)){
          montofinal = saldo + (saldo * recargo(cuotas));
            if(tarjeta.ComprobarSaldoDisponible(montofinal)){
              tarjeta.Descontar(montofinal);
              double montoPorCuota = montofinal / cuotas;
              ticket = new Ticket(tarjeta.NombreCompleto(),montofinal,montoPorCuota);
            }
        }
        return ticket;
    }

    public boolean DatosValido(Tarjeta tar,double saldo,byte cuotas){
        boolean esTarjetaValida = tar != null;
        boolean esMontoValido = saldo > 0;
        boolean validarCuotas = cuotas >= 1 && cuotas <= 6;

        return  esMontoValido && esTarjetaValida && validarCuotas;
    }

    private double recargo(byte cuotas){
      return (cuotas -1) * 0.33;
    }
}
