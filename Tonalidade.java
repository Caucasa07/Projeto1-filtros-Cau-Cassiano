package TodosFiltros;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Tonalidade {
    public static BufferedImage apply(BufferedImage image) throws IOException {
        // Percorrer cada pixel
        int width = image.getWidth();
        int height = image.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // pegando os velores das cores
                Color c = new Color(image.getRGB(x, y));
                int red = c.getRed();
                int green = c.getGreen();
                int blue = c.getBlue();
                // adicionamdo o valor 50 no vermelho
                red += 50;
                // limitando o tom vermelho pra nao estourar
                if (red > 255){
                    red = 255;
                }
                Color newCor = new Color(red, green, blue);
                image.setRGB(x, y, newCor.getRGB());
            }
        }
        //Salvando imagem se deu certo :)
        if (ImageIO.write(image,"png", new File("C:\\Users\\cauec\\Pictures\\Filtros\\tonalidadeVermelho.png")))
            System.out.println("Imagem salva com sucesso");
        else System.out.println("Erro ao salvar a imagem");
        return image;
    }
}
