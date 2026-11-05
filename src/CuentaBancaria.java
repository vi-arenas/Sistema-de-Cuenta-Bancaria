public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private int saldo;

    public CuentaBancaria(String numeroCuenta, String titular){
        setNumeroCuenta(numeroCuenta);
        setTitular(titular);
        this.saldo = 0;
    }

    // Setters
    public void setNumeroCuenta(String numeroCuenta){
        if(numeroCuenta == null || numeroCuenta.trim().isEmpty()){
            throw new IllegalArgumentException("Error: El numero de cuenta no puede ser nulo ni esta vacio");
        }else if(numeroCuenta.length() != 11){
            throw new IllegalArgumentException("Error: El numero de cuenta debe tener 11 caracteres");
        }
        this.numeroCuenta = numeroCuenta;
    }

    public void setTitular(String titular){
        if(titular == null || titular.trim().isEmpty()){
            throw new IllegalArgumentException("Error: El nombre del titular no puede ser nulo ni estar vacio");
        }else if(titular.length() < 3){
            throw new IllegalArgumentException("Error: El nombre es muy corto");
        }
        this.titular = titular;
    }

    // Getters
    public String getNumeroCuenta(){ return  numeroCuenta; }

    public String getTitular(){ return titular; }

    public int getSaldo(){
        return saldo;
    }

    public void depositar(int monto){
        if(monto <= 0) {
            throw new IllegalArgumentException("Error: El monto ingresado debe ser mayor a cero");
        }
        saldo = saldo + monto;
    }

    public void retirar(int monto){
        if(monto < 0 || saldo - monto < 0){
            throw new IllegalArgumentException("Error: No se puede retirar el monto ingresado");
        }
        saldo = saldo - monto;
    }

    public String obtenerSaldo(){
        return String.format("$%d",saldo);
    }
}
