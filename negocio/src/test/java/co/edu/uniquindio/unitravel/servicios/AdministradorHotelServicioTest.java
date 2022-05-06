package co.edu.uniquindio.unitravel.servicios;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import javax.transaction.Transactional;

@Transactional
@SpringBootTest
public class AdministradorHotelServicioTest {

    @Autowired
    private AdministradorHotelServicio administradorHotelServicio;

    @Test
    @Sql("classpath:dataset.sql")
    public void validarLoginTest(){

    }

}
