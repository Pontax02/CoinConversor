package edu.estatuas.coinconversor.service;


import edu.estatuas.coinconversor.entity.Coin;
import org.springframework.stereotype.Service;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

@Service
public class CambioService {


    ObjectMapper objectMapper = new ObjectMapper();

    public double obtenerCambio(String from , String to , float cambio) throws IOException {

        String de = from;
        String a = to;

        URL link = new URL( "https://api.frankfurter.app/latest?from="+from+"&to="+to);
        Coin response = objectMapper.readValue(link.openStream(), Coin.class);

        return   cambio * response.getRates().get(to);



    }








}
