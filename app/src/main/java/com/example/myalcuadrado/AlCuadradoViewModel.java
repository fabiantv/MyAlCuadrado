package com.example.myalcuadrado;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AlCuadradoViewModel extends ViewModel {

    public Object getResultado;
    private MutableLiveData<String> resultado;
    public AlCuadradoViewModel(){
        resultado = new MutableLiveData<>();
    }
    public LiveData<String>getResultado(){
        return resultado;
    }
    public void alCuadrado(String data){
        resultado.setValue(AlCuadradoUseCase.alCuadrado(data));
    }
}
