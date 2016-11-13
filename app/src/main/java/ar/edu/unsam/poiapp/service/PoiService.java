package ar.edu.unsam.poiapp.service;

import java.util.List;

import ar.edu.unsam.poiapp.domain.Poi;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by JD on 13/11/2016.
 */

public interface PoiService {


//    @GET("peliculas/{tituloContiene}")
//    public Call<List<Pelicula>> getPeliculas(@Path("tituloContiene") String tituloContiene);

//    @GET("buscador/{nombre}")
//    public Call<List<Poi>> getPois(@Path("nombre") String nombre);

    @GET("/buscador")
    Call<List<Poi>> getPois();

}

