package com.bdc.mvvm_example.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.bdc.mvvm_example.model.Producto

//Creamos una clase ProductoViewModel que hereda de la clase ViewModel()
class ProductoViewModel : ViewModel() {

    var productos by mutableStateOf<List<Producto>>(emptyList())
        private set

    //init se ejecuta cuando se crea una instancia de la clase
    //En este caso, cuando se inicialice la clase ProductoViewModel, se llamará a la función cargarProductos()
    init {
        cargarProductos()
    }


    //Función que simula la carga de productos de una API
    private fun cargarProductos() {
        productos = listOf(
            Producto(1, "Laptop HP", 350.0),
            Producto(2, "Smartphone Samsung", 250.0),
            Producto(2, "Tablet Lenovo", 150.0)
        )

    }

}