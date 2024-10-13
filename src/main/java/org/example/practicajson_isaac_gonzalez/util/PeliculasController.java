package org.example.practicajson_isaac_gonzalez.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.example.practicajson_isaac_gonzalez.clases.Pelicula;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class PeliculasController {

    @FXML
    private TextField directorTF;

    @FXML
    private TextField fechaTF;

    @FXML
    private TextField genTF;

    @FXML
    private ListView<Pelicula> listado;

    @FXML
    private TextField tituloTF;


    private Pelicula peliculaSleccionada;
    ObjectMapper objectMapper = new ObjectMapper();

    @FXML
    void onImportar(ActionEvent event) throws IOException {
        try {
            // Cargar los datos desde el archivo JSON
            List<Pelicula> peliculas = objectMapper.readValue(new File("src/main/resources/peliculas.json"), new TypeReference<List<Pelicula>>() {});
            // Limpiar el ListView actual
            listado.getItems().clear();
            // Agregar las peliculas al ListView
            listado.getItems().addAll(peliculas);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //metodo para meter los datos de un pelicula
    private void cargarProducto(Pelicula pelicula) {
        tituloTF.setText(pelicula.getTitulo());
        fechaTF.setText(pelicula.getFecha());
        directorTF.setText(pelicula.getDirector());
        genTF.setText(pelicula.getGenero());
    }

    //metodo para tener los datos de un producto seleccionado de la lista por el raton
    @FXML
    void seleccionarPelicula(MouseEvent event) {
        peliculaSleccionada = listado.getSelectionModel().getSelectedItem();
        cargarProducto(peliculaSleccionada);
    }
}