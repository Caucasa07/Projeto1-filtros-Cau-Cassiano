package TodosFiltros;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Binarização {
    public static BufferedImage apply(BufferedImage image) throws IOException {
        // Percorrer cada pixel e aplicar
        int width = image.getWidth();
        int height = image.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // Fazendo media
                Color c = new Color(image.getRGB(x, y));
                int red = c.getRed();
                int green = c.getGreen();
                int blue = c.getBlue();
                int media = (red + green + blue)/3;
                // se a media for maior que 127 o pixel fica branco, se não, ele fica preto
                if (media > 127) {
                    Color Branco = new Color(255, 255, 255);
                    image.setRGB(x, y, Branco.getRGB());
                }
                else {
                    Color preto = new Color(0, 0, 0);
                    image.setRGB(x, y, preto.getRGB());
                }
            }
        }
        //Salvando imagem se deu certo :)
        if (ImageIO.write(image,"png", new File("C:\\Users\\cauec\\Pictures\\Filtros\\binarizado.png")))
            System.out.println("Imagem salva com sucesso");
        else System.out.println("Erro ao salvar a imagem");
        return image;
    }
}
