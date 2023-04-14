package TodosFiltros;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CinzaAzul {
    public static BufferedImage apply(BufferedImage image) throws IOException {
        // Percorrer cada pixel
        int width = image.getWidth();
        int height = image.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // Pegando a informação do verde e distribuindo no rgb
                Color c = new Color(image.getRGB(x, y));
                int blue = c.getBlue();
                Color newCor = new Color(blue, blue, blue);
                image.setRGB(x, y, newCor.getRGB());
            }
        }
        //Salvando imagem se deu certo :)
        if (ImageIO.write(image,"png", new File("C:\\Users\\cauec\\Pictures\\Filtros\\cilzaAzul.png")))
            System.out.println("Imagem salva com sucesso");
        else System.out.println("Erro ao salvar a imagem");
        return image;
    }

}
