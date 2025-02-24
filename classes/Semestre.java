package classes;

import java.util.ArrayList;

public class Semestre {
    private String nome;
    private Boolean ativo;
    private ArrayList<IObserver> observadores;

    public Semestre(String nome, Boolean ativo){
        this.nome = nome;
        this.ativo = ativo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setAtivo(Boolean ativo){
        this.ativo = ativo;
        notifyObservers();
    }

    public Boolean getAtivo(){
        return ativo;
    }

    public void addObservadores(IObserver observer){
        observadores.add(observer);
    }

    public void removeObservadores(IObserver observer){
        observadores.remove(observer);
    }
    
    public void notifyObservers(){
        for(int i = 0 ; i < observadores.size(); i++){
            observadores.get(i).update(ativo);
        }
    }

}

