package TodosFiltros;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Negativo {
    public static BufferedImage apply(BufferedImage image) throws IOException {
        // Percorrer cada pixel
        int width = image.getWidth();
        int height = image.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // Pegando os valores das cores
                Color c = new Color(image.getRGB(x, y));
                int red = c.getRed();
                int green = c.getGreen();
                int blue = c.getBlue();
                // subitraindo 255 pelas coras para dar o negativo da quela cor
                red = 255 - red;
                green = 255 - green;
                blue = 255 - blue;
                Color newCor = new Color(red, green, blue);
                image.setRGB(x, y, newCor.getRGB());
            }
        }
        //Salvando imagem se deu certo :)
        if (ImageIO.write(image,"png", new File("C:\\Users\\cauec\\Pictures\\Filtros\\Negativo.png")))
            System.out.println("Imagem salva com sucesso");
        else System.out.println("Erro ao salvar a imagem");
        return image;
    }
}
