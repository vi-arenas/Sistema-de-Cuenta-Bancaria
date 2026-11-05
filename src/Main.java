public class Main {
    public static void main(String[] args){
        CuentaBancaria cuentaAna = new CuentaBancaria("00198765401", "Ana Gomez");

        CuentaBancaria cuentaCarlos = new CuentaBancaria("00145612302","Carlos Ruiz");

        CuentaBancaria cuentaEmpresa = new CuentaBancaria("00111223309","Tech Solutions SpA");

        // Operaciones sobre la cuenta de Ana
        cuentaAna.depositar(150_000);

        // Operaciones sobre la cuenta de Carlos
        cuentaCarlos.depositar(60_000);
        cuentaCarlos.retirar(15_000);

        // Operaciones sobre la cuenta Empresa
        cuentaEmpresa.depositar(5_200_000);

        System.out.println("Saldo Cuenta de Ana: " + cuentaAna.obtenerSaldo()); // $150.000
        System.out.println("Saldo Cuenta de Carlos: " + cuentaCarlos.obtenerSaldo()); // $45.000
        System.out.println("Saldo Cuenta Empresa: " + cuentaEmpresa.obtenerSaldo()); // $5.200.000
    }
}
