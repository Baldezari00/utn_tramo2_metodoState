package org.example;

public class Borrador implements EstadoDocumento{

    @Override
    public void publicarDocumento(Documento documento) {
        EstadoDocumento estadoDocumento = new Borrador();
        if (documento.getTipoUsuario().equals("administrador")){
           estadoDocumento = new Publicado();
        }else{
           estadoDocumento = new Moderacion();
        }

        documento.setEstadoDocumento(estadoDocumento);
    }
}
