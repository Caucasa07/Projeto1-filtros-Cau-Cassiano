package TodosFiltros;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CinzaMedia {
    public static BufferedImage apply(BufferedImage image) throws IOException {
        // Percorrer cada pixel e aplicar a transformação de cor
        int width = image.getWidth();
        int height = image.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // Fazendo media e trocando rgb para a media
                Color c = new Color(image.getRGB(x, y));
                int red = c.getRed();
                int green = c.getGreen();
                int blue = c.getBlue();
                int media = (red + green + blue)/3;
                Color newCor = new Color(media, media, media);
                image.setRGB(x, y, newCor.getRGB());
            }
        }
        //Salvando imagem se deu certo :)
        if (ImageIO.write(image,"png", new File("C:\\Users\\cauec\\Pictures\\Filtros\\cinzaMedia.png")))
            System.out.println("Imagem salva com sucesso");
        else System.out.println("Erro ao salvar a imagem");
        return image;
    }
}
