/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fechas;

import Social_Media.RedesSociales;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 */
public class FechaCb {

    private Image ImagenFecha;
    private String festividad;

    public FechaCb(Image ImagenFecha, String festividad) {
        this.ImagenFecha = ImagenFecha;
        this.festividad = festividad;
    }

    public Image getImagenFecha() {
        return ImagenFecha;
    }

    public void setImagenFecha(Image ImagenFecha) {
        this.ImagenFecha = ImagenFecha;
    }

    public String getFestividad() {
        return festividad;
    }

    public void setFestividad(String festividad) {
        this.festividad = festividad;
    }

    public static List<FechaCb> obtenerFechas() {
        List<FechaCb> listaFechas = new ArrayList<>();
        listaFechas.add(new FechaCb(new Image(RedesSociales.class.getResourceAsStream("/Imagenes/calendario.png")), " Cumpleaños"));
        listaFechas.add(new FechaCb(new Image(RedesSociales.class.getResourceAsStream("/Imagenes/aniversario.png")), " Aniversario"));
        listaFechas.add(new FechaCb(new Image(RedesSociales.class.getResourceAsStream("/Imagenes/otro.png")), " Otro"));
        return listaFechas;
    }

    public static void configurarComboBoxConFechas(ComboBox<FechaCb> comboBox) {
        // Asegurarse de que el ComboBox no se haya cargado previamente
        if (comboBox.getItems().isEmpty()) {
            // Cargar datos en el ComboBox
            comboBox.getItems().addAll(FechaCb.obtenerFechas());

            // Configurar cómo se muestra cada item con una celda personalizada
            comboBox.setCellFactory(lv -> new ListCell<FechaCb>() {
                private final ImageView imageView = new ImageView();

                @Override
                protected void updateItem(FechaCb item, boolean empty) {
                    super.updateItem(item, empty);
                    if (empty || item == null) {
                        setText(null);
                        setGraphic(null);
                    } else {
                        imageView.setImage(item.getImagenFecha());
                        imageView.setFitWidth(16);
                        imageView.setFitHeight(16);
                        setText(item.getFestividad());
                        setGraphic(imageView);
                    }
                }
            });

            // Configurar cómo se muestra el item seleccionado en el botón del ComboBox
            comboBox.setButtonCell(new ListCell<FechaCb>() {
                private final ImageView imageView = new ImageView();

                @Override
                protected void updateItem(FechaCb item, boolean empty) {
                    super.updateItem(item, empty);
                    if (empty || item == null) {
                        setText(null);
                        setGraphic(null);
                    } else {
                        imageView.setImage(item.getImagenFecha());
                        imageView.setFitWidth(16);
                        imageView.setFitHeight(16);
                        setText(item.getFestividad());
                        setGraphic(imageView);
                    }
                }
            });
        }
    }

    @Override
    public String toString() {
        return festividad.trim();
    }

}
