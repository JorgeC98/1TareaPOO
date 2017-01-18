/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjeta.de.credito;

/**
 *
 * @author JorgeRicardo
 */
public class tarjeta{
  private float numeroDeTarjeta;
  private int codigoDeSeguridad;
  private String fechaDeVencimiento;
  private String banco;
  private String marca;
  private String color;
  private float saldo;

public tarjeta() {
numeroDeTarjeta = 3452764864830854f ;
codigoDeSeguridad = 372;
fechaDeVencimiento = "12/18";
banco = "Santander";
marca = "MasterCard";
color = "Dorada";
saldo = 3000f ;
}

public tarjeta(float numeroDeTarjeta, int codigoDeSeguridad, String fechaDeVencimiento, String banco, String marca, String color) { 
this.numeroDeTarjeta = numeroDeTarjeta;
this.codigoDeSeguridad = codigoDeSeguridad;
this.fechaDeVencimiento = fechaDeVencimiento;
this.banco = banco;
this.marca = marca;
this.color = color;
this.saldo = saldo;
}

public float getNumeroDeTarjeta(){
        return this.numeroDeTarjeta;
    }
    public boolean setNumeroDeTarjeta(int numeroDeTarjeta){
        /* La cuenta no puede tener un egreso negativo por lo que un valor menor a 0 no es aceptable */ 
        if(numeroDeTarjeta <0){
            return false;
        }else{
            this.numeroDeTarjeta = numeroDeTarjeta;
            return true;
        }
    }
   
public int getCodigoDeSeguridad(){
        return this.codigoDeSeguridad;
    }
    public boolean setCodigoDeSeguridad(int codigoDeSeguridad){
        /* La cuenta no puede tener un egreso negativo por lo que un valor menor a 0 no es aceptable */ 
        if(saldo <0){
            return false;
        }else{
            this.codigoDeSeguridad = codigoDeSeguridad;
            return true;
        }
    }

public float getSaldo(){
        return this.saldo;
    }
    public boolean setSaldo(float saldo){
        /* La cuenta no puede tener un egreso negativo por lo que un valor menor a 0 no es aceptable */ 
        if(saldo <0){
            return false;
        }else{
            this.saldo = saldo;
            return true;
        }
    }
    
         public String getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }
    public void setFechaDeVencimiento(String fechaDeVencimiento) {
        /* Si el usuario envia una cadena vacia o null, la propiedad 
        tendra el valor "Sin contenido definido"; de lo contrario, tomara 
        el valor enviado en el mensaje */
        if ((fechaDeVencimiento == null) || (fechaDeVencimiento == "")){
             this.fechaDeVencimiento = "sin valor definido";
          }else {
             this.fechaDeVencimiento = fechaDeVencimiento;
        }
    }
    
          public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        /* Si el usuario envia una cadena vacia o null, la propiedad 
        tendra el valor "Sin contenido definido"; de lo contrario, tomara 
        el valor enviado en el mensaje */
        if ((banco == null) || (banco == "")){
             this.banco = "sin valor definido";
          }else {
             this.banco = banco;
        }
    }
    
              public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        /* Si el usuario envia una cadena vacia o null, la propiedad 
        tendra el valor "Sin contenido definido"; de lo contrario, tomara 
        el valor enviado en el mensaje */
        if ((marca == null) || (marca == "")){
             this.marca = "sin valor definido";
          }else {
             this.marca = marca;
        }
    }
    
              public String getColor() {
        return banco;
    }
    public void setColor(String color) {
        /* Si el usuario envia una cadena vacia o null, la propiedad 
        tendra el valor "Sin contenido definido"; de lo contrario, tomara 
        el valor enviado en el mensaje */
        if ((color == null) || (color == "")){
             this.color = "sin valor definido";
          }else {
             this.color = color;
        }
    }
}

