package com.aluracursos.Screenmatch.Service;

public interface IConvierteDatos {

     <T> T obtenerDatos(String json, Class<T> clase);

}
