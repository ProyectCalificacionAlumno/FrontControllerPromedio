/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.frontcontroller;

/**
 *
 * @author omarp
 */
public class FrontController {
    
       private Dispatcher dispatcher;
    
    public FrontController(){
      dispatcher = new Dispatcher();
   }

   private boolean isAuthenticUser(){
      System.out.println("El Usuario se Autentico Satisfactoriamente.");
      return true;
   }

   private void trackRequest(String request){
      System.out.println("Petición de la Pagina: " + request);
   }
    public void dispatchRequest(String request){
      
      trackRequest(request);
   
      if(isAuthenticUser()){
         dispatcher.dispatch(request);
      }	
   }
}
