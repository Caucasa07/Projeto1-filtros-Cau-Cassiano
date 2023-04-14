package TodosFiltros;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Main {
    public static void main(String[] args) throws IOException {
        // Ler imagem
        File arquivo = new File("C:\\Users\\cauec\\Pictures\\Filtros\\baboon.png");
        // Aplicando os diversos filtros de cor

        BandaRed.apply(ImageIO.read(arquivo));
        BandaGreen.apply(ImageIO.read(arquivo));
        BandaBlue.apply(ImageIO.read(arquivo));
        CinzaMedia.apply(ImageIO.read(arquivo));
        CinzaVermelho.apply(ImageIO.read(arquivo));
        CinzaVerdade.apply(ImageIO.read(arquivo));
        CinzaAzul.apply(ImageIO.read(arquivo));
        Binarização.apply(ImageIO.read(arquivo));
        Tonalidade.apply(ImageIO.read(arquivo));
        BrilhoAditivo.apply(ImageIO.read(arquivo));
        BrilhoMultiplicativo.apply(ImageIO.read(arquivo));
        Negativo.apply(ImageIO.read(arquivo));
    }
}

