class CuentaBancaria {
    String numeroCuenta;
    String tipoCuenta;
    float saldo;
    
    //Creamos un constructor que asigne por defecto los valores para cada propiedad
    public CuentaBancaria(){
        this.numeroCuenta = "0000008191";
        this.tipoCuenta = "Anonima";
        this.saldo = 1000000f;
    }
    // Constructor parametrizado
    public CuentaBancaria(String numeroCuenta, String tipoCuenta){
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta; 
    }
    // Constructor sobrecargado
    public CuentaBancaria(String numeroCuenta, String tipoCuenta, float saldo){
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo; 
    }
    //sobrescritura del metodo toString
    @Override
    public String toString(){
        return "---- Cuenta Bancaria ---- \nNumero de cuenta = "+numeroCuenta+"\nTipo de Cuenta = "+ tipoCuenta+ " \nSaldo = "+saldo+"\n";
    }
}
