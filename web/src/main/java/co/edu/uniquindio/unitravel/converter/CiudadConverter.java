package co.edu.uniquindio.unitravel.converter;

import co.edu.uniquindio.unitravel.entidades.Ciudad;
import co.edu.uniquindio.unitravel.servicios.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import java.io.Serializable;

@Component
public class CiudadConverter implements Serializable, Converter<Ciudad> {

    @Autowired
    private ClienteServicio clienteServicio;

    @Override
    public Ciudad getAsObject(FacesContext context, UIComponent component, String value) {

        try {
            Ciudad ciudad = clienteServicio.obtenerCiudad(Integer.parseInt(value));
            return ciudad;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Ciudad value) {
        if (!value.equals(null)) {
            return Integer.toString(value.getCodigo());
        }
        return "";
    }
}