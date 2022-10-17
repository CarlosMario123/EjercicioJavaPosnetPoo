public class Main {
    public static void main(String[] args) {
      Ticket ticket;
     Posnet posnet = new Posnet();
     Persona persona = new Persona("Carlos","Ruiz","124224","96123245324","catoMAro@email.com");
     Tarjeta tarjeta = new Tarjeta(EntidadFinaciera.BIRZA,"13424524",500000.0,persona);

     ticket = posnet.EfectuarPago(tarjeta,5000.0, (byte) 1);
        System.out.println(ticket.MostarInformacion());

    }
}