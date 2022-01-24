/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobservador2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlo
 */
public class ObservableConcreto implements IObservable{
private List<IObserver>observadores=new ArrayList<IObserver>();
    @Override
    public void notificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(IObserver observer) {
       this.observadores.add(observer); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarObservador(IObserver observer) {
        this.eliminarObservador(observer);
    }
    
}
