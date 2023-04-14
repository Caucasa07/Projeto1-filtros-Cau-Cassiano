package TodosFiltros;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BrilhoMultiplicativo {
    public static BufferedImage apply(BufferedImage image) throws IOException {
        // Percorrer cada pixel e aplicar a transformação de cor
        int width = image.getWidth();
        int height = image.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // Pegando os valores das cores e multiplicando eles por 2 e limitando tbm
                Color c = new Color(image.getRGB(x, y));
                int red = c.getRed();
                int green = c.getGreen();
                int blue = c.getBlue();
                red *= 2;
                if (red > 255){
                    red = 255;
                }
                green *= 2;
                if (green > 255){
                    green = 255;
                }
                blue *= 2;
                if (blue > 255){
                    blue = 255;
                }

                Color newCor = new Color(red, green, blue);
                image.setRGB(x, y, newCor.getRGB());
            }
        }
        //Salvando imagem se deu certo :)
        if (ImageIO.write(image,"png", new File("C:\\Users\\cauec\\Pictures\\Filtros\\brilhoMultiplicativo.png")))
            System.out.println("Imagem salva com sucesso");
        else System.out.println("Erro ao salvar a imagem");
        return image;
    }
}
