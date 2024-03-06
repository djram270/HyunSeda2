/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.hyunseda.domain.services;
//import com.mycompany.commonhyunseda.IPayPlugin;
//import com.mycompany.commonhyunseda.Payment;

/**
 *
 * @author Oscar
 */
public class PayServices implements IPayService {
    
    //private IPayPlugin payPlugin;

    public PayServices(String providerName) {
      // Aquí llaman a la fábrica para instanciar el plugin correspondiente providerName   
    }
    
    /*public boolean pay(Payment payment){
        return payPlugin.pay(payment);
    }*/
}
